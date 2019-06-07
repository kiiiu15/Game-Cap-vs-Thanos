package game;

import java.util.ArrayList;

/**
 * this class is a type of weapon that has an string array of names of people  worthy to use it.
 * the only thing it check is the character´s name.
 */
public class Mjolnir extends Weapon {
	private ArrayList<String> peopleWorthy;
	
	
	
	private ArrayList<String> getPeopleWorthy() {
		return peopleWorthy;
	}



	private void setPeopleWorthy(ArrayList<String> peopleWorthy) {
		this.peopleWorthy = peopleWorthy;
	}



	public Mjolnir() {
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
	
	public boolean addPersonWorthy (String newPersonWorthy) {
		boolean wasAdded=false;
		if (newPersonWorthy != null) {
			getPeopleWorthy().add(newPersonWorthy);
			wasAdded=true;
			
		}
		return wasAdded;
	}
	
	public boolean isPersonWorthy(String personToCheckWorthyness) {
		boolean isWorthy=false;
		if (personToCheckWorthyness != null) {
			if (getPeopleWorthy().contains(personToCheckWorthyness)){
				isWorthy=true;
			}
		}
		return isWorthy;
	}
	
	public 
}
