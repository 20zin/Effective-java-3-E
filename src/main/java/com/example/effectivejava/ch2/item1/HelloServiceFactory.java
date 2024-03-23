package com.example.effectivejava.ch2.item1;

import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    public static void main(String[] args) {
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> first = loader.findFirst();
        //정적 팩토리 메소드가 있는 상태에서 인터페이스의 구현체가 없어도 된다.
        first.ifPresent(h -> {
            System.out.println(h.hello());
        });
    }
}
