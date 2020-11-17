import java.util.*;
public class SumInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        int total = 0;

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++){
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < 5; i++){
            total += numbers[i];
        }

        System.out.println("Total is " + total);
    }
    
}
