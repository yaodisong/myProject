package com.pps.adapterdemo;

public class AudioMediaPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void playMedia(String type, String fileName) {
        if(type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(type);
            mediaAdapter.playMedia(type,fileName);
        }else {
            System.out.println("播放类型为"+type+"的文件"+fileName);
        }
    }
}
