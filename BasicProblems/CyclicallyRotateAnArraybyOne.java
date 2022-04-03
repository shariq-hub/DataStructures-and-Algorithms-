
//Problem link:https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1#
// Solution in java
public class queueimplementation{
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5}; //output is 5,1,2,3,4
        int length=arr.length;
        int temp=arr[length-1];
         for(int i=length-1; i>0; i--) 
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        
        for(int c:arr){
        System.out.println(c); // Here we are printing the answer
        }
    }
}
