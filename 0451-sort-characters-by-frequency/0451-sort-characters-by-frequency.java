import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Count the frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> maxheap = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        maxheap.addAll(map.entrySet());
       StringBuilder sb = new StringBuilder();
        while(!maxheap.isEmpty()){
            Map.Entry<Character,Integer> m =  maxheap.poll();
            char d = m.getKey();
            int e = m.getValue();
            for(int i=0;i<e;i++){
                sb.append(d);
            }
        }
        return sb.toString();
    }
}
