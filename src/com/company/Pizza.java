package com.company;


import com.company.Toppings.Topping;

import java.util.ArrayList;

public class Pizza {
    private String name;
    private TypeOfPizza typeOfPizza;
    private ArrayList<Topping> toppings;

    public Pizza(String name, TypeOfPizza typeOfPizza, ArrayList<Topping> toppings) {
        this.name = name;
        this.typeOfPizza = typeOfPizza;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Пицца " + name +
                " Тип пиццы: " + typeOfPizza +
                ", Начинки: " + toppings +
                '}';
    }
    public int GetSpicy(){
        int spicy=0;
        for(int i = 0; i< toppings.size();i++)
            spicy+=this.toppings.get(i).getSpicy();
        return spicy;
    }
    public int GetWeight(){
        int weight=0;
        for(int i = 0; i< toppings.size();i++)
            weight+=this.toppings.get(i).getWeight();
        return weight;
    }

    public String getName() {
        return name;
    }
}
