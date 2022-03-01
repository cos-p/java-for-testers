package com.serenitydojo;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.data.Percentage.withPercentage;

public class WhenAddingNumbers {
    @Test
    public void shouldAddTwoIntegersCorrectly() {
        int a = 1;
        int b = 2;
        int sum = a + b;
        String colours = "red,Green,blue";
        String otherColour = "Red";

        Assertions.assertThat(sum).isEqualTo(3);
        assertThat(sum).isCloseTo(4, withPercentage(25));

        assertThat(colours).contains("red");
        assertThat(colours).containsPattern("[g|G]reen");

        //assertThat(colours).isEqualToIgnoringCase(otherColour);

    }
    @Test
    public void workingWithCollections() {
        List<String> colours = Arrays.asList("red", "green", "blue");
        Assertions.assertThat(colours).hasSize(3);
        Assertions.assertThat(colours).contains("green");
        Assertions.assertThat(colours).containsExactlyInAnyOrder("green", "red", "blue");


    }
}
