package com.company;

public class Apple extends Food {

    //Внутреннее поле Size
    private String size;

    // Вызвать конструктор предка, передав ему имя класса
    public Apple(String size) {
        super("Apple");
        this.size = size;
    }


    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " was eaten");
    }

    //Геттер и Сеттер для доступа к полю
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }



    //Переопределенный метод расчета калорий в зависимости значений параметров
    @Override
    public double calculateCalories() {
        double calories;
        if (size.equals("Big")){
            calories=70.5;
        } else {
            calories=52.5;
        }
        return calories;
    }

    //Переопределенный метод toString возвращает размер и калории продукта
    @Override
    public String toString() {
        return super.toString() + " Size '" + size.toUpperCase() + "',"+"calories: "+calculateCalories()+" -";
    }


}
