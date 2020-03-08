package com.pps.adapterdemo;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String type){
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcMediaPlayer();
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4MediaPlayer();
        }
    }
    @Override
    public void playMedia(String type, String fileName) {
        if(type.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(type.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
