package game;

/**
 * 
 * @author Agustin Bulzomi
 * The reason for this  Interface is because since every character actacks diferently 
 * and these methods are meant to be used on another class  apart from character @see Character or
 * it´s specifications.
 * 
 * in every combat people involved atacks others, defends thereselves and recieve damage; 
 * all while they still have "life" left;
 * @version 0.2
 */

public interface Icombat {
	public int atack ();              
	public int defendYourSelf(int protection);
	public void getAtacked(int damageRecieved );
	public int lifeLeft();
}
