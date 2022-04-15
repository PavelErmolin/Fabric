package com.company.Toppings;

public class Meat extends Topping {
    private TypeOfMeat typeOfMeat;

    public Meat(int weight, byte spicy, TypeOfMeat typeOfMeat) {
        super(weight, spicy, false);
        this.typeOfMeat = typeOfMeat;
    }

    @Override
    public String toString() {
        return "\nМясо{" +
                "Тип: " + typeOfMeat +
                ", Вес: " + weight +
                ", Острота: " + spicy +
                ", Вегитарианский: " + veggie +
                "}";
    }
}
