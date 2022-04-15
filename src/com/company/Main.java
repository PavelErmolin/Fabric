package com.company;

import com.company.fabric.PizzaCreator;

public class Main {

    public static void main(String[] args) {
 /*     Meat chicken = new Meat(150, (byte) 0,TypeOfMeat.Chicken);
	    Meat turkey = new Meat(100, (byte) 0,TypeOfMeat.Turkey);
        Meat beef = new Meat(70, (byte) 2,TypeOfMeat.Beef);
        Meat sausage = new Meat(80, (byte) 3,TypeOfMeat.Sausage);
        Cheese mozzarella = new Cheese(120,false,TypeOfCheese.Mozzarella);
        Cheese parmesan = new Cheese(170,false, TypeOfCheese.Parmesan);
        Cheese cheddar = new Cheese(50 ,false,TypeOfCheese.Cheddar);
        Cheese roquefort = new Cheese(30,false,TypeOfCheese.Roquefort);
        Cheese veggie = new Cheese(30,true,TypeOfCheese.Veggie);
        OtherTopping cucumber = new OtherTopping(5,(byte) 0 , true, "Огурец");
        OtherTopping pepper = new OtherTopping(10,(byte) 5 , true, "Перец");
        OtherTopping pepperChile = new OtherTopping(10,(byte) 8 , true, "Перец чили");
        OtherTopping ketchup = new OtherTopping(35,(byte) 3 , true, "Кетчуп"); */
            Pizza pizza;                                                //Создаю объект пиццы
            pizza = new PizzaCreator().Create();                        //Запускаю фабрику и получаю готовый объект
            System.out.println(pizza);                                  //Вывод информации о пицце
            System.out.println("Острота " + pizza.GetSpicy());          //Вывод суммарной остроты пиццы
            System.out.println("Вес начинки " + pizza.GetWeight());     //Вывод суммарного веса начинки
    } // не смог удержаться и не написать main в 5 строк
}
