package March09lab;

import java.util.Scanner;

public class Question1 {
	public class FindPair  {
	    //Driver method
	    public static void main(String[] args) {
	        java.util.Scanner sc = new Scanner(System.in);
	        //Entering the size of array
	        System.out.println("Enter number of elements in the array: ");
	        int n = sc.nextInt();
	        //array declared
	        int[] arr = new int[n];
	        //Entering array elements
	        System.out.println("Enter array elements: ");
	        for (int i = 0; i < n; i++) {
	               arr[i] = sc.nextInt();
	        }
	        //Entering the sum value, a specified number
	        System.out.println("Enter the sum value: ");
	        int sum = sc.nextInt();
	        
	        //calling the findPairs() user defined method
	        findPairs(arr, sum);
	    }
	     //findPairs() method
	   	    static void findPairs(int inputArray[], int sum){
	        System.out.println("The pairs whose sum are equal to "+ sum+" are : ");
	        for (int i = 0; i < inputArray.length; i++) {
	            for (int j = i + 1; j < inputArray.length; j++) {
	                if (inputArray[i] + inputArray[j] == sum) 
	                {
	                    System.out.println(inputArray[i] + " " + inputArray[j]);
	                }}}}}}
	            