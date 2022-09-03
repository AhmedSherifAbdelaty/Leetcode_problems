class Solution {
public  int romanToInt (String s ){
        Map<Character , Integer> romanMap = getRomanMap();
        int length = s.length() -1 ;

        int sum = 0 ;
        if (s.length() == 1 ) sum+= romanMap.get(s.charAt(0));
        for (int i = 0 ; i < length ; i++) {
            int num1 = romanMap.get(s.charAt(i));
            int num2 = romanMap.get(s.charAt(i+1));
            if (num1 >= num2) {
                sum+=num1 ;
                if (i + 1 == length)  sum+=num2;
            }
            else {
                sum+= (num2 - num1);
                if (i + 2 == length) sum+= romanMap.get(s.charAt(i+2));
                i++;

            }
        }

        return sum;
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