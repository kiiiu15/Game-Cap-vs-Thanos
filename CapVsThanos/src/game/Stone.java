package game;

import java.util.Random;

/**
 * 
 * @author Celeste Masmut
 * this class is an abstract class and is related to InfinityGauntler class. 
 * it has an abstract method called produceAttack which its return is an int . 
 * every stone will extends from this one. 
 */
public abstract class Stone {
	private Random ran;
	public Stone()
	{
		this.ran= new Random();
	}
	
	protected Random getRan()
	{
		return this.ran;
	}
	public abstract int produceAttack();
	
	@Override
	public String toString() {
		
		return "I am ";
	}
	@Override
	public boolean equals(Object obj) {
		boolean isEqual=false;
		if(obj!=null && obj instanceof Stone)
		{
			isEqual=true;
		}
		return isEqual;
	}

}
