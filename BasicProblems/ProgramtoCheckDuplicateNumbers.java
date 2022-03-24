import java.util.HashMap;
import java.util.HashSet;
class codeforcesquestions{
  
  public static void main(String[] args) {
    int []arr={1,2,3,1,2,4,5,2,5,3};
    int len = arr.length;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    for(int i = 0; i < len; i++) {
        int key = arr[i];
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.put(key, value + 1);
        } else {
            map.put(key, 1);      
          }
}
System.out.println(map);
}
}
