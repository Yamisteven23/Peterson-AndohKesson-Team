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
    
    public long fightMonster ( long hits, long powerLevel, long monsterHealth ){
   /* 
   IF (hits < 2) THEN 
	RETURN -1
IF (hit > 3) THEN
	RETURN -2
IF (powerLevel < 27) THEN
	RETURN -3
IF (powerLevel > 40) THEN
	RETURN -4
IF (monsterHealth < 0) THEN 
	RETURN -5
IF (monsterHealth > 70) THEN 
RETURN -6
IF (monsterHealth == 0) THEN
	RETURN 1
fightMonster =(hits * powerLevel) - monsterHealth 
IF (fightMonster == monsterHealth || fightMonster > monsterHealth) THEN
	RETURN 1
ELSE 
	RETURN 0
END
 
  */
   if (hits < 2){
       return -1;
   }
   
   if (hits > 3){
       return -2;
   }
   
   if (powerLevel < 27){
       return -3;
   }
   
   if (powerLevel > 40){
       return -4;
   }
   
   if (monsterHealth < 0){
       return -5;
   }
   
   if (monsterHealth > 70){
       return -6;
   }
   
   long powerStrength = (hits * powerLevel);
   
   long fightMonster = monsterHealth - powerStrength;
   
   if ( monsterHealth < powerStrength){
        return 1;
   }
   else 
        return 0;  
   }
    
}
