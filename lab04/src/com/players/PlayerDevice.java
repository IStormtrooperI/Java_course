package com.players;

public class PlayerDevice implements IAudioPlayer {
    @Override
    public void playMb3() {
        System.out.println("play Mb3");
    }

    public void playMb4(IMediaPlayer mediaPlayer){
        mediaPlayer.playMb4();
    }
}
