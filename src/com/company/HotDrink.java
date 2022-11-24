package com.company;

import java.util.Objects;

public class HotDrink extends Drink{
    private int temperature;

    public HotDrink(int nameDrink, int volumeGlass, int temperature) {
        super(nameDrink,volumeGlass);
        this.temperature = temperature;
    }

    public HotDrink(int nameDrink, int volumeGlass) {
        this(nameDrink,volumeGlass,30);
    }

    public HotDrink(int nameDrink) {
        this(nameDrink,200);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + " temperature=" + temperature ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HotDrink hotDrink = (HotDrink) o;
        return super.equals(o) && temperature == hotDrink.temperature;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }
}
