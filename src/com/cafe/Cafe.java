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

    public void printMenu()
    {
        System.out.println(storage.getAll());
    }

    public void setStorage(Storage storage)
    {
        this.storage = storage;
    }
}
