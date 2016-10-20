/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Isaac
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of runFromMonster method, of class MapControl.
     */
    @Test
    public void testRunFromMonster() {
        System.out.println("runFromMonster");
        
        //Test 1
        System.out.println("\tTest 1");
        //Inputs values for test 1
        long time = 70;
        long distance = 400;
        //instance of map control
        MapControl instance = new MapControl();
        long expResult = 1; // expected output returned value
        //call function to run test
        long result = instance.runFromMonster(time, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        //Test 2
        System.out.println("\tTest 2");
        //Inputs values for test 2
        time = 106;
        distance = 400;
        //instance of map control
        instance = new MapControl();
         expResult = 0; // expected output returned value
        //call function to run test
        result = instance.runFromMonster(time, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
         //Test 3
        System.out.println("\tTest 3");
        //Inputs values for test 3
        time = 70;
        distance = 350;
        //instance of map control
        instance = new MapControl();
         expResult = -1; // expected output returned value
        //call function to run test
        result = instance.runFromMonster(time, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
         //Test 4
        System.out.println("\tTest 4");
        //Inputs values for test 4
        time = -1;
        distance = 400;
        //instance of map control
        instance = new MapControl();
         expResult = -2; // expected output returned value
        //call function to run test
        result = instance.runFromMonster(time, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
         //Test 5
        System.out.println("\tTest 5");
        //Inputs values for test 5
        time = 60;
        distance = 400;
        //instance of map control
        instance = new MapControl();
         expResult = 1; // expected output returned value
        //call function to run test
        result = instance.runFromMonster(time, distance);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
        
        
    }

    /**
     * Test of openTheShack method, of class MapControl.
     */
    @Test
    
    public void testOpenTheShack() {
        System.out.println("openTheShack");
        //Test 1
        System.out.println("\t Test 1");
        //inputs
        long rn = 60L;
        long rn2 = 5L;
        long userAnswer = 25L;
        MapControl instance = new MapControl();
        long expResult = 0L;
        long result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 2
        System.out.println("\t Test 2");
        //inputs
        rn = 60L;
        rn2 = 5L;
        userAnswer = 26L;
        instance = new MapControl();
        expResult = 2L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 3
        System.out.println("\t Test 3");
        //inputs
        rn = 60L;
        rn2 = 5L;
        userAnswer = -20L;
        instance = new MapControl();
        expResult = -1L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 4
        System.out.println("\t Test 4");
        //inputs
        rn = 60L;
        rn2 = 5L;
        userAnswer = 1000L;
        instance = new MapControl();
        expResult = -1L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 5
        System.out.println("\t Test 5");
        //inputs
        rn = 21L;
        rn2 = 5L;
        userAnswer = 25L;
        instance = new MapControl();
        expResult = -2L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 6
        System.out.println("\t Test 6");
        //inputs
        rn = 2001L;
        rn2 = 5L;
        userAnswer = 25L;
        instance = new MapControl();
        expResult = -2L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 7
        System.out.println("\t Test 7");
        //inputs
        rn = 60L;
        rn2 = 0L;
        userAnswer = 25L;
        instance = new MapControl();
        expResult = -3L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 8
        System.out.println("\t Test 8");
        //inputs
        rn = 60L;
        rn2 = 11L;
        userAnswer = 25L;
        instance = new MapControl();
        expResult = -3L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 9
        System.out.println("\t Test 9");
        //inputs
        rn = 22L;
        rn2 = 1L;
        userAnswer = 10L;
        instance = new MapControl();
        expResult = 0L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);
        
        //Test 10
        System.out.println("\t Test 10");
        //inputs
        rn = 2000L;
        rn2 = 10L;
        userAnswer = 990L;
        instance = new MapControl();
        expResult = 0L;
        result = instance.openTheShack(rn, rn2, userAnswer);
        assertEquals(expResult, result);

        
    }
    
    
    
}
