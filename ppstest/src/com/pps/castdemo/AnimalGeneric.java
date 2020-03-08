package com.pps.castdemo;

public class AnimalGeneric implements Generator<String> {
    @Override
    public String next() {
        return "success";
    }
}
