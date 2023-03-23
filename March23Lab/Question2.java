package March23Lab;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) { //main class
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        try {
            if (x < 0 || y < 0) {
                throw new Exception("x and y should not be negative."); //throw InputMismatchException

            } else if (x == 0 || y == 0) {
                throw new Exception("x and y should not be zero."); //throw InputMismatchException

            } else {
                int product = x * y;
                System.out.println(product);
            }
        } catch (Exception e) {
            System.out.println(e);
        }}}
          