import java.util.Scanner;
 
public class a269{
 public static void main(String[] args) {
        String s1;
        String s2;
        String s3="";
        Scanner scanner=new Scanner(System.in);
        s1=scanner.nextLine();
        s2=scanner.nextLine(); //1010100   0100101
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==s2.charAt(i)){
                s3+="0";
            }
            else{
                s3+="1";
            }
        }
        System.out.println(s3);
         
 
}
      }
