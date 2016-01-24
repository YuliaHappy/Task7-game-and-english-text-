package com.epam.javauniversity.countinghuman;

import org.junit.Assert;
import org.junit.Test;

public class CountingHumanTest {

    @Test
    public void startTestOneElement() throws Exception {
        Assert.assertEquals(0, CountingHuman.start(1));
    }

    @Test
    public void startTestOddElements() throws Exception {
        Assert.assertEquals(7, CountingHuman.start(10));
    }

    @Test
    public void startTestEvenElements() throws Exception {
        Assert.assertEquals(3, CountingHuman.start(7));
    }

}