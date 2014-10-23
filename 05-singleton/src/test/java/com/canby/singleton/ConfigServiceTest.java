package com.canby.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

public class ConfigServiceTest {

    @Test
    public void testReallyIsASingleton() {
        ConfigService instanceA = ConfigService.getInstance();
        ConfigService instanceB = ConfigService.getInstance();

        Assert.assertSame(instanceA, instanceB);
    }

    @Test
    public void testChangingConfigUpdatesBoth() {
        ConfigService instanceA = ConfigService.getInstance();
        ConfigService instanceB = ConfigService.getInstance();

        int count = 10;
        boolean isEnabled = true;
        String name = "Some config";

        instanceA.setCount(count);
        instanceA.setEnabled(isEnabled);
        instanceA.setName(name);

        Assert.assertEquals(count, instanceB.getCount());
        Assert.assertEquals(isEnabled, instanceB.isEnabled());
        Assert.assertEquals(name, instanceB.getName());

        String newName = "Some other name";
        instanceB.setName(newName);

        Assert.assertEquals(newName, instanceA.getName());
    }

    @Test
    public void testPrivateConstructor() {
        // probably overkill, but why not
        Class<ConfigService> configServiceClass = ConfigService.class;

        Constructor<?>[] constructors = configServiceClass.getConstructors();

        // should have no public constructors
        Assert.assertEquals(0, constructors.length);
    }
}