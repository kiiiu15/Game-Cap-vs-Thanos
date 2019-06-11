package game;

/**
 * 
 * @author Agustin Bulzomi
 * this class is meant to be used as a container for both, villian and hero;
 *  it implemnts icombats beacuse we want them to fight
 *	@version 0.2
 *
 */

public abstract class Character implements Icombat {
	
	private int life;
	private String name;
	
	
	
	private int getLife() {
		return life;
	}



	private void setLife(int life) {
		this.life = life;
	}



	private String getName() {
		return name;
	}



	private void setName(String name) {
		this.name = name;
	}



	public Character() {
		
	}
	
	
	@Override
	public boolean equals(Object obj) {
		boolean isEqual=false;      
		if (obj != null && obj instanceof Character) {
			if (this.toString().equals(obj.toString())){
				 isEqual=true;
			}
		}
		return isEqual;
	}

@Override
	public String toString() {
		String strToReturn="I'm" +getName();
		return strToReturn;
	}
	
}
