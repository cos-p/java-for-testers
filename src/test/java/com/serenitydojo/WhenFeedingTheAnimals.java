package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingTheAnimals {
    @Test
    public void shouldFeedCatsTuna() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, false);
        System.out.println(food);
        Assert.assertEquals(TUNA, food);
    }
    @Test
    public void shouldFeedHamstersCabbage() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, false);
        System.out.println(food);
        Assert.assertEquals(CABBAGE, food);
    }
    @Test
    public void shouldFeedDogsDogFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, false);
        System.out.println(food);
        Assert.assertEquals(DOG_FOOD, food);
    }
    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(CAT, true);
        System.out.println(food);
        Assert.assertEquals(SALMON, food);
    }
    @Test
    public void shouldFeedPremiumDogsDeluxeDogFood() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(DOG, true);
        System.out.println(food);
        Assert.assertEquals(DELUXE_DOG_FOOD, food);
    }
    @Test
    public void shouldFeedPremiumHamstersLettuce() {
        Feeder feeder = new Feeder();
        FoodType food = feeder.feeds(HAMSTER, true);
        System.out.println(food);
        Assert.assertEquals(LETTUCE, food);
    }
    @Test
    public void listOfColours() {
        String[] colour = {"red", "green" ,"blue"};
        int[] ages = {1,2,3};
        System.out.println(colour[1]);

        String[] moreColours = new String[4];
        moreColours[0] = "yellow";
        moreColours[1] = "purple";
        moreColours[2] = "pink";
        System.out.println("first c = " + moreColours[0]);

        for (int i = 0; i < moreColours.length; i++) {
            System.out.println(moreColours[i]);
        }
        //list
        List<String> myColours = new ArrayList<>();
        myColours.add("red");
        myColours.add("blue");
        myColours.add("purple");
        myColours.add("purple");
        myColours.add("purple");

        System.out.println(myColours.get(0));

        for (String someColour : myColours) {
            System.out.println("LIST is "+someColour );
        }
        //set
        Set<String> myColours2 = new HashSet<>();
        myColours2.add("red");
        myColours2.add("blue");
        myColours2.add("purple");
        myColours2.add("purple");
        myColours2.add("purple");

        System.out.println(myColours2);


        for (String someColour2 : myColours2) {
            System.out.println("SET "+someColour2 );
        }

    }

}
