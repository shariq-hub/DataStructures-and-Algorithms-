import java.util.Scanner;
public class Problem166{
    public static void main(String[] args){
       int year; //1987 2013
        Scanner scanner=new Scanner(System.in);
        year=scanner.nextInt();
        while(true){
            year+=1;
        int a=year/1000; // we will get first digit
        int b=year/100%10; // we will get secind digit
        int c=year/10%10; //we will get third digit
        int d=year%10; // we will get the last digit
        if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d) // here we are comparing each digit
        { 
            System.out.println(year);
            break;
        }
    }
 
}
    
}
