package com.company.Toppings;

public class Cheese extends Topping {
    private TypeOfCheese typeOfCheese;

    public Cheese( int weight, boolean veggie,TypeOfCheese typeOfCheese) {
        super(weight, (byte)0, veggie);
        this.typeOfCheese = typeOfCheese;
    }


    @Override
    public String toString() {
        return "\nСыр{" +
                "Название: " + typeOfCheese +
                ", Вес: " + weight +
                ", Острота: " + spicy +
                ", Вегитарианский: " + veggie +
                "}";
    }
}
