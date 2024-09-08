import java.util.*;
public class main {
    static final Map<Character,Integer> mp = new HashMap<>();

    public static void main(String[] args) {
        CacheSystem cs = new CacheSystem();
        cs.addCacheLevel(3,"Normal");
        cs.addCacheLevel(2,"LRU");
        cs.addCacheLevel(3,"Normal");

        cs.put('A',21);
        cs.put('B',22);
        cs.put('C',222);
        cs.put('D',222);

        cs.get('A');
        cs.get('D');
        cs.get('C');
        cs.get('A');
        cs.displayCache();
        cs.removeCacheLevel(1);


        //Display all available data with its keys below
        DisplayKeyValue();
    }


    static void DisplayKeyValue(){
        System.out.println("============================================");
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("============================================");

    }

}
