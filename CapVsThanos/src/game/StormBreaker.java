package game;

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
