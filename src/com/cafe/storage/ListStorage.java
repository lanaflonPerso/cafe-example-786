package com.cafe.storage;

import com.cafe.Drink;

import java.util.ArrayList;
import java.util.List;

public class ListStorage implements Storage
{
    private List<Drink> drinkList;

    private long currentId = 1;

    public ListStorage()
    {
        System.out.println("ListStorage selected.");
        this.drinkList = new ArrayList<>();
    }

    @Override
    public Drink store(Drink drink)
    {
        Drink stored = drink;
        stored.setId(currentId++);

        drinkList.add(drink);

        return stored;
    }

    @Override
    public Drink find(String name)
    {
        for (Drink drink : drinkList)
        {
            if (name.equals(drink.getName()))
            {
                return drink;
            }
        }
        return null;
    }

    @Override
    public List<Drink> getAll()
    {
        return new ArrayList<>(drinkList);
    }
}
