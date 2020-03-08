package com.pps.adapterdemo;

public class AdapterTest {
    public static void main(String[] args) {
        AudioMediaPlayer audioPlayer = new AudioMediaPlayer();

        audioPlayer.playMedia("mp3", "beyond the horizon.mp3");
        audioPlayer.playMedia("mp4", "alone.mp4");
        audioPlayer.playMedia("vlc", "far far away.vlc");
        audioPlayer.playMedia("avi", "mind me.avi");
    }
}
