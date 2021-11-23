package com.company;

public class Beef extends Food {

    //Внутреннее поле привкус
    private  String preparedness;

    // Вызвать конструктор предка, передав ему имя класса
    public Beef(String preparedness) {
        super("Beef");
        this.preparedness = preparedness;

    }

    // Переопределить способ употребления жевательной резинки
    public void consume() {
        System.out.println(this + " was eaten");
    }

    //Геттер и Сеттер для доступа к полю
    public String getPreparedness() {
        return preparedness;
    }
    public void setPreparedness(String preparedness) {
        this.preparedness = preparedness;
    }


    //Переопределенный метод toString возвращает вкус и калории продукта
    @Override
    public String toString() {
        return super.toString() + " with taste '" + preparedness.toUpperCase() + "',"+"calories: "+calculateCalories()+" -";
    }

    //Переопределенный метод расчета калорий в зависимости значений параметров
    @Override
    public double calculateCalories() {
        double calories=0.0;
        if (preparedness.equals("Low")){
            calories=300.4;
        } else if (preparedness.equals("Medium")){
            calories=350.55;
        } else if (preparedness.equals("Rare"))
            calories=360.3;
        return calories;
    }
}


