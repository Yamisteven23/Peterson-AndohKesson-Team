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
   
    //The Shack
    /*Algorithm
theShackTest(rn,rn2,userAnswer)
BEGIN
IF (userAnswer < 1 OR userAnswer >999) THEN
	RETURN -1
IF (rn < 22 OR rn >2000) THEN
	RETURN -2
IF (rn2 < 1 OR rn2 > 10) THEN
	RETURN -3
equation = (rn/2) – rn2
IF (equation does not equal userAnswer) THEN
	RETURN 2
ELSE
	RETURN 0 
END*/
    public long openTheShack(long rn, long rn2, long userAnswer){
   
    if (userAnswer < 1 || userAnswer > 999){
        return -1;
    }
    if (rn < 22 || rn > 2000){
        return -2;  
    }
    if (rn2 < 1 || rn2 > 10){
        return -3;
    }    
   long equation = (rn/2) - rn2;
    
    if (equation != userAnswer){
        return 2;
    }
    else
        return 0;
    }
}
