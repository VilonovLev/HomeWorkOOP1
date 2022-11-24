package com.company;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksVanding implements VandingMachine{
    List<Drink> hotDrinkArrayList = new ArrayList<>();

    public void addProduct(Drink drink){
        hotDrinkArrayList.add(drink);
    }

    public List<Drink> getHotDrinkArrayList() {
        return hotDrinkArrayList;
    }

    public void setHotDrinkArrayList(List<Drink> hotDrinkArrayList) {
        this.hotDrinkArrayList = hotDrinkArrayList;
    }

    @Override
    public String getProduct(int name, int volume, int temperature) {
        Drink drink = new HotDrink(name,volume,temperature);
        if (hotDrinkArrayList.contains(drink)) {
            return drink.toString();
        }
        return "Напиток закончился(";
    }

    public String getProduct(int name, int volume) {
        return this.getProduct(name,volume,30);
    }

    public String getProduct(int name) {
        return this.getProduct(name,200);
    }

    @Override
    public String toString() {
        return "HotDrinksVanding{" + hotDrinkArrayList + '}';
    }
}
