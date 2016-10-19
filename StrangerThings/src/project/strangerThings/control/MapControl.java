/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.strangerThings.control;

/**
 *
 * @author Isaac
 */
public class MapControl {
    
    public long runFromMonster( long time, long distance){
    /*
        if (time > 105) then
                Return 0
        if (distance < 400 OR distance > 400) then
                Return -1
        if (time < 60) then
                Return -2
        playerVelocity = distance/time
               
        monsterVelocity = 3.77
                
        getAway = playerVelocity - monsterVelocity
                
                Return 1
        
         END
*/
    if (time > 105) {
        
        return 0;
    }
    
    if (distance < 400 || distance > 400){
         
        return -1;
    }
    
    if (time < 60 ){
        
        return -2;
    }
    
    long playerVelocity = distance/time;
    long monsterVelocity = (long) 3.77;
    long getAway = playerVelocity - monsterVelocity;
    
    return 1;
    }
   
}
