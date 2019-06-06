package game;

/**
 * @author Aguston Bulzomi
 * These class is for  creating objets to be used by a @see Character to: Atack by causingDamage, DefendTheirSelves,etc. 
 * 
 * 
 */

public class Weapon {
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
}
