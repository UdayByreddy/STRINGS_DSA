class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
      Arrays.sort(nums);
      List<Integer> arr = new ArrayList<>();
      for(int i=nums.length-1;i>=0;i--){
        if(i>0 && nums[i]==nums[i-1]) continue;
         if(k>0){
            arr.add(nums[i]);
            k--;
         }
      }
      int[] res = new int[arr.size()];
      for(int i=0;i<arr.size();i++){
        res[i] = arr.get(i);
      }  
      return res;
    }
}