package April13LAB;
import java.util.ArrayList;
public class Question1 {
// Instance variables to store ArrayLists A1 and A2
ArrayList<Integer> A1;
ArrayList<Integer> A2;
public ArrayList<Integer> storeOddNumbers(int N) { // Method to store odd numbers from 2 to N in ArrayList A1
A1 = new ArrayList<>();
for (int i = 2; i <= N; i++) { //use loop for odd numbers in A1 arraylist
if (i % 2 != 0) {
A1.add(i);
}}	            
return A1;}
// Method to print odd numbers from ArrayList A1 multiplied by 5 and store them in ArrayList A2
public ArrayList<Integer> printOddNumbers() {
A2 = new ArrayList<>();
for (int num : A1) {
int multiplied = num * 5;
A2.add(multiplied);
System.out.print(multiplied + ",");
}
System.out.println();// print a line
return A2;}
// Method to search for number N in ArrayList A1 and return it if found, otherwise return 0
 int retrieveOddNumber(int N) {
for (int num : A1) {
if (num == N) {
return num;
}}	           
return 0;
}
 public static void main(String[] args) { //main method
	 Question1 store = new Question1();
		store.storeOddNumbers(10);
		store.printOddNumbers();
		System.out.println();
		System.out.println(store.retrieveOddNumber(5));
 }}



	
	