
// Array concatenation in java 
public class queueimplementation{
    public static void main(String[] args) {
      String[] a={"1","2","3"};
      String [] b={"a","b","c"};
      int g=0;
      int length=a.length+b.length;
        String[] c=new String[length];
        for(int i=0; i<a.length; i++){
            c[i]=a[i];
        }
        for(int j=a.length; j<length; j++){
            c[j]=b[g];
            g++;
        }
         for(String h:c){
            System.out.println(h);
         }
        
    }
}
