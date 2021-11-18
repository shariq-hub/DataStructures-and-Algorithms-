import java.util.Scanner;

public class New{
    public static boolean isPrime(int primenumber){
        //a prime number is a number which can only be divide by only itself and 1.
        boolean flag=true;
        if(primenumber==0||primenumber==1){
            flag=false;
        }
        for(int i=2; i<=primenumber/2; i++){
            if(primenumber%i==0){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
    //The problems I have first I need to find if b is the prime number or not --Problem Fixed
    //then I have to check wether if it is the one prime number which comes after a. -- Problem Fixed
        int a,b,c=0;
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        b=scanner.nextInt();
        scanner.close();
        for(int i=a+1; ; i++){
            if(isPrime(i)){
                c=i;
                break;
            }
        }
        if(c==b){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        } 
     }
}
