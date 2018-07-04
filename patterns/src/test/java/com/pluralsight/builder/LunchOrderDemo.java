package com.pluralsight.builder;

public class LunchOrderDemo {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        //builder.bread("Wheat").condiments("Lettuce").dressing("Mustard").meat("Ham");
        builder.bread("Wheat").dressing("Mustard").meat("Ham");
        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());

    }
}
