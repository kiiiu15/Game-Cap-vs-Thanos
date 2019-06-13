package game;

public class RealityStone extends Stone{
	public RealityStone()
	{
		
	}
	@Override
	public int produceAttack() {
		// TODO Auto-generated method stub
		return super.getRan().nextInt()*70+60;
	}

}
