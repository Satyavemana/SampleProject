package com.satya.javaexamples;

import java.util.Arrays;

public class Example1 implements Cloneable  {
	//intermediate array
	
	public void rotate(int[] nums, int k) {
	    if(k > nums.length) {
	        k=k%nums.length;
	    }
	    int[] result = new int[nums.length];
	 
	    for(int i=0; i < k; i++){
	        result[i] = nums[nums.length-k+i];
	    }
	    int j=0;
	    for(int i=k; i<nums.length; i++){
	        result[i] = nums[j];
	        j++;
	    }
	    System.out.println("  rotate method2>>  "+Arrays.toString(result));
	    System.arraycopy( result, 0, nums, 0, nums.length );
	    System.out.println("  rotate method3>>  "+Arrays.toString(result));
	   
	}
	
	//Bubble rotate
	public void rotate2(int[] arr, int order) {
		if (arr == null || order < 0) {
		    throw new IllegalArgumentException("Illegal argument!");
		}
	 
		for (int i = 0; i < order; i++) {
			for (int j = arr.length - 1; j > 0; j--) {
				int temp = arr[j];
				arr[j] = arr[j - 1];
				arr[j - 1] = temp;
			}
		}
		System.out.println(" inside bubble rotate"+Arrays.toString(arr) );
	}
	

	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7};
		Example1 ex = new Example1();
		String s1="satya";
		String s2="satya";
		System.out.println(" s1 >> "+s1);
		s1="krishna";
		
		System.out.println(" s2 >> "+s2);
		System.out.println(" s1 >> "+s1);
		//System.out.println(" string value>> "+s1.equals(s2));
		//System.out.println(s1==s2);
		//System.out.println(" before rotate >>  "+Arrays.toString(array));
		//ex.rotate(array, 6);
		//ex.rotate2(array, 17);
		//System.out.println(" after rotate >>  "+Arrays.toString(array));
		 System.out.println("print last");
	}


}