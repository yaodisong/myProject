package com.pps.Proxydemo;

public class ProxyCircle implements Shap{

    private Shap shap;

    public ProxyCircle(){

    }

    public ProxyCircle(Shap shap){
        this.shap = shap;
    }


    @Override
    public void draw() {
        this.shap.draw();
    }

    @Override
    public void descrip() {
        System.out.println("shapProxy");
    }
}
