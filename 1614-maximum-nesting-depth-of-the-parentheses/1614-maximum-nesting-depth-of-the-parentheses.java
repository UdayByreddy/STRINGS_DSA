class Solution {
    public int maxDepth(String s) {
        int count = Integer.MIN_VALUE;
        int leftB=0;
        int rightB=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
                leftB++;
            }
            else if(ch==')'){
                rightB++;
            }
            count =Math.max(count,(leftB-rightB));
        }
        return count;
    }
}