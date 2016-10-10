package com.bakay;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Flower> allFlow = new ArrayList();
    private int priceOfBasket = 0;

    public void addFlower(Flower... nw) {

        for(Flower i: nw){
            allFlow.add(i);
            priceOfBasket += i.price;
        }
    }

    public  ArrayList<Flower> sortByFreshness() {
        ArrayList<Flower> myList = new ArrayList<>();
        for (Flower flower : this.allFlow) {
            if (flower.fresh) {
                myList.add(0, flower);
            }
            else {
                myList.add(flower);

            }
        }
        this.allFlow = myList;
        return allFlow;
    }
    public int getPriceOfBasket(){
        return this.priceOfBasket;
    }
    public ArrayList<Flower> getFlowerInRange(int s, int e){
        ArrayList<Flower> rangedList = new ArrayList<Flower>();
        for(Flower flower: allFlow){
            if (flower.stemSize >= s && flower.stemSize <= e){
                rangedList.add(flower);
            }
        }
        return rangedList;
    }

}











