public class AsciiChars 
{
  public static void printNumbers()
  {
    // TODO: print valid numeric input
    System.out.println("Printing valid numeric input...");
    for (int i = 0; i < 10; i++){
        System.out.print(i + " ");
    }
  }

  public static void printLowerCase()
  {
    // TODO: print valid lowercase alphabetic input
    System.out.println("\nList of alphabets in lowercase :"); 
    for (char ch = 'a'; ch <= 'z'; ch++) { 
        System.out.printf("%s ", ch); 
    }
  }

  public static void printUpperCase()
  {
    // TODO: print valid uppercase alphabetic input
    System.out.println("\nList of alphabets in upper case :"); 
    for (char ch = 'A'; ch <= 'Z'; ch++) { 
        System.out.printf("%s ", ch); 
    }

  }
}