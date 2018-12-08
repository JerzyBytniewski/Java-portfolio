package Jerzy;



public class powtórka {
	public static void main(String [] args) {
		
		System.out.println(pow(7, 3));
		
	}
	
	public static int pow(int baseNum, int powNum) {
		int result = 1;
		for(int i = 0; i < powNum; i++) {
			result = result * baseNum;
		}
		return result;
	}
	
	
}

