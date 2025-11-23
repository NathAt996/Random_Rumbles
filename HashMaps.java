import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        HashMap<String , Integer> map = new HashMap<>();


        map.put("Alice" , 28);
        map.put("Bob", 35);
        map.put("David" , 23);




        System.out.println("Original map : ");


        for(String key : map.keySet()) {

            System.out.println("Key : " + key + ", age " + map.get(key));
        }


        map.put("Bob", 36);


        map.remove("David");


        System.out.println("\nUpdated map : ");


        for(String key : map.keySet()) {

            System.out.println("Key : " + key + ", age " + map.get(key));
        }
    }
}
