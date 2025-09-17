class Solution {
    public String longestPrefix(String s) {
        int[] table = new int[s.length()];
        int len=0;
        int i=1;
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                table[i]=len;
                i++;
        }
        else{
            if(len!=0){
                len=table[len-1];
            }
            else{
                table[i]=0;
                i++;
            }
        }
        }
        return s.substring(0,table[table.length-1]);
    }
}