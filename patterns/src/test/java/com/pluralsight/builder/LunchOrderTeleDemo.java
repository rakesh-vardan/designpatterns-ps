package com.pluralsight.builder;

public class LunchOrderTeleDemo {

    public static void main(String[] args) {

        LunchOrderTele lunchOrder = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");

//        lunchOrder.setBread("Wheat");
//        lunchOrder.setCondiments("Lettuce");
//        lunchOrder.setDressing("Mustard");
//        lunchOrder.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
