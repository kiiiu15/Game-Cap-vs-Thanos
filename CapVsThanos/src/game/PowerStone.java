package game;

public class PowerStone extends Stone{
	public PowerStone() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int produceAttack() {
		//
		return super.getRan().nextInt()%100+80;
	}
	@Override
	public int defend() {
		// TODO Auto-generated method stub
		return 0;
	}

}
