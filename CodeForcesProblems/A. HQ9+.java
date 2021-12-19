import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String s;
        s=scanner.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='H'||s.charAt(i)=='Q'||s.charAt(i)=='9'){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
        }

           
        
    }
    
        

       

