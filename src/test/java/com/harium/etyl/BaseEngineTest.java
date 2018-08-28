package com.harium.etyl;

import org.junit.Assert;
import org.junit.Test;

public class BaseEngineTest {

    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;

    @Test
    public void testInit() {
        BaseEngine engine = new BaseEngine(640, 480) {
        };

        Assert.assertEquals(WIDTH, engine.w);
        Assert.assertEquals(HEIGHT, engine.h);
        Assert.assertNotNull(engine.core);
        Assert.assertNotNull(engine.loaders);
    }

}
