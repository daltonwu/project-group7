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
    
    public void setKatana(){
    	katana = 1;
    }

    public int throwStars(){
	if (ep >= 5){
	dmg = 5;
	stars -= 1;
	ep -= 5;
	return dmg;
	}else {
	    return -1;
	}
    }
    

    public int superKick(){
	if (ep >= 7){
	dmg = 10;
	ep -= 7;
	return dmg;
	}else{
	    return -1;
	}
    }

    public int starCombo(){
	if (ep >= 10){
	dmg = 15;
	ep -= 10;
	stars -= 5;
	return dmg;
	}else {
	    return -1;
	}
    }

public int katanaHit(){
	if (ep >= 1){
		dmg = 5;
		ep -= 1;
		return dmg;
	}else {
		return -1;
	}
}




}
