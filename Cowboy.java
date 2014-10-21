public class Cowboy extends Basechar {

    private int ammo;
    private int dmg;
    private int ep;

    public Cowboy(){
	super();
    }

    public Cowboy(String name){
    super(name, 20, 25, 15, 15, 40, 25);
    }
    
    public void setAmmo(){
    ammo = 6;
    }

    public void setEP(){
	int ep = super.getEP();
    }

    public void getEnergy(){
	
    }

    public int shot(){
	if (ep >= 5){
	dmg = 10;
	ammo -= 1;
	ep -= 5
	return dmg;
	}
	else {
	    return -1;
	}
    }

    public int doubleShot(){
	if (ep >= 10){
	ammo -= 2;
	dmg = 20;
	ep -= 10;
	return dmg;
	}
	else {
	    return -1;
	}
    }

    public int bangBangAttack(){
	if (ep >= 24){
	ammo = 0;
	dmg = 50;
	ep -= 24;
	return dmg;
	}
	else {
	    return -1;
	}

    }
}
