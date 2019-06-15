package game;

public class SpaceStone extends Stone {
	public SpaceStone()
	{
		
	}
	@Override
	public int produceAttack() {
		// TODO Auto-generated method stub
		return super.getRan().nextInt()*80+70;
	}
	@Override
	public int defend() {
		// TODO Auto-generated method stub
		return 0;
	}
}
