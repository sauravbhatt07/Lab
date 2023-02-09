package lab9;
import java.util.Scanner;
public class SmallestNumber {
	 public static void main(String args[]) {
     int num1,num2,num3;
     //create  a scanner
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter three numbers:");
           num1=sc.nextInt();
           num2=sc.nextInt();
           num3=sc.nextInt();
	// using If Else control satement
	             if(num1 < num2 && num1 < num3)
	                {
		              System.out.println("The Smallest Is"+num1);
	                }
	             else if(num2 < num3)
	                {
		               System.out.println("The Smallest Is"+num2);
	                }
	             else
	                {
		               System.out.println("The Smallest Is"+num3);
	                }}}
      


