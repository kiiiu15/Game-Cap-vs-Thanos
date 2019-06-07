/**
 * 
 */
package game;

/**
 * StormBreaker feuereisen
 */
public class StormBreaker extends Weapon {

    public StormBreaker() {
        super();
    }

    @Override
    public int causeHarm() {
        return super.getDamage();
    }

    @Override
    public int defence() {
        return super.getDefenseCapacity();
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if(obj != null && obj instanceof StormBreaker){
            isEqual=true;
        }
        return isEqual & super.equals(obj);
    }

    @Override
    public String toString() {
        return "StormBreaker ";
    }

    
}