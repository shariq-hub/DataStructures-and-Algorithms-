//Swap two numbers without putting any of them in a temp variable in java.
import java.util.Scanner;

public class swapnumbers {
    public static void main(String[] args) {
      int number1=0,number2=0;
      //program to swap two numbers without temp variables
      Scanner scanner=new Scanner(System.in);
      number1=scanner.nextInt();
      number2=scanner.nextInt();
      System.out.println("Swap two numbers program fist values are : ");
      System.out.println("a : "+number1+" "+"b : "+number2);
      System.out.println("After swaping : ");
      number1=number1+number2;
      number2=number1-number2;
      number1=number1-number2;
      System.out.println("a : "+number1+" "+"b : "+number2);
      


        

    }
    
         
}
