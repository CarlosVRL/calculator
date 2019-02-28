package com.codinginfire.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
