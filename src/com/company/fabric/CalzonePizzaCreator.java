package com.company.fabric;

import com.company.*;
import com.company.Toppings.*;

import java.util.ArrayList;
import java.util.Scanner;

public class CalzonePizzaCreator implements IPizzaCreator{
    public Pizza CreatePizza (){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Topping> toppings = new ArrayList<>();
        Meat chicken = new Meat(150, (byte) 0,TypeOfMeat.Chicken);
        toppings.add(chicken);
        Cheese mozzarella = new Cheese(120,false, TypeOfCheese.Mozzarella);
        toppings.add(mozzarella);
        Cheese parmesan = new Cheese(170,false, TypeOfCheese.Parmesan);
        toppings.add(parmesan);
        Cheese cheddar = new Cheese(50 ,false,TypeOfCheese.Cheddar);
        toppings.add(cheddar);
        OtherTopping ketchup = new OtherTopping(35,(byte) 3 , true, "Кетчуп");
        toppings.add(ketchup);
        System.out.println("Острую Y/N?");
        if(scanner.next().equals("Y")) {
            OtherTopping pepperChile = new OtherTopping(10,(byte) 8 , true, "Перец чили");
            toppings.add(pepperChile);
        }

        Pizza pizza = new Pizza("Кальцоне", TypeOfPizza.Calzone,toppings);
        return pizza;
    }
}
