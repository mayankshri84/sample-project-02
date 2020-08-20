package com.sample;

public class Sample {

	/*
	 * public static void main(String[] args) { int num = 27; boolean flag = false;
	 * for(int i=2;i<=num/2;i++) { if(num%i==0) { flag = true; break; } } if(!flag)
	 * { System.out.println(num+"is a prime number"); } else {
	 * System.out.println(num+"is not a prime number"); } }
	 */
	
	public static void main(String[] args) {
		int[] arr = { 100, 3, 4, 6, 5, 7, 23, 6 };
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max1<arr[i]) {
				max3 = max2;
				max2= max1;
				max1=arr[i];
			}
			else if(max2<arr[i]){
				max3 = max2;
				max2=arr[i];
			}else if(max3<arr[i]) {
				max3=arr[i];
			}

		}
		System.out.println(max1);
		System.out.println(max2);
		System.out.println(max3);
	}
}
