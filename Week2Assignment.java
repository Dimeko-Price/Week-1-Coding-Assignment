package com.Week2Assignment;

import java.util.Scanner;

public class Week2Assignment {

	public static void main(String[] args) {


		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 3.99;
		int moneyInWallet = 100;
		int thirstLevel = 4;
		switch (thirstLevel) {
		case '1':
			break;
		case '2':
			break;
		case '3':
			break;
		case '4':
			break;
		case '5':
			break;
		case '6':
			break;
		case '7':
			break;
		case '8':
			break;
		case '9':
			break;
			
		}
		
		boolean shouldBuyIcecream = (isHotOutside && hasMoneyInPocket);
		boolean willGoSwimming = (isHotOutside && isWeekday);
		boolean isAGoodDay = (isHotOutside && (moneyInWallet > 0) && (!isWeekday));
		boolean willBuyMilk = isHotOutside && (thirstLevel >=3) && (moneyInWallet >= (costOfMilk*2));
		
		int x = 0;
		while (x <= 100) {
			System.out.println(x);
			x+=2;
		}
		
		int y = 100;
		while (y>=0) {
			System.out.println(y);
			y-=3;
		}
		
		for (int z = 1; z <= 100; z+=2) {			System.out.println(z);
		}
		
		for (int w = 0; w <=100; w++) {
			if ((w % 3 ==0) && (w % 5 == 0)) {
				System.out.println("HelloWorld");
				
			} else if (w % 3 == 0) {
				System.out.println("Hello");
			} else if (w % 5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(w);
			}
		
		}
		
		
		
		
	}

}
