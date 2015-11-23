package com.beeva.kata1;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by daniel on 12/11/15.
 */
public class StringCalculatorTest {

    private static StringCalculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @BeforeClass
    public static void setUp() {

        calculator = new StringCalculator();

    }

    @Test
    public void calculatorHasOneNumber() throws NegativeException {

        String value = "2";
        calculator.sum(value);
        assertThat(calculator.getSum(), is(2));

    }

    @Test
    public void calculatorHasTwoNumbers() throws NegativeException {

        String value = "2,6";
        calculator.sum(value);
        assertThat(calculator.getSum(), is(8));
    }

    @Test
    public void calculatorHasEmptyValue() throws NegativeException {

        String value = "";
        calculator.sum(value);
        assertThat(calculator.getSum(), is(0));
    }

    @Test
    public void calculatorHasIndeterminateNumbers() throws NegativeException {

        String value = "1,5,7,3";
        calculator.sum(value);
        assertThat(calculator.getSum(), is(16));
    }

    @Test
    public void calculatorHasDelimiter() throws NegativeException {

        String value = "[;]7;7;3";
        calculator.sum(value);
        assertThat(calculator.getSum(), is(17));
    }

    @Test
    public void calculatorHasNegativeNumber() throws NegativeException {

        expectedException.expect(NegativeException.class);
        String value = "[;]7,7,-7,8,1";
        calculator.sum(value);
    }

}
