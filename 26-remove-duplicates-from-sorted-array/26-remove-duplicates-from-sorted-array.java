class Solution {
    public int removeDuplicates(int[] nums) {
      
             int [] copyNum = Arrays.copyOf(nums , nums.length);
        int duplicatedValue  = Integer.MIN_VALUE;
        int duplicatedIndex  = 0 ;

        if (nums.length == 1 ){
            return 1;
        }

        for (int i = 0 ; i < copyNum.length -1 ; i++){
            if (copyNum[i] == copyNum[i+1]){
                duplicatedValue = copyNum[i];
            } else if (duplicatedValue != Integer.MIN_VALUE){
                nums[duplicatedIndex] = duplicatedValue;
                duplicatedValue = Integer.MIN_VALUE;
                duplicatedIndex++;
            } else {
                nums[duplicatedIndex] = copyNum[i];
                duplicatedIndex++;
            }
            if (  i + 1 == copyNum.length -1   ) {
                nums[duplicatedIndex] = copyNum[i+1];
                duplicatedIndex++;
            }
        }


     return   duplicatedIndex ;   
    }
}