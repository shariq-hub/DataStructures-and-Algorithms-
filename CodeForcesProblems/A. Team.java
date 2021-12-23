//Codeforces problem 231A solution in java
import java.util.Scanner;
 
public class CodeforcesProblems { 
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,input,count=0;
        input=scanner.nextInt();
        for(int i=1; i<=input; i++){
          a=scanner.nextInt();
          b=scanner.nextInt();
          c=scanner.nextInt();
          if(a>0&&b>0||a>0&&c>0||b>0&&c>0)
          count+=1;
            }
            System.out.println(count);
        }
      }
    
