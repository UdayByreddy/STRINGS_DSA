class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
        return 0;
        }
        boolean neg = s.charAt(0)=='-';
        boolean pos = s.charAt(0)=='+';
        int i=0;
        if(neg||pos){
           i++;
        }
        int ans=0;
        while(i<s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(ans>Integer.MAX_VALUE/10 || (ans==Integer.MAX_VALUE/10 && digit> Integer.MAX_VALUE%10)){
                return neg?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans = digit+ans*10;
            i++;
        }
        return neg?-ans:ans;
    }
}