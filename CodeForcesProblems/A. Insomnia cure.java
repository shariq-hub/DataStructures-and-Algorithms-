import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k,l,m,n,d,answer=0;
        k=scanner.nextInt();//2
        l=scanner.nextInt();//3
        m=scanner.nextInt();//4
        n=scanner.nextInt();//5
        d=scanner.nextInt();//24
        answer=d;
        for(int i=1; i<=d; i++){
            if(k==1){
                break;
            }
            else if(i%k!=0&&i%l!=0&&i%m!=0&&i%n!=0){
                answer-=1;
            }
        }
        System.out.println(answer);

    }
    
}
