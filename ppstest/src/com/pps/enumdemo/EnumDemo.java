package com.pps.enumdemo;

public enum  EnumDemo {

    MON(1),TUS(2),WEN(3),THU(4),FRI(5),SAT(6){
        public boolean isRest(){
            return true;
        }

    },SUN(0){
        public boolean isRest(){
            return true;
        }
    };

    private int value;

    EnumDemo(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void doit(EnumDemo e){

        switch (e){
            case MON:
                System.out.println("星期一");
                break;
            case TUS:
                System.out.println("星期二");
                break;
            case WEN:
                System.out.println("星期三");
                break;
            case THU:
                System.out.println("星期四");
                break;
            case FRI:
                System.out.println("星期五");
                break;
            case SAT:
                System.out.println("星期六");
                break;
            case SUN:
                System.out.println("星期天");
                break;
            default:
                break;
        }
    }

}
