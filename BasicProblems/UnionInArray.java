class Solution{
    public static int doUnion(int a[], int m, int b[], int n) 
    {
     Set<Integer> s = new HashSet<Integer>();
     for(int x:a){
         s.add(x);
     }
     for(int y:b){
         s.add(y);
     }
     return s.size();

    }
}
