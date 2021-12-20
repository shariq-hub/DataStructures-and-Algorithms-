// Codeforces Problem 112A solution in java
import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String s1,s2,s3,s4;
        s1=scanner.nextLine();
        s2=scanner.nextLine();
        s3=s1.toLowerCase();
        s4=s2.toLowerCase();
        if(s3.compareTo(s4)>0){
            System.out.println(1);
        }
        else if(s3.compareTo(s4)==0){
            System.out.println(0);
        }
        else if(s3.compareTo(s4)<0){
            System.out.println(-1);
        }
        //System.out.println(s1.compareToIgnoreCase(s2));
                   



        }

           
        
    }
    
        

       

