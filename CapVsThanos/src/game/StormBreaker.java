package game;


/**
 * 
 * @author Agustin Bulzomi
 * this i ment to be used as an object of type weapon for  any charater
 * @see  Character
 *  
 */
public class StormBreaker extends Weapon {
	public StormBreaker() {
		super();
	}

	@Override
	public int causeHarm() {
		return super.getDamage();
	}

	@Override
	public int defence() {
		return super.getDefenseCapacity();
	}
	
	
	
	
}
