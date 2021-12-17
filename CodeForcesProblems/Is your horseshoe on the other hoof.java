// Codeforces Problem 228A Solution in java 
import java.util.ArrayList;

import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int count = 0;
        ArrayList<Integer> horseshoes = new ArrayList<Integer>();
        for(int i = 0; i < n; i++) { 
          int x = sc.nextInt(); //1 7 3 3
          if(horseshoes.contains(x)) {
            count++;
          } else {
            horseshoes.add(x);
          }
        }
        sc.close();
        
        System.out.println(count);
    
    }
        

       
}
