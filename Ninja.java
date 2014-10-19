public class Ninja extends Basechar {
    public Ninja(String name, int hp, int ep, int dex, int spd, int str, int wis) {
	super (name, 20, 30, 30, 30, 30, 10, 10);
    }

    public void attack (Basechar other) {
	System.out.println(this + " is attacking " + other);
    }

    public void defend (Basechar other){
	System.out.println(this + " is defending against " + other);
    }




}
