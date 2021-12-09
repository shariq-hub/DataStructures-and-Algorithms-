// Codeforces Problem 116A Solution in java A. Tram

import java.util.Scanner;

public class CodeforcesProblems {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=0,tram=0;
        int n1,n2,point=0,output=0;
        input=scanner.nextInt();
        for(int i=1; i<=input; i++){
            n1=scanner.nextInt();
            n2=scanner.nextInt();
            if(n1>=0&&n2>0&&i==1){
                tram=n1+n2; //0+3
                point=tram;//3
            }
            else{
                tram=tram-n1; //6-4
                tram+=n2; //6 2+2=4
            }
            if(tram>point){
                point=tram; //6
            }

        }
        System.out.println(point);
    }    
}
