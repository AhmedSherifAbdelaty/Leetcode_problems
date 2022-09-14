class Solution {
    public  int countVowelStrings(int n) {
        int [] firstArr = {1,1,1,1,1};
        int sum = 5 ;
        int [] calcArr = Arrays.copyOf(firstArr , 5);

        if ( n >= 2 ) {
            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= 4; j++) {
                    if (j == 0) {
                        calcArr[0] = sum;
                    } else {
                        calcArr[j] = calcArr[j - 1] - firstArr[j - 1];
                    }
                }
                firstArr = Arrays.copyOf(calcArr, 5);
                sum = getSum(firstArr);
            }

        }



        return sum;
    }

    private  int getSum(int[] firstArr) {
        int sum = 0 ;
        for (int i = 0; i < firstArr.length ; i++){
            sum += firstArr[i];
        }
        return sum;
    }
}