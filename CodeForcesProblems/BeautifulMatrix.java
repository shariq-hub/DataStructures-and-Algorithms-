import java.util.Scanner;
 
public class Problem269a{
    public static void main(String[] args) {
 
      Scanner scanner=new Scanner(System.in);
     int a=3;
     int b=3;
     int input=0;
     int count1=0;
     int count2=0;
     int count3=0;
     for(int i=1; i<6; i++){
         for(int j=1; j<6; j++){
         input=scanner.nextInt();
         if(input==1){
             count1=Math.abs(a-i);
             count2=Math.abs(j-b);
             count3=count1+count2;
             break;
         }
     }
    }
     System.out.println(count3);
 
 
    }
 
 
}
