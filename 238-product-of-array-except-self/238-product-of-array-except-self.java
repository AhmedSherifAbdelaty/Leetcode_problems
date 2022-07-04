class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] n1 = new int [nums.length];
        for (int i = 0 ; i < nums.length ; i++){
            if ( i == 0) {
                n1[i] = nums[i];
            }else if (i == 1) {
                n1[i] = nums[0] ;
            }else {
                n1[i] = nums[i - 1] * n1[i - 1];
            }
        }
        int [] n2 = new int[nums.length -1];
        n2[n2.length -1] = nums[nums.length -1];
        for (int i = nums.length - 2 ; i > 0 ; i--){
            n2[i-1] = nums[i] * n2[i];
        }

        for (int i = 0 ; i < n2.length ; i++) {
            if (i == 0 ) n1[i] = n2[i];
            else
            n1[i] = n2[i] * n1[i];
        }

        return n1;
    }
}