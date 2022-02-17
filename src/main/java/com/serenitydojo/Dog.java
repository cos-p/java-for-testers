package com.serenitydojo;

public class Dog extends  Pet{
    private int age;

    private String favoriteToy;


    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }


    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }

    public String makeNoise() {
        return "Woof";
    }
}
