package strategies;


import java.util.ArrayList;

import models.Critter;
import models.Tower;

/**
 *
 * finds the strongest enemy
 * 
 */
public class Strongest implements IStrategy {

    /**
     *
     * @param tower
     * @param g1
     * @return
     */
    @Override
	public Critter findTarget(Tower tower, ArrayList<Critter> g1) {
    	
		Critter strongest_enemy= null;   
        double max_health = 0;
        int count = g1.size(); 			 		 // The number of critters currently within range
        for (int i = 0; i < count; i++) {
            Critter enemy = g1.get(i); 			
            double health = (g1.get(i).getHitPoints());		     	 // The health of critter
            if (health > max_health)
            {
            max_health = health;
            strongest_enemy=enemy;
            }
        }
        
       return(strongest_enemy);				 	 // Tower attacks this critter
		
	}
	public String toString(){
		return "Strongest";
	}
}
