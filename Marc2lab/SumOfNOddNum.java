package March2lab;
import java.util.Scanner;
public class SumOfNOddNum { //Main Class
	public static void main(String[] args) {
		// create a scanner class
		System.out.println("Enter any Number : ");
		Scanner sc=new Scanner(System.in);
		int sum=0; //use instance variable
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) { //use for loop
			if (i%2==1) {
			sum=sum+i;
			}} 
		//now print the output
			System.out.println("Sum of odd Number is : "+sum);
	}}

