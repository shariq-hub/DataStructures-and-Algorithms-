import java.util.Scanner;

public class YoungScientist {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n,a=0,b=0,c=0;
        n=scanner.nextInt();
        for(int i=1; i<=n; i++){
            a+=scanner.nextInt();
            b+=scanner.nextInt();
            c+=scanner.nextInt();
            
        }
        if(a==0&&b==0&&c==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
    
}
