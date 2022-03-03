package com.serenitydojo;

<<<<<<< HEAD
/**
 * A feline creature.
 */
=======
>>>>>>> master
public class Cat extends Pet {

    private String favoriteFood;
    private int age;

<<<<<<< HEAD
    // A very useful field
    public static final String CAT_NOISE = "Meow";
=======
    public static final String CAT_NOISE = "Meooow";
>>>>>>> master

    public static String usualFood() {
        return "Tuna";
    }
<<<<<<< HEAD

=======
>>>>>>> master
    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.favoriteFood = usualFood();
<<<<<<< HEAD
    }

=======

    }
>>>>>>> master
    public Cat(String name, String favoriteFood, int age) {
        super(name);
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

<<<<<<< HEAD
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }
=======

>>>>>>> master

    public String getFavoriteFood() {
        return favoriteFood;
    }

<<<<<<< HEAD
=======
    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

>>>>>>> master
    public int getAge() {
        return age;
    }

<<<<<<< HEAD
    @Override
    public String makeNoise() {
        return CAT_NOISE;
    }

    @Override
    public String play() {
        return "plays with string";
=======
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String makeNoise() {
        return CAT_NOISE;
>>>>>>> master
    }

    public void feed(String food) {
        System.out.println(getName() + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " licks his paws");
    }
}
