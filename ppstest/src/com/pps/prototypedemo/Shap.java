package com.pps.prototypedemo;

public abstract class Shap implements Cloneable{
    private int id;

    protected String type;

    abstract void draw();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public Shap clone(){
        Shap clone = null;
        try {
            clone = (Shap) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
