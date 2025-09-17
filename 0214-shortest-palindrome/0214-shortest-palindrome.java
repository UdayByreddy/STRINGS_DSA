class Solution {
    public String shortestPalindrome(String s) {
        String reverse = new StringBuilder(s).reverse().toString();
        String pattern = s+'@'+reverse;
        int[] table = getTable(pattern);
        int paliLength = table[table.length-1];
        String toAdd = reverse.substring(0,s.length()-paliLength);
        return toAdd+s;
    }
    public int[] getTable(String s){
        int len=0;
        int i=1;
        int[] res = new int[s.length()];
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                res[i]=len;
                i++;
            }
            else{ 
            if(len!=0){
                len=res[len-1];
            }
            else{
                len=0;
                i++;
            }
            }
        }
        return res;
    }
}