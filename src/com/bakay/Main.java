package com.bakay;

public class Main{
    public static void main(String[] args){
    Basket basket = new Basket();
    Tulips tulip1 = new Tulips(10, 15.5 ,true, "pink");
    Tulips tulip2 = new Tulips(13, 10.5, false, "yellow");
    Roses rose1 = new Roses(11, 19, true, "red");
    Roses rose2 = new Roses(18, 25,  false,"pink");
        basket.addFlower(tulip1,tulip2, rose1,rose2);
        System.out.println(basket);
        System.out.println(basket.sortByFreshness());
        System.out.println(basket.getPriceOfBasket());
        System.out.println(basket.getFlowerInRange(11, 15));
}}
