import java.util.Scanner;

public class New{
    public static void main(String[] args) {
        //Input 3 RRG output: 1
        // First I will check the next element if it is not equal to the first element then I will add 1 to counter.
        int a;
        String s;
        int count=0;
        Scanner scanner =new Scanner(System.in);
        a=scanner.nextInt();
        scanner.nextLine();
        s=scanner.nextLine(); //RRG
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count+=1;
            }
        }
        System.out.println(count);   
     }
}
