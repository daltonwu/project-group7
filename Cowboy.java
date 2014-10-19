public class Cowboy extends Basechar {

    private int ammo;
    private int dmg;

    public Cowboy(String name, int hp, int ep, int dex, int spd, int str, int wis){
    super(name, 20, 25, 15, 15, 40, 25);
    }
    
    public void setAmmo(){
    ammo = 6;
    }

    public void getEnergy(){
	
    }

    public int shot(){
	dmg = 10;
	ammo = ammo - 1;
	ep = ep - 5
	return dmg;
    }

    public int doubleShot(){
	ammo = ammo - 2;
	dmg = 20;
	ep = ep -10;
	return dmg;
    }

    public int bangBangAttack(){
	ammo = 0;
	dmg = 50;
	ep = ep - 24;
	return dmg;

    }
}
