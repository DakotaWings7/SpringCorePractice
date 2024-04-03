package ru.aliev.springcourse;

public class MusicPlayer {
    private Music music;

    public MusicPlayer() {
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Playing: " + music.getSong());
    }
}
