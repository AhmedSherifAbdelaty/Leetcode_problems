class Solution {
    public List<List<Integer>> permute(int[] nums) {
           Set<Integer> set = copyFromSetToArr(nums);
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> allRes = new ArrayList<>();
        permuteRec(nums,set,res ,allRes);
        return  allRes ;
    }
    
    
    
    
        private  void permuteRec(int[] nums, Set<Integer> set, List<Integer> res , List<List<Integer>> allRes) {

        if (res.size() == set.size() ) {
            Set<Integer> newSet = new HashSet<>(res);
           if (newSet.size() == set.size()) {
               List<Integer> newRes = new ArrayList<>(res);
               allRes.add(newRes);
           }
            return;
        }

        for (int num : nums) {
            res.add(num);
            permuteRec(nums, set, res, allRes);
            res.remove(res.size() - 1 );
        }
    }
    
    
        private Set<Integer> copyFromSetToArr(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set;
    }
    
    
}