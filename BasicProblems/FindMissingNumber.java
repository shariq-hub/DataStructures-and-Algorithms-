
Problem Link:https://leetcode.com/problems/missing-number/

public class FindMissingNumber{
public static void main(String[] args){
  int arr[]=new int[]{0,1,3,4};
  int sum=arr.length*(arr.length+1)/2; // To get the sum till Max variable which is in our case is 4 because the elements are unique so it obvious the length of arr is it's max value
  int count=0;
    for(int i=0;i<nums.length;i++){
        count+=nums[i];
    }
    
   System.out.println(sum-count); // in our case it will be 2

}
}
