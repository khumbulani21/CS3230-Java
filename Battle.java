
import java.util.Random;
 
import java.util.Arrays;

public class Battle {
    static Random random = new Random();
    static final int DIE_SIDES = 6;
    
    public static int rollDie(int sides) {
	return random.nextInt(sides) + 1;
    }
    
    // doDice FUNCTION GOES HERE
    //The first parameter is the number of attacker dice and the second parameter is the number of defender dice.
    public static  int [] doDice(int attackerDice, int defenderDice)
    {
    	
    	int numberOfDiceToCompare=Math.min(attackerDice, defenderDice);
     
    	int [] resultArray=new int[2];
    	resultArray[0]=0;
    	resultArray[1]=0;


    	int [] attackerDiceResults= new int [attackerDice];
    	int [] defenderDiceResults= new int [defenderDice];
    	//roll die for attacker
    	for(int i=0; i<attackerDice; i++)
    	{
    		attackerDiceResults[i]=rollDie(DIE_SIDES);
    		System.out.println("attacker rolled a " + attackerDiceResults[i]);
    	}
    	
    	for(int i=0; i<defenderDice; i++)
    	{
    		defenderDiceResults[i]=rollDie(DIE_SIDES);
    		System.out.println("defender rolled a " + defenderDiceResults[i]);
    	}
	   
    
	    	
    	
	    //sort the array for easy comparison
    	Arrays.sort(attackerDiceResults);
    	Arrays.sort(defenderDiceResults);
    	
    	
     
	  //compare the dice
	  for(int i=0;i<numberOfDiceToCompare;i++)
	 {
		  if(attackerDiceResults[i]> defenderDiceResults[i])
		  {
		 
			 //add one to the number of armies lost by the defender
		    	resultArray[1]++;
  
		  }
		  else if(attackerDiceResults[i]< defenderDiceResults[i]||attackerDiceResults[i]== defenderDiceResults[i])
		  {
				 //add one to the number of armies lost by the attacker
			  resultArray[0]++;
		  }
			  
		 
	 }
    	
    System.out.println("The attacker lost "+  resultArray[0]+ " armies");
    System.out.println("The defender lost "+  resultArray[1]+ " armies");
    	 return resultArray;
		
		
		
		
    	
    }

    
    public static int[] runBattle(int attackers, int defenders) {
	int aleft = attackers;
	int dleft = defenders;
	int adice, ddice;
	int[] diceResult;
	
	while (aleft > 1 && dleft > 0) {
	    adice = Math.min(aleft, 2);
	    ddice = Math.min(dleft, 2);
	    diceResult = doDice(adice, ddice);
	    aleft -= diceResult[0];
	    dleft -= diceResult[1];
	}

	int[] battleResult = new int[2];
	battleResult[0] = aleft;
	battleResult[1] = dleft;
	return battleResult;
    }
    
    public static void main(String[] args) {
	int attacker = 5;
	int defender = 4;
	int[] battleResult;

	battleResult = runBattle(attacker, defender);
	int aleft = battleResult[0];
	int dleft = battleResult[1];
	if (aleft > 1 && dleft == 0) {
	    System.out.printf("Attacker won with %d armies left.\n", aleft);
	} else {
	    System.out.printf("Attack failed. "
			      + "%d attackers left and %d defenders left.\n",
			      aleft, dleft);
	}
    }
}