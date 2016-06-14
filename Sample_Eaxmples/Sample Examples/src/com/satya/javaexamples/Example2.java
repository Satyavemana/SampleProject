package com.satya.javaexamples;
import java.util.Arrays;

public class Example2 {
	public int[] rotate(int[] a,int k){
		for(int i=0;i<k;i++){
			for(int j=a.length-1;j>0;j--){
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		return a;
	}
	public static void main(String args[]){
		int[] intArry={1,2,3,4,5,6,7};
		Example2 ex= new Example2();
		//int[] rotate=ex.rotate(intArry, 3);
		System.out.println(" rotate array >>  "+Arrays.toString(ex.rotate(intArry, 7)));
		
	}

}
