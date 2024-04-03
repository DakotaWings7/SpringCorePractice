package ru.aliev.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {
    }

    public MusicPlayer(List<Music> music) {
        this.musicList = music;
    }

    public void setMusic(List<Music> music) {
        this.musicList = music;
    }

    public void play() {
        musicList.forEach(m -> System.out.println("Playing: " + m.getSong()));
    }
}
