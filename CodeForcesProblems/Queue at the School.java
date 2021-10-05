import java.util.Scanner;
 
public class Problem269a {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n,t,g=0;
        String s="";
        n=scanner.nextInt();
        t=scanner.nextInt();
        scanner.nextLine();
        s=scanner.nextLine();
        char ch[]=s.toCharArray();
        for(int j=0; j<t; j++){
            for(int i=0; i<n-1; ++i) {
                if (ch[i] == 'B' && ch[i + 1] == 'G') {
                    ch[i] = 'G';
                    ch[i + 1] = 'B';//BGGBG GGBGB t=2
                    i++;
                }
        }
        }
        for (char c:ch
             ) {
            System.out.print(c);
 
        }
        }
    }
