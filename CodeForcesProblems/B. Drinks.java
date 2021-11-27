import java.util.Scanner;
 
public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        double m;
        double d=0;
        n=scanner.nextInt();
        for(int i=1; i<=n; i++){
            m=scanner.nextDouble();
            d+=m/n;
        }
        System.out.println(d);
    }
    
}
