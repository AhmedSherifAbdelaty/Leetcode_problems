import java.util.*;
import static java.util.stream.Collectors.toMap;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        Arrays.sort(nums);
        int count = 1 ;
        if (nums.length == 1 ){
            map.put(nums[0] , 1);
        }else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    count++;
                } else {
                    map.put(nums[i], count);
                    count = 1;
                }

                if (i + 1 == nums.length - 1) {
                    map.put(nums[i+1], count);
                }
            }
        }

        Map<Integer, Integer> result = map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(k).collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2 ,  LinkedHashMap::new));
        List<Integer> list = new ArrayList<>();
        result.forEach( (key,value) -> {
            list.add(key);
        });
        return list.stream().mapToInt(Integer::intValue).toArray();
    }



}