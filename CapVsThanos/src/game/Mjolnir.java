package game;

import java.util.ArrayList;

/**
 * this class is a type of weapon that has an string array of names of people  worthy to use it.
 * the only thing it check is the character´s name.
 */


class Mjolnir extends Weapon {
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
	
	public boolean removePeopleWorthy (String personToRemove) {
		boolean wasDeleted=false;
		if (personToRemove != null) {
			if (getPeopleWorthy().contains(personToRemove)) {
				getPeopleWorthy().remove(personToRemove);
				wasDeleted=true;
			}
		}
		return wasDeleted;
	}
	
	@Override
		public boolean equals(Object obj) {
			boolean isEqual=false;      
			if (obj != null && obj instanceof Mjolnir) {
				isEqual=true;
			}
			return isEqual;
		}
	
	@Override
		public String toString() {
			String strToReturn="this is Mjolnir, Thor's hammer that has a worthyness enchantment setted by Odin in Thor's first movie movie; only people who are worthy of it can use it's power";
			return strToReturn;
		}
}
