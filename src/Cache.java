import java.util.LinkedList;
import java.util.Queue;

public class Cache implements CacheLevel{
    Queue cache = new LinkedList();
    int size;
    public Cache(int size){
        this.size = size;
    }


    public int getSize(){
        return size;
    }
    @Override
    public boolean put(char key, int value) {
        if(cache.contains(key)) {
            System.out.println("Value Already Exist in cache memory");
            return false;
        }
        if (size ==0) {
            System.out.println("Cache Has Been Filled");
            return false;
        }

        main.mp.put(key,value);
        cache.add(key);
        size--;
        return true;
    }

    public boolean get(char c){
        if (!cache.contains(c)){
            return false;
        }else{
            return true;
        }
    }


    public void Remove(char key){
        cache.remove(key);
        size--;
    }


    public String print(){
        return cache.toString();
    }
}
