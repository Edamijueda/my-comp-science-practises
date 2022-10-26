/**Given a sequence of integers as an array, determine whether it is possible to obtain a strictly
 * increasing sequence by removing no more than one element from the array.

 Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing
 only one element is also considered to be strictly increasing.

 Example
 For sequence = [1, 3, 2, 1], the output should be
 solution(sequence) = false.
 There is no one element in this array that can be removed in order to get a strictly increasing sequence.
 For sequence = [1, 3, 2], the output should be
 solution(sequence) = true.
 You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get
 the strictly increasing sequence [1, 3].

 Input/Output
 [execution time limit] 3 seconds (java)

 [input] array.integer sequence

 Guaranteed constraints:
 2 ≤ sequence.length ≤ 105,
 -105 ≤ sequence[i] ≤ 105.

 [output] boolean
 Return true if it is possible to remove one element from the array in order to get a strictly increasing sequence,
 otherwise return false
 *
 */

public class AlmostIncreSeq_007 {
    public static void main(String[] args) {
        int[] inputSeq = {1, 3, 2, 1}; //refer to TEST CASES for more use case
        System.out.println("possibility is: " + solution(inputSeq));
    }
    static boolean solution(int[] sequence) {
        int removed = 0;

        for (int i = 0; i < sequence.length - 2 && removed <= 2; i ++) {
            int a = sequence[i];
            int b = sequence[i+1];
            int c = sequence[i+2];

            if (a >= b) {
                removed++;
                sequence[i] = b -1;
            }

            if (b >= c){
                removed++;

                if (a == c) {
                    sequence[i+2] = b +1;
                } else {
                    sequence[i+1] = a;
                }
            }
        }

        return removed <= 1;
    }
}

// TEST CASES
// sequence: [1, 3, 2, 1] false
// sequence: [1, 3, 2] true
// sequence: [1, 2, 1, 2] false
// sequence: [3, 6, 5, 8, 10, 20, 15] false
// sequence: [1, 1, 2, 3, 4, 4] false
// sequence: [1, 4, 10, 4, 2] false
// sequence: [10, 1, 2, 3, 4, 5] false
// sequence: [1, 1, 1, 2, 3] false
// sequence: [0, -2, 5, 6] true
// sequence: [1, 2, 3, 4, 5, 3, 5, 6] false
// sequence: [40, 50, 60, 10, 20, 30] false
// sequence: [1, 1] true
// sequence: [1, 2, 5, 3, 5] true
// sequence: [1, 2, 5, 5, 5] true
// sequence: [10, 1, 2, 3, 4, 5, 6, 1] false
// sequence: [1, 2, 3, 4, 3, 6] true
// sequence: [1, 2, 3, 4, 99, 5, 6] true
// sequence: [123, -17, -5, 1, 2, 3, 12, 43, 45] true
// sequence: [3, 5, 67, 98, 3] true

// Solved using another approach written in python
// https://wachino.github.io/codefights/codefights-arcade/codefights-arcade-intro/7_almostIncreasingSequence/README.html
/*
function solution(seq) {
    var bad=0
    for(var i=1;i<seq.length;i++) if(seq[i]<=seq[i-1]) {
        bad++
        if(bad>1) return false
        if(seq[i]<=seq[i-2]&&seq[i+1]<=seq[i-1]) return false
    }
    return true
}*/

// StackOverflow solutions https://stackoverflow.com/questions/43405279/q-solve-almostincreasingsequence-in-java-codefights
