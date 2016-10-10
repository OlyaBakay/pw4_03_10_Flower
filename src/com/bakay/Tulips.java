package com.bakay;

public class Tulips extends Flower {
        protected String geo;
        public Tulips(double stemSize, double price, boolean fresh, String color){
            super(stemSize, price, fresh, color);
            }
        public void geography(String geo){
            this.geo = geo;
        }


    }
