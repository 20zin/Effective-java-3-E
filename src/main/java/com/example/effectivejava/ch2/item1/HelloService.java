package com.example.effectivejava.ch2.item1;

public interface HelloService {

    String hello();

    static String hi(){
        prepareMessage();
        return "hi";
    }
    static private void prepareMessage(){
    }

    static String hi1(){
        return "hi";
    }
    static String hi2(){
        return "hi";
    }

    static String bye(){
        return "bye";
    }

}
