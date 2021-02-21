package com.Week3Assignment;

public class Week3Assignment {

	private static final boolean  True = false;

	public static void main(String[] args) {
	
	int[] ages = new int[9];
	ages[0]=3;
	ages[1]=9;
	ages[2]=23;
	ages[3]=64;
	ages[4]=2;
	ages[5]=8;
	ages[6]=28;
	ages[7]=93;
	ages[8]=100;
	
	//1a. and 1b.
	
	int i = ages.length - 1;
	int diff = ages[i]-ages[0];
	System.out.println(diff);
	
	//1c. 
	
	int x;
	double sum = 0;
	for (x=0; x < ages.length; x++) {
		if (x<ages.length) {
			sum += ages[x];
		}
	}
	System.out.println("The average of the array is: " + (sum / ages.length));


//	 //2
//	
//	
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	int sum1 = 0;
	for (int i1 = 0; i1 < names.length; i1++) {
		sum1 += names[i1].length();
	}
		int average = sum1 / names.length;
		System.out.println("The average number of letters per name in the array is: " + average);
		
	String allNames = "";
	for (int i1 = 0; i1 < names.length; i1++) {
		allNames += names[i1] + " ";
	}
	System.out.println(allNames);
//	
//	//3 In order to access the last element of an array, you can use array[length]. For example:
//	
	System.out.println(names[5]);
//	
//	//4 In order to access the first element of an array, you can use array[0]. For example:
//	
	System.out.println(names[0]);
	
	//5 
	
	int[] nameLengths = new int[names.length]; 
	int i1;
		for (i1 = 0; i1 < names.length; i1++) {
			nameLengths[i1] = names[i1].length();
		}
		
	//6
	int total = 0;
	for (i1=0; i1 < nameLengths.length; i1++) {
		total += nameLengths[i1];
	}
	System.out.println("The sum of all the elements in the nameLengths array is: " + total);
	
	//7
	System.out.println(concat("Hi", 2));
	
	//8
	System.out.println(createFullName("Meko", "Price"));
	
	//9
	System.out.println(sumOfAllInts(ages));
	
	//10
	double[] doubleArray = {1.11, 2.22, 3.33, 4.44};
	System.out.println(average(doubleArray));
	
	//11
	double[] doubleX = {1.11, 2.22, 3.33, 4.44};
	double[] doubleY = {1.10, 2.20, 3.30, 4.40};
	System.out.println(avgGreater(doubleX, doubleY));
	
	//12
	boolean isHotOutside = True;
	double moneyInPocket = 11.00;
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	//13 This method determines if a person should be able to dunk a basketball on a 10ft hoop. I created it to help 
	//   athletes determine if they should be able to dunk based on their athleticism and body build. If they consider
	//    themselves athletic AND if they are atleast 72 inches (6') they should be able to dunk a basketball.
	boolean areAthletic = True;
	int heightInches = 80;
	System.out.println(canDunkBasketball(heightInches, areAthletic));
	
	
	
	
}
	public static String concat(String s, int n) {
		String result = s;
		if (n>1) {
			for (int i=2; i<=n; i++) {
				result +=s;
			}
			}
		return result;
		}
	
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	public static boolean sumOfAllInts(int[] numbers) {
		int sum = 0;
		int i;
				for (i=0;i<numbers.length; i++) {
					sum +=numbers[i];
				}
				if (sum > 100) {
					
				}
					return true;
	}
	
	public static double average(double[] number){
		double sum = 0;
		for (int i=0; i<number.length; i++) {
			sum += number[i];
		}
		double result = sum / number.length;
		return result;
	}
	
	public static boolean avgGreater(double[] x, double[] y) {
		double sum1 = 0;
		double sum2 = 0;
		
		for (int i=0; i < x.length; i++) {
			sum1 += x[i]; 
		}
		for (int i=0; i < y.length; i++) {
			sum2 += y[i];
		}
		double average1 = sum1 / x.length;
		double average2 = sum2 / y.length;
		
		if (average1 > average2) {
			
		}
			return true;
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && (moneyInPocket > 10.50)) {
			
		}
			return true;
	}
	
	public static boolean canDunkBasketball (int heightInches, boolean areAthletic) {
		if ((heightInches > 72) && areAthletic) {
			
		}
			return true;
	}
	
}
