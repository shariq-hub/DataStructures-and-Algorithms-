import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
      int input,reversenumber=0;
      Scanner scanner=new Scanner(System.in);
      input=scanner.nextInt();
      int temp=input;
      while(n>0){
          reversenumber=reversenumber*10+input%10;
          input=input/10;
      }
      if(temp==reversenumber){
          System.out.println("it's palindrom");
      }
      else{
          System.out.println("it's not");
      }
    }
    
         
}
