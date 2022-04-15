package com.company.Toppings;

public abstract class Topping {
    protected int weight;      //Вес начинки
    protected byte spicy;      //Острота 0-7
    protected boolean veggie;  //Вегитарианская

    public Topping(int weight, byte spicy, boolean veggie) {
        this.weight = weight;
        this.spicy = spicy;
        this.veggie = veggie;
    }
    public byte getSpicy(){
        return this.spicy;
    }

    public int getWeight() {
        return this.weight;
    }
}
