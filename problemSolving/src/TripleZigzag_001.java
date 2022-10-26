/** Let's say a triple (a, b, c) is a zigzag if either a < b > c or a > b < c .Given an array of integers
 * numbers, your task is to check all the triples of its consecutive elements for being a zigzag. More formally, your
 * task is to construct an array of length numbers.length - 2, where the ith element of the output array equals 1 if
 * the triple (numbers[i], numbers[i + 1], numbers[i + 2]) is a zigzag, and 0 otherwise.
 * [execution time limit] 3 seconds (Java)
 * Guaranteed constraints:
 * 3 ≤ numbers.length ≤ 100,
 * */
import java.util.Arrays;

public class TripleZigzag_001 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4};
        System.out.println("contained Zigzag is: " + Arrays.toString(isZigzag(numbers)));

    }
    private static int[] isZigzag(int[] numbers) {
        int[] result = new int[numbers.length-2];

        for (int i = 0; i < result.length; i++) {
            int a = numbers[i];
            int b = numbers[i+1];
            int c = numbers[i+2];
            // Formula 1
            /*if(((a<b) && (b>c)) || ((a>b) && (b<c))) {
                result[i] = 1;
            }*/
            // Formula 2
            if((a-b) * (b-c) < 0) {
                result[i] = 1;
            }else  {
                result[i] = 0;
            }
        }
        return result;
    }
}
// Integers to use as test
    // {1, 2, 1, 3, 4}
    // {1000000000, 1000000000, 1000000000}
    // {1, 2, 3, 4}

// This formula (a-b) * (b-c) < 0) is the same a < b > c or a > b < c