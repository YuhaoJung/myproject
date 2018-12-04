package com.Jung;

import java.util.Random;
import java.util.Scanner;

public class PokerGame {
	
	
	
	public static void main(String[] args) {
		char[] flowers = {0x2660,0x2665,0x2666,0x2663};
		for(int j = 0 ; j<=3; j++){
			System.out.println("\n");
			for(int i = 1; i<=13 ; i++){
				System.out.print(flowers[j]+" "+i+"\t");
				
				Poker poker = new Poker();
				poker.print();
		}
		}
		
	}
	}
//		for(int i = 0;i<nums.length;i++){
//			System.out.println(nums[i]);
//		}
//		int number ;
//		int flower ;
//		Scanner scanner = new Scanner(System.in);
//		Random random = new Random();
//		number = random.nextInt(13);
//		number = number +1 ;
//		System.out.print
//		(number);
//		flower = random.nextInt(4)+1;
//		switch (flower){
//		case 1:
//			System.out.println("S");
//			break;
//		case 2:
//			System.out.println("H");
//			break;
//		case 3 :
//			System.out.println("D");
//			break;
//		case 4 :
//			System.out.println("C");
//			break;
//		}
//		
//		
//	}
//
//}
// n % 13  = point ; n / 13 = suit