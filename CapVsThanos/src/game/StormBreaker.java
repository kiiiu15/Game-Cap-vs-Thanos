package game;

public class StormBreaker extends Weapon {
	public StormBreaker() {
		
	}

	@Override
	public int causeHarm() {
		// TODO Auto-generated method stub
		return super.getDamage();
	}

	@Override
	public int defence() {
		// TODO Auto-generated method stub
		return super.getDefenseCapacity();
	}
	
	
	
	
}
