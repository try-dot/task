package com.maxv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {
        countNumbers();
    }

    private static void countNumbers() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        float count = 0.0F;
        Pattern pattern = Pattern.compile("([+-]?([0-9]*[.])?[0-9]+)");
        while (scanner.hasNextLine()) {
            Matcher matcher = pattern.matcher(scanner.nextLine().replaceAll("#.* ", ""));
            while (matcher.find()) {
                count += Float.parseFloat(matcher.group(1));
            }
        }
        scanner.close();
        System.out.println(count);
    }
}



