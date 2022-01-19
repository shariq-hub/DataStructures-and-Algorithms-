// Binary search Implementation in java
public static int BinarySearch(int arr[],int target){
        int start=0,end=arr.length-1;  //1 2 3 4 5 6 7 8 9 10
                                     //start  mid        //end
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target<mid){
                end=mid-1;
            }
            else if(target>mid){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        
        
        return -1;
    }    
