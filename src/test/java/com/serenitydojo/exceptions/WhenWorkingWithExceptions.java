package com.serenitydojo.exceptions;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenWorkingWithExceptions {
    WordCounter wordCounter = new WordCounter();

    public WhenWorkingWithExceptions() {
    }

    @Test
    public void shouldCountTheWordsInAString() {
        int numberOfWords = wordCounter.numberOfWordsIn("some string");
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test
    public void shouldReturnZeroForANullString() {
        assertThat(wordCounter.numberOfWordsIn((String)null)).isEqualTo(0);
    }

    @Test
    public void shouldCountWordsInAFile() throws Exception {
        int numberOfWords = wordCounter.numberOfWordsInFile("src/main/resources/hello.txt");
        assertThat(numberOfWords).isEqualTo(2);
    }

    @Test//(expected = FileHasNoWordsException.class)
    public void shouldReportAnErrorIfTheFileDoesNotExist() throws Exception {
        int numberOfWords = wordCounter.numberOfWordsInFile("file-that-does-not-exist.txt");
        assertThat(numberOfWords).isEqualTo(0);

    }

    @Test(expected = FileHasNoWordsException.class)
    public void shouldThrowMeaningfulExceptionIfThereAreNoWordsInTheFile() throws Exception, FileHasNoWordsException {
        wordCounter.numberOfWordsInFile("src/main/resources/nowords.txt");
    }
}