import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args){
	String PlayerChar = new Driver().AskUser("Choose a character([c] for Cowboy or [n] for  Ninja?): ");
        String name = new Driver().AskUser("\nChoose your character's name: ");
	
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
	System.out.println("\nHey " + c.getName() + "!");
	String GameOver = "";

	while (c.getHP()>0 && n.getHP()>0 && (!GameOver.equals("y"))){
	    int User = 1;
	    int Comp = 1;

	    /////////////////////
	    /// USER RESPONSE ///
	    /////////////////////
	    
	    pause(1000);

	    String s = new Driver().AskUser("\n~~~~~~~~~~~~~~~~~~~~\nAttack? [y]yes or [n]no: "); // only attack for now

	    if (s.equals("exit")){
		System.out.println("Your Game is Over.");
		GameOver = "y";
	    }
		
	    else if (PlayerChar.equals("c")){
		int ep = c.getEP();
		while (s.equals("y")&&User==Comp){
		    if (ep <= 5){
			String r = new Driver().AskUser("\nSorry, you need to build up your energy first. [1]LickWounds,[2]Chill: ");
			if (r.equals("1")){c.lickWounds();}
			else {c.chill();}
			User += 1;
		    }
		    else{
			int i = 0;
			while (i != -1&&User==Comp){	
			    String r = new Driver().AskUser("\n[1]Shoot, [2]DoubleShoot, or [3]BangAttack? ");
			    if (r.equals("1") && ep>=5){c.shot(n); i=1;}
			    else if(r.equals("2") && ep>=10){c.doubleShot(n); i=1;}
			    else if(r.equals("3") && ep>=24){c.bangBangAttack(n); i=1;}
			    else{i=-1;System.out.print("\nSorry, you don't have enough energy for this action.\n");User-=1;}
			    User += 1;
			}
		    }
		    System.out.println("\nYour current energy level is "+c.getEP()+"\nYour opponent's health is"+n.getHP());
		}
	    }
	    else{
		int ep = n.getEP();
		while (s.equals("y")&&User==Comp){
		    if (ep == 0){
			String r = new Driver().AskUser("\n[1]LickWounds,[2]Chill");
			if (r.equals("1")){n.lickWounds();}
			else {n.chill();}
			User += 1;
		    }
		    else{
			int i = 0;
			while (i != -1&&User==Comp){
			    String r = new Driver().AskUser("\n[1]ThrowStars, [2]SuperKick, [3]StarCombo, or [4]Katana? ");
			    if (r.equals("1")&& ep>=5){n.throwStars(c); i=1;} 
			    else if(r.equals("2")&& ep>=7){n.superKick(c); i=1;}
			    else if(r.equals("3")&& ep>=10){n.starCombo(c); i=1;}
			    else if(r.equals("4")&& ep>=1){n.katanaHit(c); i=1;}
			    else{i=-1;System.out.print("\nSorry, you don't have enough energy for this action.");User-=1;}
			    User += 1;
			}
		    }  
		    User += 1;
		}
		System.out.println("\nYou current energy level is "+n.getEP()+"\nYour opponent's health is "+c.getHP());
	    }

	    /////////////////////////
	    /// COMPUTER RESPONSE ///
	    /////////////////////////

	    if (!GameOver.equals("y")&& c.getHP()>0 && n.getHP()>0){
		if (PlayerChar.equals("c")){
		    Random r = new Random();
		    int d = r.nextInt(4);
		    if (d==0){
			n.throwStars(c);
			pause(1000);
			System.out.println("\nYou have been hit with Ninja Stars!");
		    } 
		    else if(d == 1){
			n.superKick(c);
			pause(1000);
			System.out.println("\nYou have been superkicked!");
		    }
		    else if(d == 2){
			n.starCombo(c);
			pause(1000);
			System.out.println("\nYou have attacked with star combo!");
		    }
		    else {
			n.katanaHit(c);
			pause(1000);
			System.out.println("\nYou have been attacked with a katana!");
		    }
		    System.out.println("\nYour current health is "+c.getHP());
		}
		else{
		    Random r = new Random();
		    int d = r.nextInt(3);
		    if (d==0){c.shot(n);System.out.println("You have been shot!");}
		    else if(d==1){c.doubleShot(n);System.out.println("\nYou have been double shot!");}
		    else {c.bangBangAttack(n);System.out.println("\nAHH you have been shot multiple times!");}
		    System.out.println("\nYour current health is "+n.getHP());
		}
	    }
	}

	//Result

	if ((n.getHP() <= 0 && PlayerChar.equals("c"))||
	    (c.getHP() <= 0 && PlayerChar.equals("n"))){
	    System.out.println("\n***Congratulations! You've won!***");
	}
	else if ((n.getHP() <= 0 && PlayerChar.equals("n"))||
		 (c.getHP() <= 0 && PlayerChar.equals("c"))){
	    System.out.println("\nSorry, you've lost");
	}
    }

    public String AskUser(String mToUser){
	String s = "";
	Scanner sc = new Scanner(System.in);
	System.out.print(mToUser);
	s = sc.nextLine();
	return s.toLowerCase();
    }

    public static void pause(int time){
	try{
	    Thread.sleep(time);
	}
	catch(Exception e){}
    }
}
