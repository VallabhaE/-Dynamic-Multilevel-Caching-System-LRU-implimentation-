import java.util.*;
public class main {
    static final Map<Character,Integer> mp = new HashMap<>();

    public static void main(String[] args) {
        CacheSystem cs = new CacheSystem();
        cs.addCacheLevel(3,"Normal");
        cs.addCacheLevel(2,"LRU");

        cs.put('A',21);
        cs.put('B',22);
        cs.put('C',222);
        cs.put('S',2);
        cs.put('Z',2);
        cs.put('X',2);
        cs.get('A');


        cs.displayCache();
    }

}
