package com.pps.internetdemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        Client c = new Client();
        c.client();
    }
    public void client(){
        Socket s = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            //创建一个Socket对象，通过构造器指明服务端的IP地址，以及其接受程序的端口号
            s = new Socket(InetAddress.getByName("127.0.0.1"),1234);
            //发送数据，方法返回OutputStream对象
            os = s.getOutputStream();
            //数据输出
            os.write("我是客户端！请求连接！".getBytes());
            //结束数据输出
            s.shutdownOutput();
            //接受数据
            is = s.getInputStream();
            byte[] b = new byte[20];
            int len;
            while((len = is.read(b)) != -1){
                String str = new String(b,0,len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //关闭对应的流及其相关资源
            if(os != null){
                try {
                    os.close();
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
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
