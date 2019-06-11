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
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual=false;
		if (obj != null && obj instanceof CapShield) {
			CapShield temporary = (CapShield) obj;
			if (temporary.toString().equals(this.toString())) {
				isEqual=true;
			}
		}
		return isEqual;
	}
	
	@Override
	public String toString() {
		String str=new String();
		str="I´m Captian America´s shield, i didn´t broke even over Mjolnir but i just broke apart before thano´s wierd metal thing... i have atack: "+getDamage()+" and defence: "+getDefenseCapacity();
		return str;
	}
}
