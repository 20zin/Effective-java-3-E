package com.example.effectivejava.ch2.item1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloService helloService(){
        return new KoreanHelloService();
    }
}
