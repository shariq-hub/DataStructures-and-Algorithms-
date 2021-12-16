import java.util.Arrays;
import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int count = 1;
        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        for(int i=1; i<ch.length; i++)  //wjmzbmr
            if(ch[i-1]!=ch[i])
                ++count;
        if(count%2==0)
            System.out.println("CHAT WITH HER!");
        else{
            System.out.println("IGNORE HIM!");
        }
    
    }
        

       
}
