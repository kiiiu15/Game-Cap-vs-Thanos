package game;
import java.util.*;

public class InfinityGauntlet extends Weapon {
	private HashSet<Stone>infinityStone;
	public InfinityGauntlet()
	{
		this.infinityStone= new HashSet<Stone>();
	}
	@Override
	public int causeHarm() {

		return 0;//we have to modify the main method, it's incomplete. 
	}
	@Override
	public int defence() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Infinity Gauntlet";
	}
}