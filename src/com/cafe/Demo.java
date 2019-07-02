package com.cafe;

import com.cafe.storage.ListStorage;
import com.cafe.storage.MapStorage;
import com.cafe.storage.Storage;

public class Demo
{
    public static void main(String[] args)
    {
        Cafe cafe = new Cafe();
        cafe.setStorage(chooseStorage(args));

        cafe.createDrink("Coffee", 40.0);
        cafe.createDrink("Latte", 60.0);
        cafe.createDrink("Tea", 10.0);

        cafe.printMenu();

        cafe.buy("Latte", 2);
        cafe.buy("Tea");

        cafe.buy("aksdksa");


    }

    public static Storage chooseStorage(String[] args)
    {
        if (args.length > 0 && "map".equals(args[0]))
        {
            return new MapStorage();
        }
        return new ListStorage<>();
    }


}
