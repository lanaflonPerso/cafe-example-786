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
    public Drink getById(long id)
    {
        return null;
    }

    @Override
    public Drink find(String name)
    {
        return null;
    }

    @Override
    public List<Drink> getAll()
    {
        return null;
    }
}
