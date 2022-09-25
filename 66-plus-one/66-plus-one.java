class Solution {
    
   public static int[] plusOne(int[] digits){
        StringBuilder elementBuilder = new StringBuilder();
        for(int i=0; i<digits.length; i++){
            elementBuilder.append(digits[i]);
        }
        elementBuilder = elementBuilder.reverse();
        boolean isIncremented = false;
        for(int i=0; i<elementBuilder.length(); i++){
            if(elementBuilder.charAt(i) != '9'){
                Integer res = Integer.parseInt(elementBuilder.charAt(i)+"")+1;
                elementBuilder.setCharAt(i, res.toString().charAt(0));
                isIncremented = true;
                break;
            }

            elementBuilder.setCharAt(i, '0');
        }
        if(!isIncremented)
            elementBuilder.append('1');

        elementBuilder = elementBuilder.reverse();
        int[] data = new int[elementBuilder.length()];
        for(int i=0; i<elementBuilder.length(); i++){
            data[i] = Integer.parseInt(elementBuilder.charAt(i)+"");
        }
        return data;
    }
    
}