// Codeforces Problem 339A Solution In java 

import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String s2="";
        String s3="";
        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                s2+=s.charAt(i);
            }
        }
        char[] ch=s2.toCharArray();
        Arrays.sort(ch);
        //System.out.println(ch);
        for(int j=0;j<ch.length; j++){
            System.out.print(ch[j]);
            if(j == ch.length-1)
                continue;
            System.out.print("+");           
        }
        System.out.println();
    }    
}
