import java.util.*;
public class JavaControlFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Hello World!\n");

        AsciiChars.printNumbers();
        AsciiChars.printUpperCase();
        AsciiChars.printLowerCase();

        System.out.println("\n\nPlease enter your name: ");
        String name = scanner.next();

        System.out.println("Hello " + name);

        System.out.println("Would you like to continue? y/n");
        String choice = scanner.next();

        while(!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("n") && !choice.equalsIgnoreCase("no")){
            System.out.println("Error, invalid input. Please answer with y, yes, n or no");
            choice = scanner.next();
        }
        if (choice.equalsIgnoreCase("n") || choice.equalsIgnoreCase("no")){
            System.out.println("Thank you. Please return later to continue the survey.");
        }

        else{
            String answer, redCar, favoritePet, quarterback, actName;
            int jerseyNumber = 0, age, modelYear, randomNumber, luckyNumber, lotteryNumber1, lotteryNumber2, lotteryNumber3, lotteryNumber4, lotteryNumber5, magicBall;
            do{
                System.out.println("Do you have a red car? yes or no");
                redCar = scanner.next();

                while (!redCar.equalsIgnoreCase("yes") && !redCar.equalsIgnoreCase("no"))
                {
                    System.out.println("Please enter yes or no: ");
                    redCar = scanner.next();
                }

                System.out.println("What is the name of your favorite pet?");
                favoritePet = scanner.next();

                System.out.println("What is the age of that pet?");
                age = scanner.nextInt();

                System.out.println("What is your favorite number?");
                luckyNumber = scanner.nextInt();

                System.out.println("Do you have a favorite quarterback? yes/no");
                quarterback = scanner.next();

                if (quarterback.equalsIgnoreCase("yes")){
                    System.out.println("What is their jersey number?");
                    jerseyNumber = scanner.nextInt();
                }

                System.out.println("What is the two digit model year of your car?");
                modelYear = scanner.nextInt();

                System.out.println("What is the first name of your favorite actor or actress?");
                actName = scanner.next();

                System.out.println("Enter a random number between 1 - 50");
                randomNumber = scanner.nextInt();
                while (randomNumber > 50 || randomNumber < 1){
                    System.out.println("Try again, enter a random number between 1 and 50");
                    randomNumber = scanner.nextInt();
                }

                magicBall = luckyNumber * randomNumber;
                if (magicBall > 75){
                    magicBall = magicBall - 75;
                }
                
                lotteryNumber1 = modelYear + luckyNumber;
                if (lotteryNumber1 > 65){
                    lotteryNumber1 = lotteryNumber1 - 65;
                }

                lotteryNumber2 = jerseyNumber + age + luckyNumber;
                if (lotteryNumber2 > 65){
                    lotteryNumber2 = lotteryNumber2 - 65;
                }

                lotteryNumber3 = age + modelYear;
                if (lotteryNumber3 > 65){
                    lotteryNumber3 = lotteryNumber3 - 65;
                }

                lotteryNumber4 = 42;

                lotteryNumber5 = rand.nextInt(50) + 1 - randomNumber;
                if (lotteryNumber5 > 65){
                    lotteryNumber5 = lotteryNumber5 - 65;
                }

                System.out.println("Here are the lottery numbers: " + lotteryNumber1 + ", " + lotteryNumber2 + ", " + lotteryNumber3 + ", " + lotteryNumber4 + ", " + lotteryNumber5 + " Magic Ball: " + magicBall);

                System.out.println("Would you like to generate another set of numbers? y/n");
                answer = scanner.next();

            }while(answer.equalsIgnoreCase("y"));
            System.out.println("Thank you!");
        }

    }

    
}


