package game;

public class Battle <T extends Icombat, K extends Icombat> {
	
	
	private  void oneAtackEach(T playerOne, K playerTwo) {
		playerTwo.getAtacked(playerOne.atack());
		playerOne.getAtacked(playerTwo.atack());
	} 
	
	public  String fightToDeath(T playerOne, K playerTwo) {
		String winner= new String();
		while (playerOne.lifeLeft() > 0 && playerTwo.lifeLeft() > 0) {
			oneAtackEach(playerOne, playerTwo);
		}
		
		if (playerOne.lifeLeft()==0 && playerTwo.lifeLeft()==0) {
			winner="tie";
			
		}else {
			if (playerTwo.lifeLeft()==0){
				winner=playerOne.toString();
			}else {
				winner=playerTwo.toString();
			}
		}
		return winner;
	}

}
