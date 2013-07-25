package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import static com.thoughtworks.FizzBuzz.BUZZ;
import static com.thoughtworks.FizzBuzz.FIZZ;
import static com.thoughtworks.FizzBuzz.FIZZ_BUZZ;
import static junit.framework.Assert.assertEquals;

/**
 * User: hwpeng
 * Date: 7/25/13
 * Time: 11:22 AM
 * Project: FizzBuzz
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrint1WhenGiven1(){
        assertEquals("1", fizzBuzz.printAnswer(1));
    }

    @Test
    public void shouldPrint2WhenGiven2() throws Exception {
        assertEquals("2", fizzBuzz.printAnswer(2));
    }

    @Test
    public void shouldPrintFizzWhenGiven3() throws Exception {
        assertEquals(FIZZ, fizzBuzz.printAnswer(3));
    }

    @Test
    public void shouldPrintFizzWhenGiven0() throws Exception {
        assertEquals(FIZZ_BUZZ, fizzBuzz.printAnswer(0));
    }

    @Test
    public void shouldPrintBuzzWhenGiven5() throws Exception {
        assertEquals(BUZZ, fizzBuzz.printAnswer(5));

    }

    @Test
    public void shouldPrintFizzWhenGiven6() throws Exception {
        assertEquals(FIZZ, fizzBuzz.printAnswer(6));

    }

    @Test
    public void shouldPrintBuzzWhenGiven10() throws Exception {
        assertEquals(BUZZ, fizzBuzz.printAnswer(10));

    }

    @Test
    public void shouldPrintFizzBuzzWhenGiven15() throws Exception {
        assertEquals(FIZZ_BUZZ, fizzBuzz.printAnswer(15));

    }

    @Test
    public void shouldPrintFizzBuzzWhenGiven30() throws Exception {
        assertEquals(FIZZ_BUZZ, fizzBuzz.printAnswer(30));

    }
}
