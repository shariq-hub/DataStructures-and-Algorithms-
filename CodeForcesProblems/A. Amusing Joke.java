//Codeforces Problem 141A Solution in java 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
 
public class CodeforcesProblems {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        String s1="",s2="",s3="",s4="";
        s1=scanner.nextLine();
        s2=scanner.nextLine();
        s3=scanner.nextLine();
        s4=s1+s2;
         char []ch2=s4.toCharArray();
         char []ch3=s3.toCharArray();
         Arrays.sort(ch2);
         Arrays.sort(ch3);
         for(int i=0; i<ch3.length; i++){
       if(ch3[i]!=ch2[i]||ch3.length!=ch2.length){
           System.out.print("NO");
           System.exit(0);
       }
    }
    System.out.println("YES");
    }
 
        }
 
