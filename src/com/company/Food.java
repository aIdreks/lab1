package com.company;

import java.util.Objects;

public abstract class Food implements Consumable,Nutritious {

    String name = null;


    public Food(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(name, food.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный

}