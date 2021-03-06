/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment1.brandonbyronbrock;

import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0592682
 */
public class CSD4464Assignment1BrandonByronBrockTest {
    
    public CSD4464Assignment1BrandonByronBrockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of stringPower method, of class CSD4464Assignment1BrandonByronBrock.
     */
    
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("Empty string test case");
        String s = "";
        int i = 0;
        String expResult = "";
        String result = CSD4464Assignment1BrandonByronBrock.stringPower(s, i);
        assertEquals(expResult, result);
    }    
      
    @Test
    public void testLessThanOneShouldReturnNull() {
        System.out.println("Less than one test case");
        String s = "5";
        int i = -1;
        String expResult = null;
        String result = CSD4464Assignment1BrandonByronBrock.stringPower(s, i);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndOneShouldReturnString() {
        System.out.println("Single string test case");
        String s = "5";
        int i = 1;
        String expResult = "5";
        String result = CSD4464Assignment1BrandonByronBrock.stringPower(s, i);
        assertEquals(expResult, result);
    } 
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        System.out.println("Double string test case");
        String s = "bob";
        int i = 2;
        String expResult = "bobbob";
        String result = CSD4464Assignment1BrandonByronBrock.stringPower(s, i);
        assertEquals(expResult, result);
    } 
    
    @Test
    public void testRandomStringConcatenation() {
        System.out.println("\nRandom string test case");        
        String s = "apple";
        
        // Get a random number between 1 and 15     
        int rNum = new Random().nextInt(15) + 1;
        
        // Generate the expected result for the random case
        String expResult = "";
        for (int i = 1; i <= rNum; i++) {
            expResult += s;            
        }
        
        // Find the actual result from the string power method
        String result = CSD4464Assignment1BrandonByronBrock.stringPower(s, rNum);
        
        // Print the expected and found results
        System.out.println("Found: " + result);
        System.out.println("Expected: " + expResult + "\n");
        
        // Return whether the expected result was found
        assertEquals(expResult, result);
    } 
}
