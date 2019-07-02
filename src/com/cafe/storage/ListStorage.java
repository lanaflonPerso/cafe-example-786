package com.cafe.storage;

import com.cafe.Drink;

import java.util.ArrayList;
import java.util.List;

public class ListStorage<D extends Drink> implements Storage<D>
{
    private List<D> drinkList;

    private long currentId = 1;

    public ListStorage()
    {
        System.out.println("ListStorage selected.");
        this.drinkList = new ArrayList<>();
    }

    @Override
    public D store(D drink)
    {
        D stored = drink;
        stored.setId(currentId++);

        drinkList.add(drink);

        return stored;
    }

    @Override
    public D find(String name)
    {
        for (D drink : drinkList)
        {
            if (name.equals(drink.getName()))
            {
                return drink;
            }
        }
        return null;
    }

    @Override
    public List<D> getAll()
    {
        return new ArrayList<>(drinkList);
    }
}
