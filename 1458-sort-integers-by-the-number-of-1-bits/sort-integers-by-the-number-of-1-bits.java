import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[] to use Comparator
        Integer[] integerArr = Arrays.stream(arr)    // Convert int[] to Stream<Integer>
                                      .boxed()        // Box the int values into Integer
                                      .toArray(Integer[]::new); // Convert Stream<Integer> to Integer[]

        // Sort the Integer[] array with a custom comparator
        Arrays.sort(integerArr, (a, b) -> {
            int bitCountA = Integer.bitCount(a);  // Count 1 bits in a
            int bitCountB = Integer.bitCount(b);  // Count 1 bits in b

            if (bitCountA == bitCountB) {
                return Integer.compare(a, b);  // If bit counts are equal, compare by value
            }
            return Integer.compare(bitCountA, bitCountB);  // Otherwise, compare by number of set bits
        });

        // Convert the Integer[] back to int[] before returning
        return Arrays.stream(integerArr)
                     .mapToInt(Integer::intValue)  // Convert Integer to int
                     .toArray();  // Convert Stream<int> to int[]
    }
}
