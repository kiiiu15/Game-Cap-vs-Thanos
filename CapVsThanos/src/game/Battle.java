package game;
/**
 * 
 * @author Agustin Bulzomi
 * this class is meant  to be used  for makin two things no matter what are they to fight against each other; 
 * it´s only requirement is that they implemnts @see Icombat; 
 * it provides an method where they can fight to death. 
 *
 */
public class Battle <K extends Icombat, T extends Icombat> {
	public Battle() {
		
	}
	
	public void oneAtackEach(K playerOne, T playerTwo) {
		playerTwo.getAtacked(playerOne.atack());
		playerOne.getAtacked(playerTwo.atack());
	}
	
	public String battleToDeath (K playerOne, T playerTwo) {
		String winner= new String ();
		while (playerOne.lifeLeft()>0 && playerTwo.lifeLeft()>0) {
			oneAtackEach(playerOne, playerTwo);
		}
		return winner; 
	}
	
	
}
