import java.util.Scanner;

class fabonacciSeries{
    public static void main(String[] args) {
        //Fabonaci number program
        int a=0,n,temp=1,fab=0;
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for(int i=0; i<n; i++){
            System.out.print(fab+" ");
            a=fab; 
            fab=temp;
            temp+=a;
        }
    }
}
