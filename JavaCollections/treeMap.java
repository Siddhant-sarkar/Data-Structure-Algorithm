import java.util.*;
public class treeMap{
  public static void main(String[] args) {
    Map<String,Integer> numb = new TreeMap<>();
    // put(key,value) : it adds the elements the to map 
    // if the element is already in the hashmap then the value for the respective key get overriden
    // putifEmpty(key ,value) : it wont override the given data in the map

    numb.put("One",1);
    numb.put("Two",2);
    numb.put("Three",3);
    numb.putIfAbsent("Three", 93);
    System.out.println(numb);

    // containsKey(key) : it returns true or false if the map contains the given key or not
    // containsValue(key) : it returns true or false if the map contains the given value or not
    System.out.println(numb.containsKey("Threee"));
    System.out.println(numb.containsValue(89));

    //ITERATION
    //using the entry set for map interface
    for(Map.Entry<String, Integer> e : numb.entrySet()){
      System.out.println("key is "+e.getKey());
      System.out.println("value is " +e.getValue());
    }
    //using the individual characters 
    for(String s : numb.keySet()){
      System.out.println("All the keys are :" + s);
    }
    for(Integer i : numb.values()){
      System.out.println("All the values are : "+ i);
    }
    //isEmpty() : returns true if the map is empty or not
    System.out.println(numb.isEmpty());
    // clear(): it is used to remove all the elements form the hashmap
    numb.clear();
    // remove(key) : it is used to remove the given key value pair on the basis of the key
    numb.remove("One");

    System.out.println(numb);

  }
}
