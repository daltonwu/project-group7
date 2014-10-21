public class Cowboy extends Basechar {
    // Cowboy-specific variables
    private int ammo;
    
    
    // constructors
    public Cowboy() {
	    super();
    }
    public Cowboy(String name) {
        super(name, 20, 25, 15, 15, 40, 25);
    }
    
    
    // setters 'n' getters
    public void setAmmo() {
        this.ammo = 6;
    }
    
    
    // ATTACKS
    public int shot() {
    	if(this.getEP() >= 5) {
        	this.ammo -= 1;
        	this.addEP(5);
        	return 10;
    	}
	    return -1;
    }
    
    public int doubleShot() {
    	if(this.getEP() >= 10) {
        	this.ammo -= 2;
        	this.addEP(-10);
        	return 20;
    	}
        return -1;
    }
    
    public int bangBangAttack() {
    	if (this.getEP() >= 24) {
        	this.ammo = 0;
        	this.addEP(-24);
        	return 50;
    	}
        return -1;
    }
}
