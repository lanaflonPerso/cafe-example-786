package com.cafe;

import com.cafe.storage.Storage;

public class Cafe
{
    private Storage storage;

    public Cafe() {}

    public void createDrink(String name, double price)
    {
        Drink drink = new Drink();

        drink.setName(name);
        drink.setPrice(price);

        storage.store(drink);
    }

    public void buy(String name)
    {
        buy(name, 1);
    }


    public void buy(String name, int count)
    {
        Drink drinkToBuy = storage.find(name);

        if (drinkToBuy != null && count > 0)
        {
            System.out.println("Bought " + name
                    + ", total cost: " + (count * drinkToBuy.getPrice()));
        }
        else
        {
            System.out.println(name + " No such drink exists.");
        }

    }

    public void printMenu()
    {
        System.out.println("========================");
        System.out.println("========  Menu  ========");
        System.out.println("========================");
        for (Drink drink : storage.getAll())
        {
            System.out.println(drink);
        }
        System.out.println("========================");
        System.out.println();
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }
}
