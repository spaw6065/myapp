/**
 * test
 */
package com.dev.testpkg;

/**
 * @author sumitpawar
 *
 */
public class demodevclass {

	private static int a =10;
	private static int b=20;
	
	public static int sum(int inum1,int inum2) {
		System.out.println("Entered sum function");
		int isum = inum1+inum2;
		System.out.println("Sum : "+isum);
		return isum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sumval = 0;
		System.out.println("Entered main function");
		sumval = sum(a,b);
		
		System.out.println("Sum val is  : "+sumval);
 		
	}

}
