class Solution {
     public int romanToInt(String s) {
        List<Integer> list = new ArrayList<>();
        Map<Character, Integer> romanNum = getRomanMap();
        char[] chars = s.toCharArray();

        Character curr = null;
        if (s.length() == 1) {
            list.add(romanNum.get(s.charAt(0)));
        } else {
            boolean isCalculated = false ;
            for (char next : chars) {
                if (isCalculated) {
                    isCalculated = false ;
                    curr = next;
                    continue;
                }
                if (Objects.nonNull(curr)) {
                    if (romanNum.get(curr) > romanNum.get(next)) {
                        list.add(romanNum.get(curr));
                    }else if (romanNum.get(curr) < romanNum.get(next)) {
                        int n = romanNum.get(next) - romanNum.get(curr);
                        isCalculated = true ;
                        list.add(n);
                    }else {
                        list.add(romanNum.get(curr));
                    }
                }
                curr = next;
            }

            if (romanNum.get(chars[chars.length - 1]) <= romanNum.get(chars[chars.length - 2])){
                list.add(romanNum.get(chars[chars.length -1]));
            }
        }
        return list.stream().mapToInt(i -> i).sum();
    }

    static Map<Character, Integer> getRomanMap() {
        Map<Character, Integer> map = new TreeMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        return map;
    }
}