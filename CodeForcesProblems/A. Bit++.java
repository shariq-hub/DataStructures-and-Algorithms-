//Codeforces Problem 282A Solution in java
import java.util.Scanner;

public class CodeforcesProblems { 
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s,s1="";
        int t,count=0;
        t=scanner.nextInt();
        scanner.nextLine();
        for(int i=1; i<=t; i++){ //++x ++x ++x
        s=scanner.nextLine();
        for(int j=0; j<s.length()-1; j++){
      if(s.charAt(j)=='+'&&s.charAt(j+1)=='+'){
         count+=1;
       }
       else if(s.charAt(j)=='-'&&s.charAt(j+1)=='-'){
         count-=1;
       }
      }

        }
        System.out.println(count);
      }
    
        
    }
       
