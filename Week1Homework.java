package com.Testing;

public class Week1Homework {

	public static void main(String[] args) {
		

		//Coding Step 3: Create two variables for the following real life examples and assign them values using the best data type
		//Coding Step 5: Print out all variables I created
		
		double gpuPrice = 500.75;
		System.out.println("The gpu I want to buy costs $" + gpuPrice);
		
		double cpuPrice = 400.25;
		System.out.println("The cpu I want to buy costs: $" + cpuPrice);
		
		int cashInWallet = 2000;
		System.out.println("The amount of cash in my Wallet is: $" + cashInWallet);
		
		int giftCardInWallet = 1000;
		System.out.println("The amount of gift cards in my wallet is: $" + giftCardInWallet);
		
		int guyFriends = 2;
		System.out.println("The number of guy friends I have is:" + guyFriends);
		
		int girlFriends = 10;
		System.out.println("The number of girlfriends I have is:" + girlFriends);
		
		int age2020 = 29;
		System.out.println("My age in 2020 was:" + age2020);
		
		int age2021 = 30;
		System.out.println("My age in 2021 will be:" + age2021);
		
		String firstName1 = "Meko";
		System.out.println("My first name is:" + firstName1);
		
		
		String lastName1 = "Price";
		System.out.println("My last name is: " + lastName1);
		
		String middleInit1 = "J.";
		System.out.println("My middle initial is: " + middleInit1);

		
		//Coding Step 4a: New amount of money in wallet after buying an item
		System.out.println("I would like to buy a new gpu for my computer!");
		
		System.out.println("I currently have this much cash in my wallet:"); 
		System.out.println(cashInWallet);
		
		System.out.println("The gpu costs:");
		System.out.println(gpuPrice);
		
		System.out.println("I will have this much cash left after I buy the gpu:");
		double newCashinWallet = cashInWallet - gpuPrice;
		System.out.println(newCashinWallet);
		
		//Coding Step 4b: Number of friends You've made each year based on your age variable and your number of friends variable
		System.out.println("In 2021, I will be this old:");
		System.out.println(age2021);
		
		System.out.println("I had this many girlfriends in 2021:");
		System.out.println(girlFriends);
		
		System.out.println("Number of girlfriends I've made compared to my age in 2021:");
		double girlFriendsByAge = age2021 / girlFriends;
		System.out.println(girlFriendsByAge);
		
		//Coding Step 4c: Full Name Based on first name, middle inital and last name
		System.out.println("This is my full nickname:");
		String fullNickName = firstName1 + " " + middleInit1 + " " + lastName1;
		System.out.println(fullNickName);
		
		

		
		
		
		
		
		
	}

}
