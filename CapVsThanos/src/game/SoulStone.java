package game;

public class SoulStone extends Stone{
	public SoulStone()
	{
		
	}
	@Override
	public int produceAttack() {
		// TODO Auto-generated method stub
		return super.getRan().nextInt()*40*50;
	}

}
