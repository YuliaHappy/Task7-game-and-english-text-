package com.epam.javauniversity.utils.reporter;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ReporterTest {

    @Test
    public void testCreateMap() throws Exception {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 3);
        Assert.assertEquals("a (2)\nb (3)\n", Reporter.createMap(map));
    }
}