package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {
    public WordCounter() {
    }

    public int numberOfWordsIn(String value) {
        return value == null ? 0 : value.split("\\W").length;
    }

    public int numberOfWordsInFile(String filename) throws IOException {
        try {
        String fileContents = Files.readString(Paths.get(filename));
        int wordCount = numberOfWordsIn(fileContents);
        if (wordCount == 0) {
            throw new FileHasNoWordsException("No words found in the file " + filename);
        }
        return wordCount;
        //return this.numberOfWordsIn(fileContents);
        } catch (NoSuchFileException noSuchFile) {
            //return 0;
            throw new FileHasNoWordsException("No words found in the non existent file " + filename);
//        } catch ( IOException otherException) {
//            return -1;
//        } finally {
//            System.out.println("File processed for " + filename);
       }
    }
}
