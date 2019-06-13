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

}
