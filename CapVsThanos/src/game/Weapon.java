package game;

/**
 * @author Aguston Bulzomi
 * These class is for  creating objets to be used by a @see Character to: Atack by causingDamage, DefendTheirSelves,etc. 
 * it´s a conteniener for all weapons ans it´s abstractac beacause its has a abstrac metod 
 * 
 */

public abstract class Weapon {
	private int damage;
	private int defenseCapacity;
	
	
	
	
	private int getDamage() {
		return damage;
	}




	private void setDamage(int damage) {
		this.damage = damage;
	}




	private int getDefenseCapacity() {
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
	 * @return int that represents how much defense againts an atack
	 */
	
	public abstract int defence() ; 
	
}
