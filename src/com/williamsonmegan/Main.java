package com.williamsonmegan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // read in string
        File file = new File("data");

        Scanner scan = new Scanner(file);
        scan.useDelimiter(" ");

        // create HashMap
        HashMap<String, Integer> wordHashMap = new HashMap<String, Integer>();

        while (scan.hasNext()) {
            String word = scan.next();
            if (wordHashMap.containsKey(word)) {
                wordHashMap.put(word, wordHashMap.get(word) + 1);
            } else {
                wordHashMap.put(word.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", ""), 1);
            }
        }


//        scan.close();
        System.out.println(wordHashMap);
    }
}
