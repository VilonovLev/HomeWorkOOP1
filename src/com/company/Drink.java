package com.company;

import java.util.Objects;

public class Drink {
    private int nameDrink;
    private int volumeGlass;

    public Drink(int nameDrink, int volumeGlass) {
        this.nameDrink = nameDrink;
        this.volumeGlass = volumeGlass;
    }

    public Drink(int nameDrink){
        this(nameDrink,200);
    }

    public int getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(int nameDrink) {
        this.nameDrink = nameDrink;
    }

    public int getVolumeGlass() {
        return volumeGlass;
    }

    public void setVolumeGlass(int volumeGlass) {
        this.volumeGlass = volumeGlass;
    }

    @Override
    public String toString() {
        return "nameDrink='" + nameDrink + '\'' + " volumeGlass=" + volumeGlass ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Drink drink = (Drink) o;
        return nameDrink == drink.nameDrink && volumeGlass == drink.volumeGlass;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDrink, volumeGlass);
    }
}
