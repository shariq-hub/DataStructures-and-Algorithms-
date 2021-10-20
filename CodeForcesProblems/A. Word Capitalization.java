import java.util.Scanner;
 public class a269{
     public static void main(String []args){
     Scanner scanner=new Scanner(System.in);
        String a;
        a=scanner.nextLine();
     char[] ch = a.toCharArray();
        ch[0] = Character.toUpperCase(ch[0]);
        for(int i=0; i<ch.length; i++)
            System.out.print(ch[i]);
 
}
     
 }
