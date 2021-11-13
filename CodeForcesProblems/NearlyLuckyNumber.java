import java.util.Scanner;
 
public class a269{
    public static void main(String[] args) {
        int lukcy1=4;
        int lucky2=7;
        long input=0;
        int answer=0;
        Scanner scanner=new Scanner(System.in);
        input=scanner.nextLong();
        while(input>0){
            if(input%10==lukcy1||input%10==lucky2){
                answer++;
            }
            input=input/10;
        }
        if(answer==lukcy1||answer==lucky2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        
        
        
    }
}
