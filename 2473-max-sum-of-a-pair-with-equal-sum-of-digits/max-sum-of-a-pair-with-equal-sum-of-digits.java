import java.util.*;

class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, Integer> digitSumMap = new HashMap<>();

        for (int num : nums) {
            int digitSum = sumdigit(num);
            
            if (digitSumMap.containsKey(digitSum)) {
                max = Math.max(max, digitSumMap.get(digitSum) + num);
            }
            
           
            digitSumMap.put(digitSum, Math.max(digitSumMap.getOrDefault(digitSum, 0), num));
        }

        return max;
    }

    public int sumdigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
