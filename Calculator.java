
public class Calculator {

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide (int num1, int num2){
        return num1 / num2;
    }

    public double square(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public double squareRoot(int num){
        return Math.sqrt(num);
    }

    public double sine(int num){
        return Math.sin(num);
    }

    public double cosine(int num){
        return Math.cos(num);
    }

    public double tangent(int num){
        return Math.tan(num);
    }

    public int factorial(int num){
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
    
}
