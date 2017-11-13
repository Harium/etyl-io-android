package com.harium.etyl.util.io;

import org.junit.Assert;
import org.junit.Test;

public class IOHelperTest {

    @Test
    public void testGetFile() {
        Assert.assertNotNull(IOHelper.getFile(""));
    }
}
