package com.example.effectivejava.ch2.item1;

import java.util.Set;

public class Product {

    private String name;
    private Long id;

    public Product(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    Settings settings = Settings.getInstance();

}
