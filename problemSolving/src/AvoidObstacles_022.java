/** You are given an array of integers representing coordinates of obstacles situated on a straight line.

 Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of
 the same length represented by some integer.

 Find the minimal length of the jump enough to avoid all the obstacles.

 Example

 For inputArray = [5, 3, 6, 7, 9], the output should be
 solution(inputArray) = 4.

 Check out the image in 'RESOURCES' directory for better understanding:

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer inputArray

 Non-empty array of positive integers.

 Guaranteed constraints:
 2 ≤ inputArray.length ≤ 1000,
 1 ≤ inputArray[i] ≤ 1000.

 [output] integer

 The desired length.
 * */

public class AvoidObstacles_022 {
    public static void main(String[] args) {
        int[] input = {1000, 999}; // refer to TEST CASES for more input
        System.out.println("minimal length of the jump is: " + solution(input));
    }

    private static int solution(int[] input) { // using for loop
        // 1. start with jump = 2 since we cannot jump by 0 or 1
        // 2. iterate tru each value in input
        // 3. check if value % jump == 0
            // a. increment jump
            // b. take index back to 0; d beginning of the input array
        // 4. check with next value and repeat step 3
        // 5. if no problems at all return the jump
        int jump = 2;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % jump == 0) {
                jump++;
                i = -1; // increment statement 'i++' in the for loop will add 1, which will take i back to 0
            }
        }

        return jump;
    }

    /*private static int solution(int[] inputArray) { // using Sorted array, boolean flag, and while loop
        boolean flag = false;
        int jump = 2;
        Arrays.sort(inputArray);
        while (!flag) {
            for (int j = 0; j < inputArray.length; j++) {
                if (inputArray[j] % jump == 0)  {
                    jump++;
                    break;
                }
                if (j == inputArray.length-1) flag = true;
            }
        }
        return jump;
    }*/
}

// TEST CASES
// int[] input = {5, 3, 6, 7, 9};
// int[] input = {2, 3};
// int[] input = {1, 4, 10, 6, 2};
// int[] input = {1000, 999};
// int[] input = {19, 32, 11, 23};
// int[] input = {5, 8, 9, 13, 14};