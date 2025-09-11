class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        return recursive("1",1,n);
    }
    public String recursive(String str,int start,int target){
        if(start==target) return str;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            int count=1;
            while(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
        sb.append(count);
        sb.append(str.charAt(i));
        }
        return recursive(sb.toString(),start+1,target);
    }


}