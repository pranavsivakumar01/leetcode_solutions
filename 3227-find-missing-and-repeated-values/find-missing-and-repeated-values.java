import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int compare[] = new int[row * col];
        int index = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                compare[index++] = grid[i][j];
            }
        }

        Arrays.sort(compare);
        List<Integer> list = new ArrayList<>();
        int res[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : compare) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> a : map.entrySet()) {
            if (a.getValue() > 1) {
                list.add(a.getKey());
            }
        }

        int n = compare.length;
        int sum = 0;
        int formu = (n * (n + 1)) / 2;
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int re : compare) {
            uniqueNumbers.add(re);
        }

        for (int num : uniqueNumbers) {
            sum += num;
        }

        int ans = formu - sum;
        System.out.println("Missing Number: " + ans);

        
        res[0] = list.get(0); 
        res[1] = ans;

        return res;
    }
}
