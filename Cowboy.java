public class Cowboy extends Basechar {
    // Cowboy-specific variables
    private int ammo;
    
    
    // constructors
    public Cowboy() {
	    super();
	    this.setAmmo();
    }
    public Cowboy(String name) {
        super(name, 20, 25, 15, 15, 40, 25);
        this.setAmmo();
    }
    
    
    // setters 'n' getters
    public void setAmmo() {
        this.ammo = 6;
    }
    
    public String getName(){
	return super.toString();
    }
    
    // ATTACKS
    public int shot() {
    	if(this.getEP() >= 5) {
        	this.addEP(-5);
            this.ammo -= 1;
        	return 10;
    	}
	    return -1;
    }
    
    public int doubleShot() {
    	if(this.getEP() >= 10) {
        	this.addEP(-10);
        	this.ammo -= 2;
        	return 20;
    	}
        return -1;
    }
    
    public int bangBangAttack() {
    	if (this.getEP() >= 24) {
        	this.addEP(-24);
        	this.ammo = 0;
        	return 50;
    	}
        return -1;
    }
}
