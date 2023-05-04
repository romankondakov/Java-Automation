package org.example;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueWords {

    public static void printUniqueWords(String str) {

        String[] words = str.replaceAll("[,. ]+", " ").split(" ");
        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for (String word : uniqueWords) {
            System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
        }
    }

    public static void main(String[] args) {
        String str = "футбол, баскетбол, волейбол, гандбол, баскетбол";
        printUniqueWords(str);
    }
}