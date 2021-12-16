// Codeforces Problem 71A Solution in Java By Shariq Shaikh

import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        String s1="",s2="";
        for(int i=0; i<=n; i++){
        s1=scanner.nextLine();
        if(s1.length()>10){
            s2+=s1.charAt(0);
            s2+=s1.length()-2;
            s2+=s1.charAt(s1.length()-1);
            System.out.println(s2);
            s2="";
        }
        else{
            System.out.println(s1);
        }
        }
        
    
    }
        

       
}
