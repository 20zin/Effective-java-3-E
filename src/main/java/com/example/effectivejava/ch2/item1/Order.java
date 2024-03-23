package com.example.effectivejava.ch2.item1;


/**
 * 생성자 대신 정적 팩토리 메소드를 고려하라
 */
public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;
    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }

    //원하는 객체의 특징을 잘표현하는 메소드를 생성할수있다 <- 생성자의 signature가 중복되는 경우
}
