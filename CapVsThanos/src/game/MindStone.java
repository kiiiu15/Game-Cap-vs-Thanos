package game;

public class MindStone extends Stone{
	public MindStone() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int produceAttack() {
		return super.getRan().nextInt()*60+50;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
