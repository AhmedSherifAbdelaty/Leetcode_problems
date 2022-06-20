class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Integer,String>,Map<Character,Integer>> map = new HashMap<>();
        Map<Character,Integer> charMap ;
        int count = 0 ;
        for (String str : strs) {
            charMap = new HashMap<>();
            for (int j = 0; j < str.length(); j++) {
                charMap.merge(str.charAt(j), 1, Integer::sum);
            }
            Map<Integer,String> tempList = new HashMap<>();
            tempList.put(count , str);
            map.put(tempList, charMap);
            count++;
        }

        Map<Map<Character,Integer>,List<String>> beforeArray = new HashMap<>();
        for (Map.Entry<Map<Integer,String>, Map<Character,Integer>> entry : map.entrySet()) {
            Map<Integer,String> key = entry.getKey();
            Map<Character,Integer> value = entry.getValue();
            Map.Entry<Integer,String> keyWithIntAndString = key.entrySet().iterator().next();
            String originalKey = keyWithIntAndString.getValue();
            if (beforeArray.containsKey(value)){
                List<String> existMap = beforeArray.get(value);
                existMap.add(originalKey);
            }else {
                List<String> list = new ArrayList<>();
                list.add(originalKey);
                beforeArray.put(value, list);
            }
        }


        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<Map<Character,Integer>,List<String>> entry : beforeArray.entrySet()) {
            List<String> value = entry.getValue();
            res.add(value);
        }
            return res;
    }
     
}