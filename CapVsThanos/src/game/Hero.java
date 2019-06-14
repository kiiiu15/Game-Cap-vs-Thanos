package game;

/**
 * 
 * @author Martin Fernandez
 * 
 *
 */

public class Hero extends Character{

	public Hero()
	{
		super();
	}
	public Hero(String name,int life)
	{
		super(name, life);
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
