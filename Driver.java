import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	String s = "";
	String PlayerChar = new Driver().AskUser("Choose a character([c] for Cowboy or [n] for  Ninja?): ");
        String name = new Driver().AskUser("Choose your character's name: ");
	
	Cowboy c;
	Ninja n;
	PlayerChar = PlayerChar.toLowerCase();
	
	if (PlayerChar.equals("c")){
	    c = new Cowboy(name);
	    n = new Ninja();
	}
	else{
	    n = new Ninja(name);
	    c = new Cowboy();
	}
	//System.out.println("Your Character's name is: " + c.getName());

        String log = "";
	while (c.getHP()>0 && n.getHP()>0){
	    log = log + new ContinueEncounter(PlayerChar,c,n,log);
	}

	//s = "done";
	if ((n.getHP() == 0 && PlayerChar.equals("c"))||
	    (c.getHP() == 0 && PlayerChar.equals("n"))){
	    System.out.println("Congratulations! You've won!");
	}
	else{
	    System.out.println("Sorry, you've lost");
	}
    }

    public String AskUser(String mToUser){
	String s = "";
	Scanner sc = new Scanner(System.in);
	System.out.print(mToUser);
	s = sc.nextLine();
	return s;
    }

    public String ContinueEncounter(String PlayerChar, Cowboy x, Ninja y, String log){
    	String s = "";
    	s = AskUser("Attack or Defend?");
    	if (PlayerChar.equals("c")){
    	    if (s.equals("Attack") && c.getEP()>5){
		r = AskUser("Shoot, DoubleShoot, or ___?");
		r = r.toLowerCase();
    		if (r.equals("shoot")){c.shot();}
		else if(r.equals("doubleshoot")){c.doubleShot();}
		else if(r.equals("___")){c.bangBangAttack();}
    	    }
    	    else if (s.equals("Defend")){
    		c.defend();
    	    }
    	}
        else{
    	    if (s.equals("Attack") && n.getEP()>5){
		r = AskUser("ThrowStars, SuperKick, or StarCombo?");
		r = r.toLowerCase();
		if (r.equals("throwstars")){n.throwStars();} 
		else if(r.equals("superkick")){n.superKick();}
		else if(r.equals("starcombo")){n.starCombo();}
	    }
	    else if (s.equals("Defend")){
    		n.defend();
    	    }
    	}
    }	
	
}
