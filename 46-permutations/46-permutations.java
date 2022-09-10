class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> set = copyFromSetToArr(nums);
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> allRes = new ArrayList<>();
        permuteRec(set,res ,allRes);
        return  allRes ;
    }
    
    
    
    private void permuteRec(Set<Integer> set, List<Integer> res , List<List<Integer>> allRes) {

        if ( set.isEmpty()  ) {
            allRes.add(new ArrayList<>(res));
            return;
        }

        for (int num : set) {
            Set<Integer> copiedSet = new HashSet<>(set);
            res.add(num);
            copiedSet.remove(num);
            permuteRec( copiedSet, res, allRes);
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