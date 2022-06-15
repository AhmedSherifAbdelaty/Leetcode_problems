class Solution {
    
       public  int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        Map<Integer,Integer> numAndIndexMap = new HashMap<>();
        for (int i = 0 ; i < nums.length ; i++){
            if (!numAndIndexMap.containsKey(nums[i])){
                numAndIndexMap.put(nums[i] , i );
                if (target - nums[i] != nums[i]) {
                    numAndIndexMap.put(target - nums[i], -1);
                }
            } else if ( numAndIndexMap.get(target - nums[i]) >= 0 && nums[numAndIndexMap.get(target - nums[i])] + nums[i] == target) {
                    res[0] = numAndIndexMap.get(target - nums[i]);
                    res[1] = i;
                    break;

            }
        }
        return res;
    }
        
}