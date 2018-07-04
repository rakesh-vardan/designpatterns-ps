package com.pluralsight.builder;

public class LunchOrderBeanDemo {

    public static void main(String[] args) {
        /*
          Using this approach we can create an object but there are problems like:
          1. it is not immutable
          2. there is no contract as to what a valid lunch order !
         */
        LunchOrderBean lunchOrder = new LunchOrderBean();

        //commenting these setters, and preparing a lunch order still works !
        lunchOrder.setBread("Wheat");
        lunchOrder.setCondiments("Lettuce");
        lunchOrder.setDressing("Mustard");
        lunchOrder.setMeat("Ham");

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
