class Solution {
    public int removeDuplicates(int[] nums) {
                int index = 0 ;
        int duplicate = -1111 ;
        for (int n : nums){
            if (duplicate != n){
                nums[index++] = n ;
                duplicate = n ;
            }
        }
        return index;  
    }
}