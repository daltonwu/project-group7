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
    public Basechar(String name, int hp, int ep) {
        setName(name);
        setStatus(hp, ep);
    }
    public Basechar() {
    	hp = 20;
    	ep = 0;
    }
    
    
    // setters and getters
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return this.name;
    }
    
    public String getStatus() {
    	return Integer.toString(this.hp);
    }
    
    public void setStats(int dex, int spd, int str, int wis) {
        this.dex = dex;
        this.spd = spd;
        this.str = str;
        this.wis = wis;
    }
    public String getStats() {
        return "" + this.dex + this.spd + this.str + this.wis;
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
