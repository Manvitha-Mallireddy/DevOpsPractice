package com.practice;

import java.util.Scanner;

public class Printing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("For morning greetings press 1");
		System.out.println("For afternoon greetings press 2");
		System.out.println("For night greetings press 3");
		n=sc.nextInt();
		if(n==1)
		{
			GoodMorning ob=new GoodMorning();
			ob.morning();
		}
		else if(n==2)
		{
			GoodAfterNoon ob=new GoodAfterNoon();
			ob.afternoon();
		}
		else
		{
			GoodNight ob=new GoodNight();
			ob.night();
		}

	}

}
