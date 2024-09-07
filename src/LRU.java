import java.util.LinkedList;
import java.util.Queue;

public class LRU implements CacheLevel {
    Queue LRU = new LinkedList();
    int size;
    public LRU(int size){
        this.size = size;

    }

    public int getSize(){
        return size;
    }
    boolean AddLRU(int val){

        LRU.add(val);
        return true;
    }

    public String print(){
        return LRU.toString();
    }
    @Override
    public boolean put(char key,int value){
        if(this.LRU.size() == this.size) return false;
        main.mp.put(key,value);
        LRU.add(key);
        return true;
    }

    synchronized boolean get(char key){
        if (!main.mp.containsKey(key)){
            System.out.println("Key is not inserted");
            return false;
        }
        return LRU.contains(key);
    }


}
