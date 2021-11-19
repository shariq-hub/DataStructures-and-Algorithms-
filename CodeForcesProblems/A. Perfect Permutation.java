import java.util.Scanner;
public class a269{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n;
        n=scanner.nextInt();
        if(n%2==1){
            System.out.print(-1);
        }
        else{
            System.out.print("2 1 ");
            for(int i=3; i<=n; i+=2){
                System.out.print(i+1+" "+i+" ");
            }
        }
      }
}
