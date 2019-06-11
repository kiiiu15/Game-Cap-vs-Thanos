package game;

public class CapShield extends Weapon {
	public CapShield() {
		
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
