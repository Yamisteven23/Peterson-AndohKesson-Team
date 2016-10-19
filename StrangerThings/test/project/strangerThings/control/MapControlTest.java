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
        
    }
    
}
