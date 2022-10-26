import java.util.Arrays;

/**Ratiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue
 * having an non-negative integer size. Since he likes to make things perfect, he wants to arrange
 * them from smallest to largest so that each statue will be bigger than the previous one exactly by 1.
 * He may need some additional statues to be able to accomplish that. Help him figure out the minimum
 * number of additional statues needed.

 Example
 For statues = [6, 2, 3, 8], the output should be
 solution(statues) = 3.

 Ratiorg needs statues of sizes 4, 5 and 7.

 Input/Output
 [execution time limit] 3 seconds (java)

 [input] array.integer statues
 An array of distinct non-negative integers.

 Guaranteed constraints:
 1 ≤ statues.length ≤ 10,
 0 ≤ statues[i] ≤ 20.

 [output] integer

 The minimal number of statues that need to be added to existing statues such that it contains every integer size
 from an interval [L, R] (for some L, R) and no other sizes.
 * */

public class MakeArrayConsecutive2_006 {
    public static void main(String[] args) {
        int[] inputArray = {6, 2, 3, 8}; //refer to TEST CASES for more use case
        System.out.println("min additional status needed is: " + solution(inputArray));
    }
    static int solution(int[] statues) {
       /* int n = statues.length;


        int result = 0;
        // Sorted using selection algorithm
        for (int i = 0; i < n-1; i++) {
            // Find the minimum element in unsorted array
            int min_element = i;
            for (int j = i+1; j < n; j++)
                if (statues[j] < statues[min_element])
                    min_element = j;

            // Swap the found minimum element with the first
            // element
            int temp = statues[min_element];
            statues[min_element] = statues[i];
            statues[i] = temp;
        }
        result = (statues[n-1] - statues[0]) - n + 1;
        return result;*/
        int min = statues[0];
        int max = statues[0];
        for (int i=1; i<statues.length; i++) {
            min = Math.min(min, statues[i]);
            max = Math.max(max, statues[i]);
        }
        return (max-min+1) - statues.length;
    }
}
    // TEST CASES
// statues: [6, 2, 3, 8]
// statues: [0, 3]
// statues: [5, 4, 6]
// statues: [6, 3]
// statues: [1]

// OTHER APPROACH TO SOLVE THE PROBLEM
// 1. Using Java api - Arrays.sort(a[])
            /* Arrays.sort(inputArray);
                }*/
// 1. Using Java api - Math.min and Math.max
            /* int solution(int[] statues) {
    int min = statues[0];
    int max = statues[0];
    for (int i=1; i<statues.length; ++i) {
        min = Math.min(min, statues[i]);
        max = Math.max(max, statues[i]);
    }
    return (max-min+1) - statues.length;
}
                }*/
