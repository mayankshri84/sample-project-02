package com.sample;

public class InterviewSample {

	public static void main(String[] args) {
		/*
		 * int count =1; int spaces=0; for(int i=5;i>=1;i--) { for(int j=1;j<=i;j++) {
		 * System.out.print(" "); }
		 * 
		 * for(int j=1;j<=count;j++) { if(j%2!=0) System.out.print(count);
		 * 
		 * } System.out.println(); spaces=count; count=count+2; }
		 */

		printPyramid(5);
	}

	public static void printPyramid(int rows) {
		int count = 1;
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >=i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < 2 * i; k++) {
				if (i == rows || (k == 1 || k == 2 * i - 1)) {
					System.out.print(count);
					
				}
				else {
					System.out.print(" ");
				}
				
			}
			count = count + 2;
			System.out.println();
		}
	}

}
