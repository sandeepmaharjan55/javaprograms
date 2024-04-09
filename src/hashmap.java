import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class hashmap {
    public static void main(String[] args) {
        //hashmap is not thread safe. however Hashtable and concurrenthashtable are thread safe.
        //top 5 polluted cities
        HashMap <String,Integer> rankCities= new HashMap<>();
        rankCities.put("Beijing",1);
        rankCities.put("Pokhara",2);
        rankCities.put("San Francisco",3);
        rankCities.put("Illam",4);
        rankCities.put("Jillam",5);
        rankCities.put(null,10);
        System.out.println(rankCities);
        System.out.println("rank of beijing: "+rankCities.get("Beijing"));
        for (String i: rankCities.keySet()
             ) {
            System.out.println("key print: "+i+" and values "+ rankCities.get(i));
            
        }

    }
}
