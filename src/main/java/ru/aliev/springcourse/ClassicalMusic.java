package ru.aliev.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {

    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        return "Una mattina";
    }
}
