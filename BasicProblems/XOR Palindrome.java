/* package codechef; // don't place package name! */
// Codechef problem link:https://www.codechef.com/FEB222C/problems/XORPAL

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String s;
        int length=0;
        int count0=0,count1=0;
        while(t-->0){
            int n=scanner.nextInt();
            s=scanner.next();
            length=s.length();
            if(length%2==0){
                count0=0;
                count1=0;
                for(int i=0;i<length;i++){
                    if(s.charAt(i)=='0'){
                        count0++;
                    }
                    else if(s.charAt(i)=='1'){
                        count1++;
                    }
                   
                }
                if(count0==count1){
                    System.out.println("Yes");
                }
                else if(count0==0||count1==0){
                    System.out.println("Yes");
                }
                 else if(count0%2==0&&count1%2==0){
                    System.out.println("Yes");
                }
                else{
                    System.out.println("No");
                }
        }
        else{
            System.out.println("Yes");
        }
        }

	}
}
