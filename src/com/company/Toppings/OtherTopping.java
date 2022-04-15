package com.company.Toppings;

public class OtherTopping extends Topping {
    private String name;

    public OtherTopping(int weight, byte spicy, boolean veggie, String name) {
        super(weight, spicy, veggie);
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nПрочие начинки{" +
                "Название: " + name +
                ", Вес: " + weight +
                ", Острота: " + spicy +
                ", Вегитарианский: " + veggie +
                "}";
    }
}
