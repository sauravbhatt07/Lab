package March2lab;

public class Main { //main class
	public static void main(String[] args) {
	Library obj = new Library(); //create object
	obj.setBookId(45632);
	obj.setBookName("Wings of Fire");
	obj.setBookAuthor("APJ Abdul Kalam");
	//print the line
	System.out.println("The Book Name is :"+obj.getBookName());
	System.out.println("The Book Id is :"+obj.getBookId());
	System.out.println("The Book Author Name is :"+obj.getBookAuthor());
}}
