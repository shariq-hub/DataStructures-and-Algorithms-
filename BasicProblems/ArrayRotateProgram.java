import java.util.Scanner;



public class arrayRotate {
    public static void main(String[] args) {
        //array rotation program
        int []arr={1,2,3,4,5,6,7};
        int d=2;
        
        int []temp=new int[d];
        for(int i=0; i<d; i++) // here we copy the array elements in temp till d
        {
            temp[i]=arr[i];
        }
        for(int k=d; k<arr.length; k++) // here we shift all the elements to the left
        {
            arr[k-d]=arr[k];        
        }
        int a=0;
        for(int i=arr.length-d; i<arr.length; i++) // here we append the temp array elements at the end of array .
        {
            arr[i]=temp[a];
            a++;
        }
        for(int i=0; i<arr.length; i++) // here we print the elements to check wether it's working or not!
        {
            System.out.println(arr[i]);
        }

        

    }
    
         
}
