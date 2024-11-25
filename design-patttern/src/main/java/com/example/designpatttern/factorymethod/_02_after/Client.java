package com.example.designpatttern.factorymethod._02_after;

public class Client {

    public static void main(String[] args) {

        Ship whiteShip = new WhiteshipFactory().orderShip("whiteShip", "lee.yj@usfae.co.kr");
        System.out.println(whiteShip);
//
        Ship blackShip = new BlackshipFactory().orderShip("blackShip", "leeelkuahselkujhf@@@");
        System.out.println(blackShip);

//        Ship blackship = WhiteshipFactory.orderShip("Blackship", "keesun@mail.com");
//        System.out.println(blackship);
    }

}
