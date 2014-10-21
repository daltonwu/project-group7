import java.util.*;
import java.io.*;

public class Driver {
    private static Scanner sc = new Scanner(System.in);
    
    private static Cowboy c;
    private static Ninja  n;
    
    private static String PlayerChar, name;
    
    public static void main(String[] args){
        PlayerChar = this.AskUser("Choose a character.\n  [c] for Cowboy or \n  [n] for Ninja: ");
        name = this.AskUser("Choose your character's name: ");
        
    	if(PlayerChar.equals("c")) {
    	    c = new Cowboy(name);
    	    n = new Ninja();
    	}
    	else {
    	    n = new Ninja(name);
    	    c = new Cowboy();
    	}
    	// System.out.println("Your Character's name is: " + c.getName());
    	
    	while (c.getHP()>0 && n.getHP()>0) {
    	    this.ContinueEncounter(PlayerChar,c,n);
    	    this.ComputerResponse(PlayerChar,c,n);
    	}
    	
    	if((n.getHP() == 0 && PlayerChar.equals("c"))
        || (c.getHP() == 0 && PlayerChar.equals("n"))) {
    	    System.out.println("Congratulations! You've won!");
    	}
    	else {
    	    System.out.println("Sorry, you've lost.");
    	}
    }
    
    public String AskUser(String mToUser){
    	System.out.print(mToUser);
    	String s = sc.nextLine();
    	return s.toLowerCase();
    }
    
    public String ContinueEncounter(String PlayerChar, Cowboy x, Ninja y){
        String s = AskUser("Attack or Defend?"); // only attack for now
        if (PlayerChar.equals("c")) {
                if (s.equals("attack")) {
                    if (c.getEP() == 0) {
                        r = AskUser("[1]LickWounds, [2]Chill");
                        if (r.equals("1")) {
                            c.lickWounds();
                        }
                        else {
                            c.chill();
                        }
                    }
        		else {
        		    int i = 0;
        		    while (i != -1) {	
            			r = AskUser("[1]Shoot, [2]DoubleShoot, or [3]BangAttack?");
            			if(r.equals("1") && c.getEP()>=5) {
            			    c.shot();
            			    i=1;
            			}
            			else if(r.equals("2") && ep>=10){c.doubleShot(); i=1}
            			else if(r.equals("3") && ep>=24){c.bangBangAttack(); i=1}
            			else{i=-1}
		    }
		}
    	    }
    	    // else if (s.equals("Defend")){
    	    // 	c.defend();
    	    // }
    	}
        else{
	    int ep = n.getEP();
    	    if (s.equals("attack")){
		if (ep == 0){
		    r = AskUser("[1]LickWounds,[2]Chill");
		    if (r.equals("1")){n.lickWounds()}
		    else {n.chill()}
		else{
		    int i = 0;
		    while (i != -1){
			r = AskUser("[1]ThrowStars, [2]SuperKick, [3]StarCombo, or [4]Katana?");
			if (r.equals("1")&& ep>=5){n.throwStars(); i=1} 
			else if(r.equals("2"&& ep>=7)){n.superKick(); i=1}
			else if(r.equals("3"&& ep>=10){n.starCombo(); i=1}
			else if(r.equals("4"&& ep>=1)){n.katanaHit(); i=1}
			else{i=-1;}
		    }
		}  
    	    }
    	    // else if (s.equals("Defend")){
    	    // 	n.defend();
    	    // }
    	}
    }	
    
    public String ComputerResponse(String PlayerChar, Cowboy x, Ninja y){
    	Random r = new Random();
    	int d = r.nextInt(4);
    	if (PlayerChar.equals("c")){
    	    if (d.equals("0")){n.throwStars();} 
    	    else if(d.equals("1")){n.superKick();}
    	    else if(d.equals("2")){n.starCombo();}
    	    else {n.katanaHit();}
    	}
    	else{
    	    if (d.equals("0")){c.shot();}
    	    else if(d.equals("1")){c.doubleShot();}
    	    else {c.bangBangAttack();}
    	}
    }
}
