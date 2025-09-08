class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> StoC = new HashMap<>();
         Map<Character,Character> CtoS = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(StoC.containsKey(ch1) && StoC.get(ch1)!=ch2){
                return false;
            }
            if(CtoS.containsKey(ch2) && CtoS.get(ch2)!=ch1){
                return false;
            }
            StoC.put(ch1,ch2);
            CtoS.put(ch2,ch1);
        }
        return true;
    }
}