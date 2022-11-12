package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.asserts.Assertion.*;

public class ExampleTest {

    @Test
    void ExampleTest() {
        Assert.assertTrue(3>=2);
    }
}
