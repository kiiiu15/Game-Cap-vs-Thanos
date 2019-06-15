package game;
/**
 * 
 * @author Martin Fernandez
 *
 */
public class Villain extends Character{

	private int ambition; 
	
	public Villain()
	{
		super();
		ambition=0;
	}
	
	public Villain(String name, int life)
	{
		super(name,life);
		ambition=0;
	}

	@Override
	public int atack() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int defendYourSelf(int protection) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void getAtacked(int damageRecieved) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int lifeLeft() {
		// TODO Auto-generated method stub
		return 0;
	}

}
