import java.util.*;
public class PowerMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter size of array: ");
        int size = input.nextInt();

        System.out.println("Enter the power: ");
        int power = input.nextInt();


        System.out.println(Arrays.toString(toPower(size,power)));
    }

    public static int[] toPower(int size, int power){
        int[] array = new int[size];
        int count = 0;

        for (int i = 0; i < array.length; i++){
            array[i] = count++;
        }

        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int)(Math.pow(i, power));
        }
        return array;
    }
    
}
