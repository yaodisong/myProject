package com.pps.internetdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        Server s = new Server();
        s.server();
    }
    public void server(){
        ServerSocket ss = null;
        Socket s = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            //创建一个ServerSocket 对象，并指明端口号
            ss = new ServerSocket(1234);
            System.out.println("服务端已启动，等待客户端连接！");
            //调用accept()方法，返回一个Socket的对象
            s = ss.accept();
            //调用Socket对象的getInputStream()方法获取一个从客户端发送过来的输入流
            is = s.getInputStream();
            //对获取的输入流进行操作
            byte[] b = new byte[20];
            int len;
            while((len = is.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.println(str);
            }
            //向客户端返回信息
            os = s.getOutputStream();
            os.write("已收到请求！".getBytes());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //关闭对应的流及其相关的资源
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(s != null){
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ss != null){
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(os != null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
