package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.Random;

import static org.testng.asserts.Assertion.*;

public class ExampleTest {

    @Test
    void ExampleTest() {

        Assert.assertFalse(3>=2);
    }
}
