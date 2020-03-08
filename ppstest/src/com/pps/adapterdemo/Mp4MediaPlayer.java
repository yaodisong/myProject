package com.pps.adapterdemo;

public class Mp4MediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放"+fileName);
    }
}
