package com.cafe.storage;

import com.cafe.Drink;

import java.util.List;

public interface Storage<D extends Drink>
{
    D store(D drink);

    D find(String name);

    List<D> getAll();
}
