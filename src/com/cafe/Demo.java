package com.cafe;

import com.cafe.storage.ListStorage;
import com.cafe.storage.MapStorage;
import com.cafe.storage.Storage;

import java.util.List;

public class Demo
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();
//        Storage storage =  new ListStorage();
        Storage storage =  new MapStorage();

        cafe.setStorage(storage);


        cafe.createDrink("Coffee", 40.0);
        cafe.createDrink("Latte", 60.0);
        cafe.createDrink("Tea", 10.0);

        cafe.printMenu();

        cafe.buy("Latte", 2);
        cafe.buy("Tea");

        cafe.buy("aksdksa");



    }


}
