import java.util.Scanner;

public class codechef {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x,points;
        int cwon=0,chefwon=0;
         x=scanner.nextInt();
         String s;
         int result=0;
         for(int i=1; i<=x; i++){
            points=scanner.nextInt();
            scanner.nextLine();
        s=scanner.nextLine();
            for(int j=0; j<14; j++){
                if(s.charAt(j)=='C'){
                    cwon+=2;
                    //chefwon+=0;
                }
               else if(s.charAt(j)=='D'){
                    cwon+=1;
                    chefwon+=1;
                }
                else if(s.charAt(j)=='N'){
                    chefwon+=2;
                }
            }
            if(cwon>chefwon&&cwon!=chefwon){
                 result=60*points;
            }
            else if(chefwon>cwon){
                result=40*points;
            }
            else {
                result=55*points;
            }
            System.out.println(result);
            cwon=0;
            chefwon=0;
        }
            
        }    
}
