package March30Lab;
import java.util.ArrayList;
public class ListLoader { // main class
    public static void main(String[] args) { //main method
        long startTime = System.currentTimeMillis(); // use long variables for big values
// take array list loader
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 100000; i++) { // use for loop for calculate the time response 0 to 1 lakh
            list.add(i);
        }
// same as above take long for end time response
        long endTime = System.currentTimeMillis();
        // now print the value in (difference endTime - startTime) in millisecond
        System.out.println("Response Time: " + (endTime - startTime) +" millisecond");
    }}

