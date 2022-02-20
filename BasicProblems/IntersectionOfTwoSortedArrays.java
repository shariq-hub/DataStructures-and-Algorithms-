//Intersection of two sorted arrays in java 
public class Intersection{
    public static void main(String[] args) {
        //Intersection of two arrays
      
        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[]{1,3,5,7,9,11};
        int length=0;
        for(int i=0; i<arr2.length; i++)
        {
            for(int j=0; j<arr1.length; j++){
            if(arr2[i]==arr1[j]){
                length++;
            }
        }
    }
        System.out.println(length);        
    }
}
