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
     * Test of fightMonster method, of class MapControl.
     */
    @Test
    public void testFightMonster() {
        System.out.println("fightMonster");
        
        //Test #1
         System.out.println("\tTest 1");
         
        //Inputs values
        
        long hits = 2;
        long powerLevel = 27;
        long monsterHealth = 60;
        
        //instance of MapControl
        MapControl instance = new MapControl();
        long expResult = 0;
        
        //call function to run
        long result = instance.fightMonster(hits, powerLevel, monsterHealth);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //Test #2
         System.out.println("\tTest 2");
         
        //Inputs values
        
         hits = 2;
         powerLevel = 40;
         monsterHealth = 70;
        
        //instance of MapControl
        instance = new MapControl();
        expResult = 1;
        
        //call function to run
        result = instance.fightMonster(hits, powerLevel, monsterHealth);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
