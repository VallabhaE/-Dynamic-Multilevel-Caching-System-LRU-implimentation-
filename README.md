Note: Before reading the documentation, please be aware that all code is written and available in the src directory.(clone and use it)

Question: Which feature has been implemented, LRU or LFU?

Answer: I chose LRU.

Explanation: My understanding is that if a user tries to access a character or string, it should be shown to the newly added feature (LRU).

Code Design:

Since I implemented LRU, my understanding is that both a normal cache and an LRU cache can be created according to the user's requirements for size. When a user uses the put method, all the data will be moved to all available caches. If a user tries to access any character, it will be moved to the LRU feature, which I have implemented. The code is designed in a way that it can be extended to include LFU as well, given that an interface is used.

Sample Code and Output: (I will try to update this README file to make it more readable in the coming days.)
NOTE := the input and output may not be accurate sinice i am continuesly updating, please clone and give it a try and my code can be customisable according to your need please contact me through mail
        eashwarvallabha180@gmail.com
if you have time please visit my portfolio  := https://eswarportfolio.onrender.com/about
      

)
//code


        CacheSystem cs = new CacheSystem();
        cs.addCacheLevel(3,"Normal");
        cs.addCacheLevel(2,"LRU");
        cs.addCacheLevel(3,"Normal");
        cs.addCacheLevel(2,"LRU");
        
        cs.put('A',21);
        cs.put('B',22);
        cs.put('C',222);
        cs.put('D',222);
        cs.get('A');
        cs.get('D');
        cs.get('C');
        cs.displayCache();
        cs.removeCacheLevel(1);

        
//output


    Cache Has Been Filled
        No Chaches Available for you to put,Please Add More Chaches or visit feature calls LRU which has been implimeted
        Cache Has Been Filled
        No Chaches Available for you to put,Please Add More Chaches or visit feature calls LRU which has been implimeted
        L2: [A, E]-->LRU feature 
        Cache has been removed

        Total Available Cache data can be added/removed
        ============================================
        A: 21
        B: 22
        C: 222
        D: 222
        E: 222
        ============================================




