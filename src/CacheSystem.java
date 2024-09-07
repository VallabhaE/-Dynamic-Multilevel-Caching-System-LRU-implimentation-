import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CacheSystem {
    List<CacheLevel> ls = new ArrayList<>();
    public synchronized void  addCacheLevel(int size,String ePolicy){ //works for only LRU now
        if( ePolicy.equals("LRU") ){
            ls.add(new LRU(size));
        }else{
            ls.add(new Cache(size));
        }

    }
    public synchronized void get(char key){
        if(!main.mp.containsKey(key)){
            System.out.println("Key Have not inserted");
            return;
        }
        //Remove from Cache
        boolean removedFromCache = false;
        for (CacheLevel c : ls){
            if (c instanceof Cache){
                if( ((Cache) c).get(key)){
                    removedFromCache = true;
                    ((Cache) c).Remove(key);
                }
            }
        }
        if(removedFromCache){
            for (CacheLevel c : ls){
                if (c instanceof LRU){
                    if (c.put(key,main.mp.get(key))){
                        break;
                    }
                }
            }
        }
    }


    void put(char key,int val){
        for(CacheLevel c : ls){
            if (c instanceof Cache){
                if (c.put(key,val)){
                    break;
                }
            }else{
                System.out.println("No Chaches Available for you to put,Please Add More Chaches or visit feature calls LRU which has been implimeted");
            }
        }
    }


    synchronized void removeCacheLevel(int idx){
        if(ls.get(idx-1).getSize()!=0) {
            System.out.println("Cant be removed size data Available");
            return;
        }

        ls.remove(idx-1);
        System.out.println("Cache has been removed");
    }

    void displayCache(){
        for (int i=0;i<ls.size();i++){
            if(ls.get(i) instanceof Cache){
                System.out.println("L"+(i+1)+": "+ls.get(i).print()+"-->Is a cache");
            }else{
                System.out.println("L"+(i+1)+": "+ls.get(i).print()+"-->LRU feature ");
            }
        }
    }


}
