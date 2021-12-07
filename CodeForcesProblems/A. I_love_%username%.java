import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        int input,max=0,min=0,temp,count=0;
        Scanner scanner =new Scanner(System.in);
        input=scanner.nextInt();
        for(int i=1; i<=input; i++){
            temp=scanner.nextInt();
            if(input==1){
                count=0;
                break;
            }
            if(i==1){
                min=temp;
                max=temp;
            }
                if(temp<min){
                    min=temp;
                    count+=1;
                }
                if(temp>max){
                    max=temp;
                    count+=1;
                
            }
        }
        System.out.println(count);
        
     

    }    
}
