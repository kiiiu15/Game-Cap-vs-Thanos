package game;

/**
 * @author Aguston Bulzomi
 * This class is to create objects used by a @see Character to: Atack by causingDamage, DefendThemSelves,etc. 
 * it´s a container for all weapons and it´s abstract because it has a abstract method 
 * 
 */

public abstract class Weapon {
	private int damage;
	private int defenseCapacity;
	
	
	
	
	protected int getDamage() {
		return damage;
	}




	private void setDamage(int damage) {
		this.damage = damage;
	}




	protected int getDefenseCapacity() {
		return defenseCapacity;
	}




	private void setDefenseCapacity(int defenseCapacity) {
		this.defenseCapacity = defenseCapacity;
	}




	public Weapon() {
		
	}
	/**
	 * @param none
	 * @return int damage caused  by weapon
	 * 
	 */
	public abstract int causeHarm();// every Weapon just cause harm in a diferent way; 
	
	/**
	 * @parm none
	 * @return int that represents how much defense against an atack
	 */
	
	public abstract int defence() ; 
	
}
