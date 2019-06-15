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
	@Override
	public int defend() {
		// TODO Auto-generated method stub
		return 0;
	}

}
