public class Ninja extends Basechar {
	// Ninja-specific variables
	private int stars, katana;
	
	
	// constructors
    public Ninja() {
        super();
        setStars();
        setKatana();
    }
    public Ninja(String name) {
	    super(name, 20, 30, 30, 30, 10, 10);
	    setStars();
	    setKatana();
    }
    
    
    // setters 'n' getters
    public void setStars() {
	    this.stars = 10;
    }
    public int getStars() {
        return this.stars;
    }
    
    public void setKatana() {
    	katana = 1;
    }
    public int getKatana() {
        // presumably necessary at some point in the future??
        return this.katana;
    }
    
    
    // ATTACKS
    public int throwStars() {
	    if(this.getEP() >= 5) {
        	this.addEP(-5);
        	this.stars -= 1;
        	return 5;
	    }
	    return -1;
    }
    
    public int superKick() {
    	if(this.getEP() >= 7) {
            this.addEP(-7);
    	    return 10;
    	}
	    return -1;
    }
    
    public int starCombo() {
    	if(this.getEP() >= 10) {
        	this.addEP(-10);
        	this.stars -= 5;
        	return 15;
    	}
    	return -1;
    }

    public int katanaHit() {
    	if (this.getEP() >= 1) {
    		this.addEP(-1);
    		return 5;
    	}
    	return -1;
    }
}
