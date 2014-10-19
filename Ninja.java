public class Ninja extends Basechar {
    public Ninja(String name, int hp, int ep, int dex, int spd, int str, int wis) {
	super (name, 20, 30, 30, 30, 30, 10, 10);
    }

    //im just gunna call the ninja weapon thing stars
    private int stars;
   
    private int dmg;

    public void setStars(){
	stars = 10;
    }

    public int throwStars(){
	dmg = 5;
	stars -= 1;
	ep -= 5;
	return dmg;
    }

    public int superKick(){
	dmg = 10;
	ep -= 7;
	return dmg;
    }

    public int starCombo(){
	dmg = 15;
	ep -= 10;
	stars -= 5;
	return dmg;
    }





}
