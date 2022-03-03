package com.serenitydojo;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class WhenWorkingWithJavaLists {
    @Test
    public void creatingASimpleList() {
        List simpleList = new ArrayList();

        simpleList.add("this is a string");
        simpleList.add(111);
        Assertions.assertThat(simpleList).contains("this is a string", 111);
    }
    @Test
    public void createATypedList() {
        List<String> names = new ArrayList<>();
        List<String> namesFixed = Arrays.asList("joe", "23" ,"pete");
        List<Integer> ages = Arrays.asList(10, 20, 30);

        names.add("joe");
        names.add("23");
        names.add("pete");
        assertThat(names).contains("joe", "pete", "23");
    }
    @Test
    public void removingStuff() {
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("23");
        names.add("pete");

        names.remove("joe");
        assertThat(names).contains("23");

        names.clear();
        assertThat(names).isEmpty();
    }
    @Test
    public void immutableList() {
        List<String> names = Arrays.asList("joe", "23" ,"pete");
        names.add("joe2");

    }
    @Test
    public void findElementInAList() {
        List<String> names = Arrays.asList("joe", "23" ,"pete", "joe", "paul");
        int indexOfJoe  = names.indexOf("joe");
        int lastIndexOfJoe = names.lastIndexOf("joe");
        assertThat(indexOfJoe).isEqualTo(0);
        assertThat(lastIndexOfJoe).isEqualTo(3);
    }
    @Test
    public void findingASublist() {
        List<String> names = Arrays.asList("joe", "23" ,"pete", "joe", "paul");
        List<String> middleNames = names.subList(1,5);
        System.out.println(middleNames);
        assertThat(names.size()).isEqualTo(5);
    }
    @Test
    public void convertingAListToASet() {
        List<String> names = Arrays.asList("joe", "23" ,"pete", "joe", "paul");
        Set<String> uniqueNames = new HashSet<>(names);

        assertThat(uniqueNames).containsExactlyInAnyOrder("joe", "23","pete","paul");
    }
    @Test
    public void sortingAList() {
        List<String> names = Arrays.asList("joe", "23" ,"pete", "joe", "paul");
        Collections.sort(names);
        System.out.println(names);
        assertThat(names).containsExactly("23","joe", "joe", "paul","pete");
    }
}
