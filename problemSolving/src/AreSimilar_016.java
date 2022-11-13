/**
 * Two arrays are called similar if one can be obtained from another by swapping at most one pair of elements in one of the arrays.
 * <p>
 * Given two arrays a and b, check whether they are similar.
 * <p>
 * Example
 * <p>
 * For a = [1, 2, 3] and b = [1, 2, 3], the output should be
 * solution(a, b) = true.
 * <p>
 * The arrays are equal, no need to swap any elements.
 * <p>
 * For a = [1, 2, 3] and b = [2, 1, 3], the output should be
 * solution(a, b) = true.
 * <p>
 * We can obtain b from a by swapping 2 and 1 in b.
 * <p>
 * For a = [1, 2, 2] and b = [2, 1, 1], the output should be
 * solution(a, b) = false.
 * <p>
 * Any swap of any two elements either in a or in b won't make a and b equal.
 * <p>
 * Input/Output
 * <p>
 * [execution time limit] 3 seconds (java)
 * <p>
 * [input] array.integer a
 * <p>
 * Array of integers.
 * <p>
 * Guaranteed constraints:
 * 3 ≤ a.length ≤ 105,
 * 1 ≤ a[i] ≤ 1000.
 * <p>
 * [input] array.integer b
 * <p>
 * Array of integers of the same length as a.
 * <p>
 * Guaranteed constraints:
 * b.length = a.length,
 * 1 ≤ b[i] ≤ 1000.
 * <p>
 * [output] boolean
 * <p>
 * true if a and b are similar, false otherwise.
 */

import java.util.Stack;

public class AreSimilar_016 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {2, 1, 3}; // refer to TEST CASES for more input
        System.out.println("Are similar is: " + solution(a, b));
    }

    /*private static boolean solution(int[] a, int[] b) { // 1st approach: using a STACK
        // 1. Compare each element per index
        // 2. If a mismatch
            // create a stack to hold the index value of the mismatch
                // increment counter of diff
            // afterwards, if another mismatch, use the stack index to compare whether a swap is possible
        Stack<Integer> stackIndex = new Stack<>();
        int diff = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                if (stackIndex.isEmpty()) {
                    stackIndex.add(i);
                    diff++;
                } else if (a[i] == b[stackIndex.peek()] && b[i] == a[stackIndex.peek()]) {
                    stackIndex.pop();
                }
            }
            if (diff >= 2) {
                return false;
            }
        }
        return stackIndex.empty();
    }*/

    private static boolean solution(int[] a, int[] b) { // 2nd approach: use count <= 2 and check equality after mult
        int count = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                count++;
            s1 *= a[i];
            s2 *= b[i];
        }
        return count <= 2 && s1 == s2;
    }

/*    private static boolean solution(int[] A, int[] B) { // 3rd approach using count <=2 & comparing diagonal for equality
        int cnt = 0, a1 = 0, a2 = 0, b1 = 0, b2 = 0;
        for (int i = 0; i < A.length; i++)
            if (A[i] != B[i]) {
                cnt++;
                if (cnt == 1) {
                    a1 = A[i];
                    b1 = B[i];
                } else if (cnt == 2) {
                    a2 = A[i];
                    b2 = B[i];
                }
            }
        return cnt == 0 || cnt == 2 && a1 == b2 && a2 == b1;
    }*/
}

// TEST CASES
// int[] a = {1, 2, 3} , b = {1, 2, 3};
// int[] a = {1, 2, 3} , b = {2, 1, 3};
// int[] a = {1, 2, 2} , b = {2, 1, 1};
// int[] a = {1, 2, 1, 2} , b = {2, 2, 1, 1};
// int[] a = {1, 2, 1, 2, 2, 1} , b = {2, 2, 1, 1, 2, 1};
// int[] a = {1, 1, 4} , b = {1, 2, 3};
// int[] a = {1, 2, 3} , b = {1, 10, 2};
// int[] a = {2, 3, 1} , b = {1, 3, 2};
// int[] a = {2, 3, 9} , b = {10, 3, 2};
// int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279} , b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};

