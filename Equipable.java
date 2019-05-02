package rotmg;

public abstract class Equipable {
    
    private int[] statsModifiers = null;
    private int tier;
    
    public int getStatModifier(int i){
        return statsModifiers[i];
    }
    
    public Equipable(int[] statmods, int tier){
        statsModifiers = statmods;
        this.tier =tier;
    }
    
}
