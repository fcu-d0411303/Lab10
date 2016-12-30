package fcu.iecs.oop;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		boolean isDone = false;
		while(!isDone){
		  System.out.println("please enter a Celsius Temperature: ");
		  String input = keyboard.nextLine();
		  int celsius = 0;
		  try {
			  celsius = Integer.parseInt(input);
		  } catch(NumberFormatException e) {
			  System.out.println("Non integer string is not allowed.");
			  e.printStackTrace();
			  continue;
		  }
		  float fahrenheit = celsius * (9f/5) + 32;
		  System.out.println("Fahrenheit Temperature is " + fahrenheit);
		  isDone = true;
		}
		keyboard.close();
	}

}
