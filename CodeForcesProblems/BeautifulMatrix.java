import java.util.Scanner;
 
public class Problem269a{
    public static void main(String[] args) {
 
      Scanner scanner=new Scanner(System.in);
     int a=3; // the index location for row
     int b=3;  // the index location for column
     int input=0;
     int count1=0;
     int count2=0;
     int count3=0;
     for(int i=1; i<6; i++){
         for(int j=1; j<6; j++){
         input=scanner.nextInt();
         if(input==1){
             count1=Math.abs(a-i); // we subtract the value of row where we find one in the row to get the row location
             count2=Math.abs(j-b); // we subtract the value of column where we find one in the column to get the column location
             count3=count1+count2; // then we add both of them to get the exact location.
             break;
         }
     }
    }
     System.out.println(count3);
 
 
    }
 
 
}
