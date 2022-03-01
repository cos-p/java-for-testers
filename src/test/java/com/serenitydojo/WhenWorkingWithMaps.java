package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {
    @Test
    public void creatingAMap() {
        Map<String, Integer> numberOfBallsByColour = new HashMap<>();
        numberOfBallsByColour.put("red", 3);
        numberOfBallsByColour.put("green", 6);
        numberOfBallsByColour.put("blue", 5);

        Integer numberofRedBalls = numberOfBallsByColour.get("red");
        System.out.println("There are "+ numberofRedBalls + " red balls");
    }
    @Test
    public void creatingAMapMoreConcisely() {
        Map<String, Integer> numberOfBallsByColour = Map.of("red",3, "green", 6, "blue",5);
        Map<String, Integer> moreColours = new HashMap<>();
        moreColours.put("yellow", 10);
        moreColours.put("mov", 0);

        moreColours.putAll(numberOfBallsByColour);
        System.out.println("Number of colours for white balls = " + moreColours.getOrDefault("white", 0));

        System.out.println("purple balls present: " + moreColours.containsKey("mov"));

        moreColours.put("yellow", 20);
        moreColours.replace("pink", 15);

        System.out.println("Number of yellow balls is: "+ moreColours.getOrDefault("yellow", 0));
        System.out.println("Number of pink balls is: "+ moreColours.getOrDefault("pink", 0));
    }
    @Test
    public void iteratingOverMapKeys() {
        Map<String, Integer> numberOfBallsByColour = Map.of("red",3, "green", 6, "blue",5);
        //no order
//        System.out.println("Keys = " + numberOfBallsByColour.keySet());
//        for(String key : numberOfBallsByColour.keySet()) {
//            Integer numberOfTennisBalls = numberOfBallsByColour.get(key);
//            System.out.println(key + "=> " + numberOfTennisBalls);
//        }
        //map
        printMap(numberOfBallsByColour);
        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColour);
        modifiableMap.remove("red");
        printMap(modifiableMap);
        modifiableMap.clear();
        printMap(modifiableMap);
    }

    private void printMap(Map<String, Integer> numberOfBallsByColour) {
        for(Map.Entry<String, Integer> entry : numberOfBallsByColour.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

}
