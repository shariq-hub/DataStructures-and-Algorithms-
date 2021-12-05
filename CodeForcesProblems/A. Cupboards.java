import java.util.Scanner;
 
 
public class project{
    public static void main(String[] args) {
      int number=0,count0=0,count1=0,count=0,count2=0,count3=0;
      Scanner scanner=new Scanner(System.in);
      number=scanner.nextInt();
      int n1,n2;
      for(int i=0; i<number; i++){
        n1=scanner.nextInt(); //0 1 0 1 0
        n2=scanner.nextInt(); //1 0 1 1 1
        if(n1==0){
          count0+=1; //3
        }
        else{
          count1+=1; //2
        }
        if(n2==0){
          count2+=1;//1
        }
        else{
          count3+=1; //4
        }
    }
    if(count0>count1){
      count+=count1;
    }
    else{
      count+=count0;
    }
    if(count2>count3){
      count+=count3;
    }
    else{
      count+=count2;
    }
System.out.println(count);
    }
}
