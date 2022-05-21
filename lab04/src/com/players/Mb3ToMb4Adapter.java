package com.players;

public class Mb3ToMb4Adapter implements IMediaPlayer {

    private IAudioPlayer mb3;

    public Mb3ToMb4Adapter(IAudioPlayer mb3){
        this.mb3 = mb3;
    }

    @Override
    public void playMb4() {
        System.out.println("play Mb3 in Mb4");
    }
}
