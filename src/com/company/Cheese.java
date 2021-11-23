package com.company;

public class Cheese extends Food {

    // Вызвать конструктор предка, передав ему имя класса
    public Cheese() {
        super("Cheese");
    }

    // Переопределить способ употребления сыра
    @Override
    public void consume() {
        System.out.println(this+" was eaten");

    }


    @Override
    public String toString() {
        return super.toString() +" calories: "+calculateCalories()+" -";
    }

    //Нет параметров конструктора
    @Override
    public double calculateCalories() {
        return 232.1;

    }
}