
package rotmg;

abstract class CharacterClass {
    
    private String title;
    private static int HitPoints = 0;
    private static int Mana = 1;
    private static int Attack = 2;
    private static int Defense = 3;
    private static int Speed = 4;
    private static int Dexterity = 5;
    private static int Vitality = 6;
    private static int Wisdom = 7;
    private int[] capStats;
    private int[] baseStats;
    private int[] currentUnmodifiedStats;
    private int[] currentModifiedStats;
    private Weapon weapon = null;
    private Ability ability = null;
    private Armour armour = null;
    private Ring ring = null;

    
    public CharacterClass(int[] capStats, int[] baseStats){
        this.capStats = capStats;
        this.baseStats = baseStats;
        currentUnmodifiedStats = baseStats;
        checkEquipment();
    }
    
    //if the character has equipment then it will get the stats and add them to 
    //complete the current modified stats setup
    private void checkEquipment(){
        currentModifiedStats = currentUnmodifiedStats;
        if(!weapon.equals(null)){
            for(int i = 0; i < currentModifiedStats.length; i++){
                currentModifiedStats[i] += weapon.getStatModifier(i);
            }
        }
        if(!ability.equals(null)){
            for(int i = 0; i < currentModifiedStats.length; i++){
                currentModifiedStats[i] += ability.getStatModifier(i);
            }
        }
        if(!armour.equals(null)){
            for(int i = 0; i < currentModifiedStats.length; i++){
                currentModifiedStats[i] += armour.getStatModifier(i);
            }
        }
        if(!ring.equals(null)){
            for(int i = 0; i < currentModifiedStats.length; i++){
                currentModifiedStats[i] += ring.getStatModifier(i);
            }
        }
    }
    
    //getting the cap stats
    public int getCapHitPoints(){
        return capStats[HitPoints];
    }
    public int getCapMana(){
        return capStats[Mana];
    }
    public int getCapAttack(){
        return capStats[Attack];
    }
    public int getCapDefense(){
        return capStats[Defense];
    }
    public int getCapSpeed(){
        return capStats[Speed];
    }
    public int getCapDexterity(){
        return capStats[Dexterity];
    }
    public int getCapVitality(){
        return capStats[Vitality];
    }
    public int getCapWisdom(){
        return capStats[Wisdom];
    }
    
    //getting the base stats
    public int getBaseHitPoints(){
        return baseStats[HitPoints];
    }
    public int getBaseMana(){
        return baseStats[Mana];
    }
    public int getBaseAttack(){
        return baseStats[Attack];
    }
    public int getBaseDefense(){
        return baseStats[Defense];
    }
    public int getBaseSpeed(){
        return baseStats[Speed];
    }
    public int getBaseDexterity(){
        return baseStats[Dexterity];
    }
    public int getBaseVitality(){
        return baseStats[Vitality];
    }
    public int getBaseWisdom(){
        return baseStats[Wisdom];
    }
    
}
