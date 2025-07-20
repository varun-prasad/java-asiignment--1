
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = input.nextInt();
        int num3 = input.nextInt();
        
        int sum = num1 + num3;
        System.out.println("Sum is = " + sum);
        
        input.close(); // It's good practice to close the scanner
    }
}
