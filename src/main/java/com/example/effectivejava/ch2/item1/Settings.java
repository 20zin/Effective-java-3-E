package com.example.effectivejava.ch2.item1;

import java.util.ArrayList;
import java.util.List;

/**
 * 이 클래스의 인스턴스는 getInstance()를 사용한다
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    public Settings() {} //private 선언 -> 외부로 인스턴스 여러개로 생성안됨

    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty) {
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance(){
        return SETTINGS;
    }

    //생성자를 public으로 선언할 사용하는 쪽에서 객체를 마음대로 생성가능함

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List.of("영진", "asd");
    }
}
