import java.util.Map;

interface CacheLevel {
    boolean put(char key, int value);
//    String get(String key);
//    void evict();
//    void displayCache();
     int getSize();
    String print();


}
