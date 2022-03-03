package com.serenitydojo;

public abstract class Pet {
    private String name;
<<<<<<< HEAD
    private int age;


    public Pet(String name) {
=======

    public  Pet(String name) {
>>>>>>> master
        this.name = name;
    }
    public String getName() {
        return name;
    }

<<<<<<< HEAD
    public String goForWalks() { return "walk walk walk"; }
    public abstract String makeNoise();
    public abstract String play();
=======
    public String goForWalks() {return "walk walk walk";}
    public abstract String makeNoise();

>>>>>>> master
}
