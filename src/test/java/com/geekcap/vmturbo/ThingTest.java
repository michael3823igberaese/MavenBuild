package com.geekcap.vmturbo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by shaines on 7/24/16.
 */
public class ThingTest {

    @Test
    public void testN() {
        Thing t = new Thing();
        t.setN(35);
        Assert.assertEquals("N should be 35", 35, t.getN());
    }
}
