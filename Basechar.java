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
    // please don't use them
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
        setStatus(20, 0);
    }
    public void genericStats() {
        setStats(0, 0, 0, 0);
    }
    
    // setters and getters
    // NOTE: getters return ints separated by spaces
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
    public String getStatus() {
    	return hp + "," + ep;
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
}
