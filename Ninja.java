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

    public String getName(){
	return super.toString();
    }
    
    
    // ATTACKS
    public int throwStars(Basechar other) {
	    if(this.getEP() >= 5) {
		int dmg = 10;
		this.addEP(-5);
        	this.stars -= 1;
		other.addHP(-dmg);
        	return 5;
	    }
	    return -1;
    }
    
    public int superKick(Basechar other) {
    	if(this.getEP() >= 7) {
	    int dmg = 20;
            this.addEP(-7);
	    other.addHP(-dmg);
    	    return 10;
    	}
	    return -1;
    }
    
    public int starCombo(Basechar other) {
    	if(this.getEP() >= 10) {
	    int dmg = 25;
	    this.addEP(-10);
	    this.stars -= 5;
	    other.addHP(-15);
	    return 15;
    	}
    	return -1;
    }

    public int katanaHit(Basechar other) {
    	if (this.getEP() >= 1) {
	    int dmg = 15;
	    this.addEP(-1);
	    other.addHP(-10);
	    return 5;
    	}
    	return -1;
    }
}
