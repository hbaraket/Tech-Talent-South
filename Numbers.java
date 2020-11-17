import java.util.*;

public class Numbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, product = 1;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++){
            numbers.add(input.nextInt());
        }

        for (int i = 0; i < 5; i++){
            total += numbers.get(i);
            product *= numbers.get(i);
        }

        
        System.out.println("Total = " + total);
        System.out.println("Product = " + product);
        System.out.println("Max = " + Collections.max(numbers));
        System.out.println("Min = " + Collections.min(numbers));
    }
    
}
