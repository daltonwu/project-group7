import java.util.*;
import java.io.*;

public class AltDriver.java {
  private static Scanner input = new Scanner(System.in);
  
  private static Cowboy c;
  private static Ninja n;
  
  // player and monster name
  private static String pName, mName;
  
  public static void main(String[] args) {
    init();
  }
  
  private static void init() {
    System.out.println("$#@---WELCOME TO STUYABLOLBAYUTS. PLEASE NO TRY BREAK GAME.---@#$");
    System.out.print("INPUT PLAYER NAME: ");
    pName = input.nextLine();
    System.out.print("INPUT PEJORATIVE EXPRESSION SO THAT THOU MAYEST INSULT THINE ENEMIES: ");
    mName = input.nextLine();
  }
  
  private static boolean isWin() {
    return c.getHP() <= 0 || N.GEThp() <= 0;
  }
}
