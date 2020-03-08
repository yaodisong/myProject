package com.how2java.springboot.test;

import com.how2java.springboot.webservice.MyService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WebServiceTest {

    public static void main(String[] args) {
//        serviceClient();
        httpClient();
    }
    /*
    * service编程调用方式
    * */
    public static void serviceClient(){
        // 创建WSDL的URL，注意不是服务地址
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8090/demo/api?wsdl");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        // 创建服务名称
        // 1.namespaceURI - 命名空间地址
        // 2.localPart - 服务视图名
        QName qname = new QName("http://webservice.springboot.how2java.com", "MyService");

        // 创建服务视图
        // 参数解释：
        // 1.wsdlDocumentLocation - wsdl地址
        // 2.serviceName - 服务名称
        Service service = Service.create(url, qname);
        // 获取服务实现类
        MyService myService = service.getPort(MyService.class);
        // 调用查询方法
        String result = myService.helloWebService();
        System.out.println(result);
    }
    /*
    * HttpURLConnection 调用方式
    * */
    public static void httpClient(){
        try{
            // 第一步：创建服务地址，不是WSDL地址
            URL url = new URL("http://127.0.0.1:8090/demo/api?wsdl");
            // 第二步：打开一个通向服务地址的连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // 第三步：设置参数
            // 3.1发送方式设置：POST必须大写
            connection.setRequestMethod("POST");
            // 3.2设置数据格式：content-type
            connection.setRequestProperty("content-type", "text/xml;charset=utf-8");
            // 3.3设置输入输出，因为默认新创建的connection没有读写权限，
            connection.setDoInput(true);
            connection.setDoOutput(true);

            // 第四步：组织SOAP数据，发送请求
            String soapXML = getXML();
            OutputStream os = connection.getOutputStream();
            os.write(soapXML.getBytes());
            // 第五步：接收服务端响应，打印
            int responseCode = connection.getResponseCode();
            // 表示服务端响应成功
            if(200 == responseCode){
                InputStream is = connection.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                StringBuilder sb = new StringBuilder();
                String temp = null;
                while(null != (temp = br.readLine())){
                    sb.append(temp);
                }
                System.out.println(sb.toString());

                is.close();
                isr.close();
                br.close();
            }

            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static String getXML(){
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                +"<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
                +"<soap:Body>"
//                +"<getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">"
//                +"<mobileCode>"+phoneNum+"</mobileCode>"
//                +"<userID></userID>"
//                +"</getMobileCodeInfo>"
                +"</soap:Body>"
                +"</soap:Envelope>";
        return soapXML;
    }
}
