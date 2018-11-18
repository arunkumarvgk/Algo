package com.practice.linkedList;

public class PowerCalc {
	
	static int i;
	 int j;
	PowerCalc(){
		i++;
	}
	
	
	
	
	private static long ipow(long base, long exp) {
		long result = 1;

		while (exp != 0) {
			if ((exp & 1) == 1) {
				result *= base;
			}
			exp >>= 1;
			base *= base;
		}

		return result;
	}

	public static float power(float x, int y) {
		float temp;
		if (y == 0)
			return 1;
		temp = power(x, y / 2);
		if (y % 2 == 0)
			return temp * temp;
		else {
			if (y > 0)
				return x * temp * temp;
			else
				return (temp * temp) / x;
		}
	}

	public static void main(String[] args) {
		//long l = ipow(2, -1);
		float ll = power(2, 5);
		System.out.println(" "+ll);
	}

}
