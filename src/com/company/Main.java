package com.company;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        Drink drink0 = new HotDrink(0, 200, 30);
        Drink drink1 = new HotDrink(1, 50);
        Drink drink2 = new HotDrink(3);
        Drink drink3 = new HotDrink(4, 150);
        Drink drink4 = new Drink(5);

        HotDrinksVanding hotDrinksVanding = new HotDrinksVanding();
        hotDrinksVanding.setHotDrinkArrayList(Arrays.asList(drink0, drink1, drink2, drink3, drink4));

        logger.info(hotDrinksVanding.getProduct(1, 50, 50));
        logger.info(hotDrinksVanding.getProduct(0));
        logger.info(hotDrinksVanding.getProduct(3, 200, 60));
        logger.info(hotDrinksVanding.getProduct(4, 150));
    }
}
