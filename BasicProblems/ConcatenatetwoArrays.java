class ArraysConcatenation{
    public static void main(String[] args) {
     int arr1[]={1,2,3};
     int arr2[]={4,5,6};
     int arr3[]=new int[arr1.length+arr2.length]; // Here we create a new array of size arr1+arr2 length.
     int pos=0; // create this variable  for tracking of index of array 
    for(int i:arr1){
        arr3[pos]=i;
        pos++;
    }
        
     for(int j:arr2){
         arr3[pos]=j;
         pos++;
     }
     System.out.println(Arrays.toString(arr3)); // Here we convert array to String to get the array as an output in java 
    
              
    }
}
