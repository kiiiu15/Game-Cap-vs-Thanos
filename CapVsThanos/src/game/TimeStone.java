package game;
/**
 * 
 * @author Agustin Bulzomi
 * This class  only´s porpuse is to  call @see Stone ramdom getter and use limitator to implemnt produce atacks  
 * @version 0.1
 */
public class TimeStone extends Stone {
	public TimeStone() {
		super();
	}

	@Override
	protected int produceAtack() {
		
		return super.getStonePower().nextInt()%80+50;
	}
	
	
}
