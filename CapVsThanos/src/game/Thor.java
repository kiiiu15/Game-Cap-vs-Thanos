package game;

public class Thor extends Hero{
	public Thor() {
		super("Thor", 9 );
		// TODO Auto-generated constructor stub
	}
	public String thorName()
	{
		return super.obtainName();
	}
	public int thorLife()
	{
		return super.obtainLife();
	}

}
