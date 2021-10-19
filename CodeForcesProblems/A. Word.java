import java.util.Scanner;
public class a269{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        String a="";
        a=scanner.nextLine();
        int small=0;
        int capital=0;
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==a.toUpperCase().charAt(i)){
                capital+=1;
            }
            else {
                small+=1;
            }
        }
        if(capital>small&&capital!=small){
            a=a.toUpperCase();
        }
        else{
            a=a.toLowerCase();
        }
        System.out.println(a);
    }
    
}
