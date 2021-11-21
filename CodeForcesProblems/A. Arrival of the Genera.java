import java.util.Scanner;
public class a269{
    public static void main(String[]args){
         int n=0;
         Scanner scanner=new Scanner(System.in);
        int min=110,max=0; // to store minimum and maximum value
        int mini=0,maxi=0; //to store minimum and maximum value index
        n=scanner.nextInt();
        for(int i=1; i<=n; i++){
            int a;
            a=scanner.nextInt();
            if(a>max){
                maxi=i;
                max=a;
            }
             if(a<=min){
                mini=i;
                min=a;
            }
        }
    
        if(maxi>mini){
            System.out.println((maxi-1)+(n-mini)-1);
        }
        else{
            System.out.println((maxi-1)+(n-mini));
        }
    }
}
