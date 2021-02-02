package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Гарфилд");
        Dog dog = new Dog("Хатико");
        Dog dog2 = new Dog("Бетховен");
        dog.run(300);
        dog.swim(5);
        cat.run(100);
        cat.swim(50);
        dog2.swim(30);

        System.out.println("Котов создано - " + Cat.getCatCount());
        System.out.println("Собак создано - " + Dog.getDogCount());
        System.out.println("Всего животных создано - " + Animal.getCountAnimal());





    }
}
