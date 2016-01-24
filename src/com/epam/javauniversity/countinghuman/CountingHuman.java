package com.epam.javauniversity.countinghuman;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CountingHuman {
    final static int STEP = 2;

    public static int start(final int countHumans) {
        if (countHumans == 0) {
            throw new IllegalArgumentException("");
        }
        List<Integer> people = toList(countHumans);
        Iterator<Integer> human = people.listIterator();
        while (people.size() != 1) {
            int humanNumber = 0;
            while (human.hasNext()) {
                human.next();
                if (humanNumber % STEP == 0) {
                    human.remove();
                }
                humanNumber++;
            }
            human = people.listIterator();
            System.out.println("Rest people is: " + people);
        }
        return people.get(0);
    }

    private static List<Integer> toList(final int countHumans) {
        List<Integer> result = new LinkedList<Integer>();
        for (int numberHuman = 0; numberHuman < countHumans; numberHuman++) {
            result.add(numberHuman);
        }
        return result;
    }
}