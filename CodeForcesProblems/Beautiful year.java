import java.util.Scanner;
public class Problem166{
    public static void main(String[] args){
       int year; //1987 2013
        Scanner scanner=new Scanner(System.in);
        year=scanner.nextInt();
        while(true){
            year+=1;
        int a=year/1000;
        int b=year/100%10;
        int c=year/10%10;
        int d=year%10;
        if(a!=b&&a!=c&&a!=d&&b!=c&&b!=d&&c!=d){
            System.out.println(year);
            break;
        }
    }
 
}
    
}
