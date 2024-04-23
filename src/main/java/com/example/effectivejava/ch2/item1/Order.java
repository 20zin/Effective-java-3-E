package com.example.effectivejava.ch2.item1;


/**
 * 생성자 대신 정적 팩토리 메소드를 고려하라
 */
public class Order {

    private boolean prime;
    private boolean urgent;
    private Product product;

    private int status = 200;

    private final int PREPARING = 0;
    private final int SHIPPED = 2;

    private OrderStatus orderStatus = OrderStatus.DELIVERED;

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

    public static void main(String[] args) {
        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERED){ //equals는 NPE
            System.out.println("delivered");
        }
    }

    //원하는 객체의 특징을 잘표현하는 메소드를 생성할수있다 <- 생성자의 signature가 중복되는 경우
}
