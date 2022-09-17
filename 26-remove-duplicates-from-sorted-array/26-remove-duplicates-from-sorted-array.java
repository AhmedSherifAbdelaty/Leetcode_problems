class Solution {
    public int removeDuplicates(int[] nums) {
      
                   int track = 0, temp = -101;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != temp) {
                nums[track++] = nums[i];
            }
            temp = nums[i];
        }

        return track;
    }
}