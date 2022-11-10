/**
 * Several people are standing in a row and need to be divided into two teams. The first person goes into
 * team 1, the second goes into team 2, the third goes into team 1 again, the fourth into team 2, and so on.
 * <p>
 * You are given an array of positive integers - the weights of the people. Return an array of two integers, where
 * the first element is the total weight of team 1, and the second element is the total weight of team 2 after the
 * division is complete.
 * <p>
 * Example
 * <p>
 * For a = [50, 60, 60, 45, 70], the output should be
 * solution(a) = [180, 105].
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * Guaranteed constraints:
 * 1 ≤ a.length ≤ 105,
 * 45 ≤ a[i] ≤ 100.
 * <p>
 * [output] array.integer
 */

import java.util.Arrays;

public class AlternatingSum_014 {
    public static void main(String[] args) {
        int[] input = {50, 60, 60, 45, 70}; // refer to TEST CASES for more input
        System.out.println("Output is: " + Arrays.toString(solution(input)));
    }
    private static int[] solution(int[] input) {int[] outPut = new int[2];
        int team1 = 0;
        int team2 = 0;

        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) team1 += input[i];
            else team2 += input[i];
        }
        outPut[0] = team1;
        outPut[1] = team2;
        return outPut;
    }

    /*private static int[] solution(int[] input) { // Another approach with few lines of code
        int[] outPut = new int[2];
        for (int i = 0; i < input.length; i++) {
            outPut[i % 2] += input[i];
        }
        return outPut;
    }*/
}

// TEST CASES
// int[] input = {50, 60, 60, 45, 70};
// int[] input = {100, 50};
// int[] input = {80};
// int[] input = {100, 50, 50, 100};
// int[] input = {100, 51, 50, 100};
// int[] input = {100, 51, 50, 100};
