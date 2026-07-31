package chapter07;

import java.util.Scanner;

public abstract class RemoCon {
	
	boolean state;
	Scanner sc = new Scanner(System.in);
	
	abstract void powerOn();
	
	abstract void powerOff();


}


