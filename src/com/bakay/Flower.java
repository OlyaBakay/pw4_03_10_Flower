package com.bakay;

class Flower {
    protected double stemSize;
    protected double price;
    protected boolean fresh;
    protected String color;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStemSize(double stemSize) {
        this.stemSize = stemSize;
    }

    public double getStemSize() {
        return this.stemSize;
    }

    public boolean getFreshness() {
        return this.fresh;
    }

    private void setFreshness(boolean fresh) {
        this.fresh = fresh;
    }


    public Flower(double stemSize, double price, boolean fresh, String color) {
        this.stemSize = stemSize;
        this.fresh = fresh;
        this.price = price;
        this.color = color;
    }
}