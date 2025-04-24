package com.example.counterapp;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * Test case 1: Menguji fungsi increment apakah hasilnya value + 1
 * Test case 2: Menguji fungsi decrement apakah hasilnya value - 1
 */
public class CalculatorTest {

    @Test
    public void testIncrement() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.increment(5));
    }

    @Test
    public void testDecrement() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.decrement(5));
    }
}
