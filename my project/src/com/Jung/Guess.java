package com.Jung;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Guess {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float secret;
		int i =0 ;
		int guess = 0;
		secret =(float) Math.random();
		secret = secret * 10.0f;
		int s =(int) secret + 1 ;
		System.out.println(s);
		while(guess != s && i < 4)
		{
		i++;
		System.out.println("Your guess("+ i +"/4):");
		guess = scanner.nextInt();
		if(guess > s)
		{
			System.out.println("lower");
		}
		else if(guess < s)
		{
			System.out.println("higher");
		}
		else if(guess == s && i<=2)
		{
			System.out.println("Exellent! The number is "+s);
		}
		else
			System.out.println("Great! The number is "+s);
		}
		if(guess != s)
		{
			System.out.println("U SUCK");
		}
	}

}
