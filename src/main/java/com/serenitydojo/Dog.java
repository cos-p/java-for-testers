package com.serenitydojo;

<<<<<<< HEAD
public class Dog extends Pet {
    private String favoriteToy;
    private int age;

=======
public class Dog extends  Pet{
    private int age;

    private String favoriteToy;


>>>>>>> master
    public Dog(String name, String favoriteToy, int age) {
        super(name);
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

<<<<<<< HEAD
    @Override
    public String play() {
        return "plays with bone";
    }
=======
>>>>>>> master

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
