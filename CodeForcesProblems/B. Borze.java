import java.util.Scanner;
 
public class Problem269a {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input="";
        String s2="";
        input=scanner.nextLine(); // .-.-- 012
        char[] ch=input.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='.'){
                s2+="0";
            }
             if(ch[i]=='-'&&ch[i+1]=='.'){
                s2+="1";
                ++i;
                
            }
 
             if(ch[i]=='-'&&ch[i]=='-'){
                s2+="2";
                ++i;
                
            }
        }
        System.out.print(s2);
        
 
        }
    }
