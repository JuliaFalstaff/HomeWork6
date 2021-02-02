package com.company;

public class Dog extends Animal {

    private static int dogCount;

    public Dog (String name) {
        super(name);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }


    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle > 500) {
            System.out.println( getName() + " столько пробежать не может. Максимальая длина препятствия для собаки - 500 м.");
        } else {
            System.out.println(getName() + " пробежал " + lengthOfObstacle + " м.");

        }
    }

    @Override
    public void swim(int lengthOfObstacle) {
        if (lengthOfObstacle > 10) {
            System.out.println(getName() + " столько проплыть не может. Максимальая длина препятствия для собаки - 10 м.");
        } else {
            System.out.println(getName() + " проплыл " + lengthOfObstacle + " м.");
        }
    }
}
