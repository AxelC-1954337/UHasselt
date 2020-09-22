package opdracht_02_04;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		Random rand = new Random();
		for (int i = 0; i < 24; i++) {
			int one = rand.nextInt(25);
			int two = rand.nextInt(25);
			compareValues(one,two);
		}
		

	}
	
	public static void compareValues(int one, int two) {
		if (one>two) {
			System.out.println(one+ " is greater than " + two + ".");
		}else if (two>one) {

			System.out.println(one+ " is less than " + two + ".");
		}else if(one==two) {

			System.out.println(one+ " is equal to " + two + ".");
		}
	}

}
