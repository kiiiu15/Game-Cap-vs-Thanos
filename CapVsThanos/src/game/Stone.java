package game;

import java.util.Random;
/**
 * 
 * @author Agustin Bulzomi
 * This class is ment to be a container for infinitystones; 
 * it has a random to be used by it´s subclaases to  produce an atcck; 
 *
 */
public abstract class Stone {
		
	private Random stonePower;
	
	
	protected Random getStonePower() {
		return stonePower;
	}


	public Stone() {
			
	}
	
	protected abstract int produceAtack();
		
		
}
