package com.epam.javauniversity.occurenceword;

import com.epam.javauniversity.utils.occurenceword.OccurrenceWord;
import com.epam.javauniversity.utils.reporter.Reporter;

import java.io.*;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Fail count arguments!");
        }
        try {
            Map<String, Integer> occurrenceWord = OccurrenceWord.getFrequencyWord(new FileInputStream(args[0]));
            System.out.println(Reporter.createMap(occurrenceWord));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
