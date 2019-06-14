package game;
import java.util.*;

public class InfinityGauntlet extends Weapon {
	private ArrayList <Stone> infinityStones;
	public InfinityGauntlet()
	{
		this.infinityStones= new ArrayList<Stone>();
	}
	
	private ArrayList<Stone> getInfinityStones() {
		return infinityStones;
	}

	@Override
	public int causeHarm() {
		
		return getInfinityStones().get(new Random().nextInt()%getInfinityStones().size()).produceAttack();
	}
	@Override
	public int defence() {//

		return getInfinityStones().get(new Random().nextInt()%getInfinityStones().size()).defend();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Infinity Gauntlet";
	}
}