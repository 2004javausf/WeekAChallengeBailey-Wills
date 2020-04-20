package com.revature.driver;

//Importing Needed packages
import java.util.Scanner;
import com.revature.beans.Lizards;
import com.revature.beans.VideoGames;

public class Driver {

	public static void main(String[] args) {
		
		//setting up needed variables
		int num1;
		int num2;
		
		String school;
		
		int forNum;
		int whileNum;
		int doWhile;
		
		Integer boi = 10;
		double fancy;
		
		/*
		 * NOTE! I am aware of how boiler plate this is.
		 * However, the scanner class was not cooperating and this was the quickest fix 
		 * I could think of.
		 * <3 Elliott
		 */
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
//		Scanner sc4 = new Scanner(System.in);
//		Scanner sc5 = new Scanner(System.in);
//		Scanner sc6 = new Scanner(System.in);
//		Scanner sc7 = new Scanner(System.in);
//		Scanner sc8 = new Scanner(System.in);
//		Scanner sc9 = new Scanner(System.in);
//		Scanner sc10 = new Scanner(System.in);
//		Scanner sc11 = new Scanner(System.in);
		
		//Cont'd needed variables
		long a = 1000;
		long b = 50000;
		long c = 5;
		double q = 6.3;
		double w = 7.4;
		int o = 5;
		int p = 2;
		
		//Setting up bean objects
		Lizards liz1 = new Lizards();
		Lizards liz2 = new Lizards();
		
		VideoGames vg1 = new VideoGames();
		VideoGames vg2 = new VideoGames();
		
		//Part one of control statement example (if/if else)
		System.out.println("Please enter a number to compare.");
		num1 = sc.nextInt();
		System.out.println("Please enter another number to compare");
		num2 = sc.nextInt();
		
		if(num1 < num2) {
			System.out.println(num1 + " is less than " + num2);
		}
		
		else if (num1 > num2) {
			System.out.println(num1 + " is greater than "+ num2);
		}
		
		else {
			System.out.println(num1 + " is equal to "+ num2);
		}
		
		//Part two of control statement example (switch)
		System.out.println("");
		System.out.println("Enter a school abbreviation");
		System.out.println("For example the University of Cental Florida would be UCF");
		school = sc2.nextLine();
		switch(school) {
			case "UCF":
				System.out.println("Great Choice! Go Knights! Charge On!");
				break;
			case "UA":
				System.out.println("Great Choice! Roll Tide");
				break;
			case "UNC":
				System.out.println("Great Choice! Go Heels!");
				break;
			case "DU":
				System.out.println("I'm Sorry Duke Sucks");
				break;
			default:
				System.out.println("School not listed");
			
			}
		
		//Part three of control statement example (for loop)
		System.out.println("");
		System.out.println("Enter a number you would like to increment");
		forNum = sc.nextInt();
		for(int i=0; i<=forNum;i++) {
			System.out.println(i);
		}
		
		//Part four of control statement example (while loop)
		System.out.println("");
		System.out.println("Enter a number you would like to decrement");
		whileNum = sc.nextInt();
		while(whileNum >= 0) {
			System.out.println(whileNum);
			whileNum --;
		}
		
		//Part five of control statement example (do while loop)
		System.out.println("");
		System.out.println("Enter a number for how many time you want to repeat phrase HEY.");
		doWhile = sc.nextInt();
		do {
			System.out.println("HEY");
			doWhile --;
		}
		while(doWhile>0);
		
		//Part six of control statement example (enhanced for loop)
		System.out.println("");
		System.out.println("Watch in awe as I print out an array of number");
		int[] dope = {10, 55, 5, 13, 88, 1001};
		for(int x:dope) {
			System.out.println(x);
		}
		
		//Example of using a wrapper class
		System.out.println("");
		System.out.println("Enter a number with a decimal you would like to add to 10");
		fancy = sc3.nextDouble();
		double fancyBoi = boi.doubleValue() + fancy;
		System.out.println("That added together would be " + fancyBoi);
		
		//Overloading a method in this case multiplyboi
		System.out.println("");
		System.out.println("Watch in wonder as I multiply several different numbers!");
		System.out.println("50000 * 1000 = " + multiplyboi(a, b));
		System.out.println("50000 * 1000 * 5 = " + multiplyboi(a, b, c));
		System.out.println("6.3 * 7.4 = " + multiplyboi(q, w));
		System.out.println("5 * 2 = " + multiplyboi(o, p));
		
		//Asking User for liz1 input which instantiates liz1 as well
		System.out.println("");
		System.out.println("Enter a species of Lizard");
		liz1.setSpecies(sc2.nextLine());
		System.out.println("Is it a Large, Medium, or Small Lizard?");
		liz1.setSize(sc2.nextLine());
		System.out.println("How old is the lizard?");
		liz1.setAge(sc.nextInt());
		
		//Asking User for liz2 input which instantiates liz2 as well
		System.out.println("");
		System.out.println("Enter another species of Lizard");
		liz2.setSpecies(sc2.nextLine());
		System.out.println("Is the other Lizard a Large, Medium, or Small Lizard?");
		liz2.setSize(sc2.nextLine());
		System.out.println("How old is the other lizard?");
		liz2.setAge(sc.nextInt());
		
		//Printing out Lizards info
		System.out.println(liz1);
		System.out.println(liz2);
		
		//Asking User for vg1 input which instantiates vg1 as well
		System.out.println("");
		System.out.println("Enter a title of a Video Game");
		vg1.setTitle(sc2.nextLine());
		System.out.println("Enter the genre of the Video Game");
		vg1.setGenre(sc2.nextLine());
		System.out.println("Enter the rating of the Video Game");
		vg1.setRating(sc2.nextLine());
		
		//Asking User for vg2 input which instantiates vg2 as well
		System.out.println("");
		System.out.println("Enter another title of a Video Game");
		vg2.setTitle(sc2.nextLine());
		System.out.println("Enter the genre of the other Video Game");
		vg2.setGenre(sc2.nextLine());
		System.out.println("Enter the rating of the other Video Game");
		vg2.setRating(sc2.nextLine());
		
		//Printing out Video Game info
		System.out.println(vg1);
		System.out.println(vg2);

	}
	
	//Setting up overloaded methods called multiplyboi
	static long multiplyboi (long a, long b) {
		return a*b;
	}
	
	static long multiplyboi (long a, long b, long c) {
		return a*b*c;
	}
	
	static double multiplyboi (double a, double b) {
		return a*b;
	}
	
	static int multiplyboi (int a, int b) {
		return a*b;
	}
}




