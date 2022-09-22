class Solution {
    public int searchInsert(int[] nums, int target) {
              int current  ;
      for (int i = 0 ; i < nums.length ; i++) {
          current = nums[i];
          if (nums[i] == target || current > target) return i ;
          if (i == nums.length - 1 ) return nums.length ;
      }
      return 0;
    }
}