/**
 * 
 */
package com.dsalgo.prep;

/**
 * @author prabirpadhy
 *
 */
public class IntegerDivision {
	
	//Brute Force Method
	public static int division(int divident, int divisor) {
		int sum = divisor;
		int count = 0;
		while(sum <= divident) {
			sum += divisor;
			count++;
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(division(7, 5));
	}

}
