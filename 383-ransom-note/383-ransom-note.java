class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> ransomNoteMap = findNumOfOccurrence(ransomNote);
        Map<Character,Integer> magazineMap = findNumOfOccurrence(magazine);
        boolean res = false ;
        if (magazineMap.keySet().containsAll(ransomNoteMap.keySet())) {
            for (Map.Entry<Character, Integer> ransomNoteElement : ransomNoteMap.entrySet()) {
               char ch = ransomNoteElement.getKey();
               int n = ransomNoteElement.getValue();
               if (magazineMap.get(ch) >= n) {
                   res = true ;
               } else {
                   res = false ;
                   break;
               }
            }
        }
      return  res;
    }

    private  Map<Character,Integer> findNumOfOccurrence(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() ; i++){
            char ch = str.charAt(i);
            if (map.containsKey(ch)){
                int n = map.get(ch);
                map.replace(ch, ++n);
            }else {
                map.put(ch , 1);
            }
        }
        return map;
    }
}