package com.company;

public class Animal {
    private String name;
    private static int countAnimal;



    //конструктор с именем
    public Animal (String name) {
        this.name = name;
        countAnimal++;
    }

    //Возврат счетчика
    public static int getCountAnimal() {
        return countAnimal;
    }

    //метод "Бег"
    public void run (int lengthOfObstacle) {
        System.out.println(name + " пробежал " + lengthOfObstacle + " м."); ;
    }

    //метод "Плавание"
    public void swim(int lengthOfObstacle) {
        System.out.println(name + " проплыл " + lengthOfObstacle + " м.");
    }

    //геттер получить имя для вывода в методе
    public String getName() {
        return name;
    }



}
