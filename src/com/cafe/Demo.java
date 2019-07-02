package com.cafe;

import com.cafe.storage.ListStorage;
import com.cafe.storage.Storage;

public class Demo
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();
        Storage storage =  new ListStorage();

        cafe.setStorage(storage);


        cafe.createDrink("Coffee", 40.0);
        cafe.createDrink("Latte", 60.0);
        cafe.createDrink("Tea", 10.0);

        cafe.printMenu();

    }


}
