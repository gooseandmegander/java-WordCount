package com.williamsonmegan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // read in string
        File file = new File("data");

        Scanner scan = new Scanner(file);
        scan.useDelimiter("\\ ");

        while (scan.hasNext()) {
            System.out.println(scan.next().replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", ""));
        }
    }
}
