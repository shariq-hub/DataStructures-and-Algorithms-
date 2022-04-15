import java.util.HashMap;
import java.util.HashSet;
class codeforcesquestions{
  
  public static void main(String[] args) {
    int []arr={1,2,3,1,2,4,5,2,5,3};
    int len = arr.length;
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); // Here we create a Hashmap to store key and value type data
    for(int i = 0; i < len; i++) {
        int key = arr[i]; // Here we will store each element to check wether it's present in the map or not.
        if (map.containsKey(key)) // If it does present
        {
            int value = map.get(key); // we first take that key
            map.put(key, value + 1); //and put inside the same key 
        } else {
            map.put(key, 1);      // if not contains then we simply add in the map
          }
}
System.out.println(map);
}
}
