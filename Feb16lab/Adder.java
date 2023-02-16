package feb16lab;
	class Arithmetic { // super class
		int add(int a,int b) { // method for addition
			int c=a+b; 
			return c;
		}}
		public class Adder extends Arithmetic { // sub clss
		public static void main(String[] args) {
			Arithmetic num=new Arithmetic(); // object class
			int sum = num.add(8, 6); // input numbers
			System.out.println("Addition of two number is: "+sum);		
		}}
	

