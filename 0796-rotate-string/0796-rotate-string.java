class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.equals(goal)){
            return true;
        }
        for(int i=1;i<s.length();i++){
            String tep = s.substring(i)+s.substring(0,i);
            if(tep.equals(goal)){
                return true;
            }
        }
        return false;
    }
}