package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    private String name;
    private int age;
    private String owner;
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = "George";
        this.age = Integer.MAX_VALUE;

    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = Integer.MAX_VALUE;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = "Name of Dog";

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        name = name;
        age = age;


    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }
}
