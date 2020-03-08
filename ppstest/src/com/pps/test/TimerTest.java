package com.pps.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Date;

public class TimerTest {
    public static void main(String[] args) {
//        Timer t = new Timer(1000, new java.awt.event.ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("time is" + new Date());
//                Toolkit.getDefaultToolkit().beep();
//            }
//
//        });
        //上面方法的拉姆表达式写法
        Timer t1 = new Timer(1000, event -> {
            System.out.println("time is" + new Date());
            Toolkit.getDefaultToolkit().beep();
        });
//        t.start();
        t1.start();
        JOptionPane.showMessageDialog(null,"Quit program?");
        System.exit(0);
    }
}
