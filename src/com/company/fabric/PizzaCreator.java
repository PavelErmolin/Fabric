package com.company.fabric;

import com.company.Pizza;

import java.util.Scanner;

public class PizzaCreator {
    public Pizza Create (){
        Scanner scanner = new Scanner(System.in);
        int typePizza;
        Pizza pizza = null;
        System.out.println("Выберете тип пиццы:");
        System.out.println("0-Итальянская");
        System.out.println("1-Американская");
        System.out.println("2-Кальцоне");
        do typePizza = scanner.nextInt();
        while(typePizza>2||typePizza<0);

        switch (typePizza) {
            case 0:
                pizza = new ItalyPizzaCreator().CreatePizza();
                break;
            case 1:
                pizza = new AmericanPizzaCreator().CreatePizza();
                break;
            case 2:
                pizza = new CalzonePizzaCreator().CreatePizza();
                break;
        }
        return pizza;

    }
}
