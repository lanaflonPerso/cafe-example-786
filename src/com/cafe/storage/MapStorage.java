package com.cafe.storage;

import com.cafe.Drink;

import java.util.*;

public class MapStorage implements Storage
{
    private Map<String, Drink> storage;

    private long currentId = 1;

    public MapStorage()
    {
        this.storage = new HashMap<>();

        // ordered map
//        this.storage = new LinkedHashMap<>();
    }

    @Override
    public Drink store(Drink drink)
    {
        drink.setId(currentId++);
        storage.put(drink.getName(), drink);

        return drink;
    }

    @Override
    public Drink find(String name)
    {
        return storage.get(name);
    }

    @Override
    public List<Drink> getAll()
    {
        return new ArrayList<>(storage.values());
    }
}
