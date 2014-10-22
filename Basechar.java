// All courtesy of yours truly,
//   DW (no, not that DW)

public class Basechar {
    // name of the thing
    private String name;
    
    // health and energy
    // NOTE: hp first is the convention
    private int hp, ep;
    
    // attributes 'n' stuff
    // NOTE: alphabetical order is the convention
    private int dex, spd, str, wis;
    //private int[] stats = {0, 0, 0, 0};
    
    
    // constructors
    // please don't use all of them
    public Basechar(String name, int hp, int ep, int dex, int spd, int str, int wis) {
        setName(name);
        setStatus(hp, ep);
        setStats(dex, spd, str, wis);
    }
    public Basechar(String name, int dex, int spd, int str, int wis) {
        setName(name);
        genericStatus();
        setStats(dex, spd, str, wis);
    }
    public Basechar(String name, int hp, int ep) {
        setName(name);
        setStatus(hp, ep);
        genericStats();
    }
    public Basechar() {
        genericName();
        genericStatus();
        genericStats();
    }
    
    
    // NOTE: the following are generic, but NOT RANDOM.
    public void genericName() {
        setName("Oh God, a Generic Monster!!1!");
    }
    public void genericStatus() {
        setStatus(100, 100);
    }
    public void genericStats() {
        setStats(3, 3, 3, 3);
    }
    
    
    // setters and getters
    // NOTE: getters return ints separated by commas
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
    
    public void setStatus(int hp, int ep) {
        this.hp = hp;
        this.ep = ep;
    }
    public void setHP(int hp) {
        this.hp = hp;
    }
    public void setEP(int ep) {
        this.ep = ep;
    }
    public void addHP(int moreHP) {
        this.hp += moreHP;
    }
    public void addEP(int moreEP) {
        this.ep += moreEP;
    }
    public String getStatus() {
    	return hp + "," + ep;
    }
    public int getHP() {
        return this.hp;
    }
    public int getEP() {
        return this.ep;
    }
    
    public void setStats(int dex, int spd, int str, int wis) {
        this.dex = dex;
        this.spd = spd;
        this.str = str;
        this.wis = wis;
    }
    public String getStats() {
        return this.dex + ","
             + this.spd + ","
             + this.str + ","
             + this.wis;
    }
    public int getStat(String statName) {
        statName = statName.toLowerCase();
        if(statName.equals("dex")) return this.dex;
        if(statName.equals("spd")) return this.spd;
        if(statName.equals("str")) return this.str;
        if(statName.equals("wis")) return this.wis;
        else return -1;
    }
    /*
    public int getStat(String statName) {
        statName = statName.lower();
        switch (statName) {
            case "dex": return this.dex;
                        break;
            case "spd": return this.spd;
                        break;
            case "str": return this.str;
                        break;
            case "wis": return this.wis;
                        break;
        }
    }
    */
    
    /*
    public void setStats(int[] stats) {
        for(int i=0; i<this.stats.length; i++) {
            this.stats[i] = stats[i];
        }
    }
    public int[] getStats() {
        return stats;
    }
    */
    
    
    // ATTACKS 'N' COOL STUFF LIKE THAT
    public int verbalAbuse() {
        // 0 energy required
        // returns int dmg = str / 3
        return str/3;
    }
    public int whack() {
        // 2 energy required
        // returns int dmg = str / 2
        if(ep < 0) return 0;
        
        ep -= 2;
        return str/2;
    }
    
    
    // RECOVER ENERGY or HP or EP
    public int lickWounds() {
        // it's an expression, okay?
        int moreHP = str;
        this.addHP(moreHP);
        return moreHP;
    }
    public int chill() {
        int moreEP = wis;
        this.addEP(moreEP);
        return moreEP;
    }
}
