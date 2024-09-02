import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        //HashMap<String,String> hm = new HashMap<>();
        
        myHashMap<String,String> myHash = new myHashMap<>();
        myHash.put("A", "B");
        myHash.put("E", "F");
        myHash.put("H", "P");
        myHash.put("P", "2");
        myHash.put("1", "G");
        myHash.put("2", "6");
        myHash.put("3", "2");
        myHash.put("4", "4");
        myHash.put("1", "H");

        System.out.println(myHash);
    }
}
