package com.pps.adapterdemo;

public class VlcMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("播放"+fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
