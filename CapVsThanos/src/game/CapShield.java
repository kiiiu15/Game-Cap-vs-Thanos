package game;

/**
 * CapShield Feuereisen 
 */
public class CapShield extends Weapon {

    public CapShield() {
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
        boolean isEqual=false;
        if(obj != null && obj instanceof CapShield){
            isEqual=true;
        }
        return isEqual;
    }
    
    
    
}