/**
 * Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.
 * <p>
 * Example
 * <p>
 * For inputArray = [2, 4, 1, 0], the output should be
 * solution(inputArray) = 3.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer inputArray
 * <p>
 * Guaranteed constraints:
 * 3 ≤ inputArray.length ≤ 10,
 * -15 ≤ inputArray[i] ≤ 15.
 * <p>
 * [output] integer
 * <p>
 * The maximal absolute difference.
 */

public class ArrayMaxAdjDiff_020 {
    public static void main(String[] args) {
        int[] input = {10, 11, 13}; // refer to TEST CASES for more input
        System.out.println("Maximal absolute difference is: " + solution(input));
    }

    /*private static int solution(int[] input) { // My own solution
        int maxAbsDiff = input[0] - input[1];
        for (int i = 1; i < input.length - 1; i++) {
            int diff = Math.abs(input[i] - input[i+1]);
            if (diff >= maxAbsDiff) maxAbsDiff = diff;
        }
        return  maxAbsDiff;
    }*/

    /*private static int solution(int[] inputArray) { // Using Math class
        int max=0;
        for( int i = 1 ; i < inputArray.length ; i++ ){
            max = Math.max(max,Math.abs(inputArray[i] - inputArray[i-1]));
        }
        return max;
    }*/

    /*private static int solution(int[] inputArray) { // using IntStream
        return IntStream.range(0, inputArray.length - 1)
                .map(i -> Math.abs(inputArray[i] - inputArray[i + 1]))
                .max().getAsInt();
    }*/

    /*private static int solution(int[] inputArray) {
        return IntStream.range(0, inputArray.length-1)
                .map(i -> Math.abs(inputArray[i] - inputArray[i+1]))
                .peek(diff -> System.out.println(diff)) // Lambda can be replaced with method reference
                .max().orElse(0);
    }*/

    private static int solution(int[] inputArray) { // using while loop
        int difference =0;
        int i=0;
        while (i< inputArray.length -1) {
            if (Math.abs(inputArray[i+1] -inputArray[i]) > difference)
                difference = Math.abs(inputArray[i+1] -inputArray[i]);
            i++;
        }
        return difference;
    }
}

// TEST CASES
// int[] input = {2, 4, 1, 0};
// int[] input = {1, 1, 1, 1};
// int[] input = {-1, 4, 10, 3, -2};
// int[] input = {10, 11, 13};
// int[] input = {-2, -2, -2, -2, -2};
// int[] input = {-1, 1, -3, -4};
// int[] input = {-14, 15, -15};
