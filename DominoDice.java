import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Binay Mishra (binaymishramca@gmail.com)
 * 
 * P1: (1,2) (3,6) (5,2) (3,1) (6,5)
   P2: ....
   ..
   ..
   PN: (5,6) (1,2) (2,5) (6,3) (3,1) 

PN=?
 */
public class DominoDice {
	
	public static void main(String[] args) {
		
		Map<String, Integer> playerDiceMap = new HashMap<String, Integer>();
		
		int n = 50; // Number of players can be (1 ...... N)
		int r = 5;  // Number of rolls
		
		for(int player=0; player<n; player++){
			
			List<Integer> rolls = new ArrayList<Integer>();
			for(int roll=0; roll<r; roll++){ 
				
				
				//Two Dice [face = 1 to 6]
				int firstDice  = ThreadLocalRandom.current().nextInt(1, 7);
				int secondDice = ThreadLocalRandom.current().nextInt(1, 7);
				
				System.out.printf("(%d, %d) ", firstDice, secondDice);
				
				rolls.add(firstDice);
				rolls.add(secondDice);
			}
			
			Collections.sort(rolls);
			
			System.out.printf(" : P%d  = \t %s \n", player, rolls.toString());
			
			
			Integer value = playerDiceMap.get(rolls.toString());
			
			if(value == null){
				
				playerDiceMap.put(rolls.toString(), player);
				
			}else{
				System.err.println(String.format("P%d already has same combination. As of current player P%d.", value, player));
				break;
			}
			
		}
	
	}

}
