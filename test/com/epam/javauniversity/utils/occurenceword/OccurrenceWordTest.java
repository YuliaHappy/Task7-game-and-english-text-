package com.epam.javauniversity.utils.occurenceword;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceWordTest {

    @Test
    public void getFrequencyWordTest() throws Exception {
        String text = "This is May. May is very nice, better April, but June is Better.";
        Map<String, Integer> result = new HashMap<String, Integer>();
        result.put("this", 1);
        result.put("is", 3);
        result.put("may", 2);
        result.put("very", 1);
        result.put("nice", 1);
        result.put("better", 2);
        result.put("april", 1);
        result.put("but", 1);
        result.put("june", 1);
        Assert.assertEquals(result, OccurrenceWord.getFrequencyWord(text));
    }
}