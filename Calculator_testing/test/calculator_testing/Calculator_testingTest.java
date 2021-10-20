/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author s one
 */
public class Calculator_testingTest {
    
    public Calculator_testingTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Calculator_testing.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculator_testing.main(args);
    }

    /**
     * Test of addition method, of class Calculator_testing.
     */
    @Test
    public void testAddition() {
        System.out.println("addition");
        double first_number = 4.0;
        double second_number = 2.0;
        double expResult = 6.0;
        double result = Calculator_testing.addition(first_number, second_number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of substraction method, of class Calculator_testing.
     */
    @Test
    public void testSubstraction() {
        System.out.println("substraction");
        double first_number = 5.0;
        double second_number = 9.0;
        double expResult = -4.0;
        double result = Calculator_testing.substraction(first_number, second_number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplication method, of class Calculator_testing.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        double first_number = 6.0;
        double second_number = 5.0;
        double expResult = 30.0;
        double result = Calculator_testing.multiplication(first_number, second_number);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of division method, of class Calculator_testing.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        double first_number = 27.0;
        double second_number = 3.0;
        double expResult = 9.0;
        double result = Calculator_testing.division(first_number, second_number);
        assertEquals(expResult, result, 0.0);
    }
    
}
