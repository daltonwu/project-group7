import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	String s = "";
	String PlayerChar = new Driver().AskUser("Choose a character([c] for Cowboy or [n] for  Ninja?): ");
        String name = new Driver().AskUser("Choose your character's name: ");
	
	Cowboy c;
	Ninja n;
	if (PlayerChar.equals("c")){
	    c = new Cowboy(name);
	    n = new Ninja();
	}
	else{
	    n = new Ninja(name);
	    c = new Cowboy();
	}
	//System.out.println(c.getName());

	String log = "";
	int turn = 1;
	while (turn <= 5 && c.getHP()>0 && n.getHP()>0){
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
		c.attack();
	    }
	    else if (s.equals("Defend")){
		c.defend();
	    }
	}
        else{
	    if (s.equals("Attack") && n.getEP()>5){
		n.attack();
	    }
	    else if (s.equals("Defend")){
		n.defend();
	    }
    	}
    }	
		
}
