public class Basechar {
    // name of the thing
    private String name;
    
    // health and energy
    private int hp, ep;
    
    // attributes 'n' stuff
    private int str, wis, spd, dex;
    
    
    // constructors
    public Basechar(String name, int hp, int ep) {
        setName(name);
        setHP(hp);
        setEP(ep);
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
    
    public void setHP(int hp) {
    	this.hp = hp;
    }
    public int getHP() {
    	return hp;
    }
    
    public void setEP(int ep) {
    	this.ep = ep;
    }
    public int getEP() {
    	return ep;
    }
}
