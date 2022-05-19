import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> sampleHashMap = new HashMap<>();

//        Putting data into hashmap
        sampleHashMap.put("Python", "My first programming language");
        sampleHashMap.put("Javascript", "My current programming language");
        sampleHashMap.put("Java", "Still learn about Java");

//      Check if samplehashmap contain a key
        if (sampleHashMap.containsKey("Python")) {
            System.out.println("Contains Python");
        }

//      Looping through hashmap
        for (String key : sampleHashMap.keySet()) {
            System.out.println(key + " : "  + sampleHashMap.get(key));
        }
    }
}
