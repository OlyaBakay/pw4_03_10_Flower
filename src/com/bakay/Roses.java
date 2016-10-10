package com.bakay;

public class Roses extends Flower{
    protected String species;
        public Roses(double stemSize, double price, boolean fresh, String color){
            super(stemSize, price, fresh, color);
        }
        public void setSpecies(String s){
            this.species = s;
        }
    }

