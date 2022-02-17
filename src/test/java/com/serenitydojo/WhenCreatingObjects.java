package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {
    @Test
    public  void creating_a_cat() {
        Cat felix = new Cat("Felix", "Tuna", 4);
        Cat spot = new Cat("Spot", "Salmon", 3);
        System.out.println(felix.getName());
        System.out.println(felix.getAge());
        System.out.println(felix.getFavoriteFood());



        System.out.println(spot.getFavoriteFood());
    }
    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

        Pet hamster = new Hamster("Rusty", "fetch", 1);
    }
    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);


        System.out.println("Felix goes " + felix.makeNoise());
    }
    @Test public void  creating_a_hamster() {
        Hamster rusty = new Hamster("Rusty", "catch", 1);
        System.out.println("The hamster's name is "+ rusty.getName() + " and his fav game is " + rusty.getFavoriteGame() +". "+ rusty.getName() + " is "+ rusty.getAge() + " year old." );
        Assert.assertEquals(rusty.getAge(), 1);
        Assert.assertEquals(rusty.getFavoriteGame(), "catch");
        Assert.assertEquals(rusty.getName(), "Rusty");
    }
    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido", "Chewtoy", 3);
        System.out.println("Fido goes " + fido.makeNoise());
    }
    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "chewtoy", 2);
        Pet rusty = new Hamster("Rusty", "fetch", 1);
        System.out.println("Felix walks " + felix.goForWalks() );
        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
        System.out.println(("Fido goes " + fido.makeNoise()));




    }
}
