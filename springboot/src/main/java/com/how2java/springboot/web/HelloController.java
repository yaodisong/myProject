package com.how2java.springboot.web;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

import com.how2java.springboot.redis.RedisService;
import com.how2java.springboot.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/radisTest")
    @ResponseBody
    public String redisTest(){

        redisService.set("session","123");
        return redisService.get("session");
    }

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));

    	 new Thread(() -> {
            int bitPrice = 100000;
            while(true){
                //每隔1-3秒就产生一个新价格
                int duration = 1000+new Random().nextInt(2000);
                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //新价格围绕100000左右50%波动
                float random = 1+(float) (Math.random()-0.5);
                int newPrice = (int) (bitPrice*random);

                //查看的人越多，价格越高
                int total = WebSocketServer.getOnlineCount();
                newPrice = newPrice*total;

                String messageFormat = "{\"price\":\"%d\",\"total\":%d}";
                String message = String.format(messageFormat, newPrice,total);
                //广播出去
                try {
                    WebSocketServer.sendInfo(message);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        return "hello";
    }

    /*
    * 单个控制器的统一异常处理
    * */
    @ExceptionHandler
    public String doError(Exception ex) throws Exception{

        ex.printStackTrace();
        return ex.getMessage();

    }
    
    
}
