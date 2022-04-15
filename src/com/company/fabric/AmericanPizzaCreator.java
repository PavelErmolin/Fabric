package com.company.fabric;

import com.company.*;
import com.company.Toppings.*;

import java.util.ArrayList;
import java.util.Scanner;

public class AmericanPizzaCreator implements IPizzaCreator{
    public Pizza CreatePizza (){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Topping> toppings = new ArrayList<>();
        Meat beef = new Meat(70, (byte) 2,TypeOfMeat.Beef);
        toppings.add(beef);
        Cheese mozzarella = new Cheese(120,false, TypeOfCheese.Mozzarella);
        toppings.add(mozzarella);
        Cheese parmesan = new Cheese(170,false, TypeOfCheese.Parmesan);
        toppings.add(parmesan);
        OtherTopping ketchup = new OtherTopping(35,(byte) 3 , true, "Кетчуп");
        toppings.add(ketchup);
        System.out.println("Острую Y/N?");
        if(scanner.next().equals("Y")) {
            OtherTopping pepperChile = new OtherTopping(10,(byte) 8 , true, "Перец чили");
            toppings.add(pepperChile);
        }

        Pizza pizza = new Pizza("Американская пицца", TypeOfPizza.American,toppings);
        return pizza;
    }
}
