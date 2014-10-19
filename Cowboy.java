public class Cowboy extends Basechar {

    private int ammo;
    
    public Cowboy(String name, int hp, int ep, int dex, int spd, int str, int wis){
    super(name, 20, 25, 15, 15, 40, 25);
    }
    
    public void setAmmo(){
    ammo = 6;
    }

    public void getEnergy(){
	
    }

    public String attack(Basechar other){
    return name + "attacked that darn ninja vermon";
    }


}
