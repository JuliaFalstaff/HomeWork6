package com.company;

public class Cat extends Animal {

    private static int catCount;

    public Cat (String name) {
        super(name);
        catCount++;
    }

    //возврат счетчика класса Кот
    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle > 200) {
            System.out.println( getName() + " столько пробежать не может. Максимальая длина препятствия для кота - 200 м.");
        } else {
            System.out.println(getName() + " пробежал " + lengthOfObstacle + " м.");
        }
    }

    @Override
    public void swim(int lengthOfObstacle) {
        System.out.println("Увы, " + getName() + " не умеет плавать. Сколько ни старайся, кот не поплывет :)");
    }









}
