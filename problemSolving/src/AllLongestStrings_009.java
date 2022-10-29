/** Given an array of strings, return another array containing all of its longest strings.

 Example

 For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
 solution(inputArray) = ["aba", "vcd", "aba"].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string inputArray

 A non-empty array.

 Guaranteed constraints:
 1 ≤ inputArray.length ≤ 10,
 1 ≤ inputArray[i].length ≤ 10.

 [output] array.string

 Array of the longest strings, stored in the same order as in the inputArray.
 * */

import java.util.ArrayList;
import java.util.Arrays;


public class AllLongestStrings_009 {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"}; //refer to TEST CASES for more input
        System.out.println("Array of longest the String is " + Arrays.toString(solution(inputArray)));
    }
    static String[] solution(String[] inputArray) {
        int longestString = inputArray[0].length();
        ArrayList<String> lsArrayList = new ArrayList<>();
        for (String s : inputArray) {
            if (s.length() == longestString) {
                lsArrayList.add(s);
            }
            if (s.length() > longestString) {
                longestString = s.length();
                lsArrayList.clear();
                lsArrayList.add(s);
            }
        }
        return Arrays.copyOf(lsArrayList.toArray(), lsArrayList.size(), String[].class);
    }
}

// TEST CASE
// String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};
// String[] inputArray = {"aa"};
// String[] inputArray = {"abc", "eeee", "abcd", "dcd"};
// String[] inputArray = {"a", "abc", "cbd", "zzzzzz","a", "abcdef", "asasa", "aaaaaa"};
// String[] inputArray = {"enyky", "benyky", "yely", "varennyky"};
// String[] inputArray = {"abacaba", "abacab", "abac", "xxxxxx"};
// String[] inputArray = {""young", "yooooooung", "hot", "or", "not", "come", "on", "fire", "water", "watermelon""};
// String[] inputArray = {"onsfnib", "aokbcwthc", "jrfcw"};
// String[] inputArray = {"lbgwyqkry"};
// String[] inputArray = {"i"};


    // This can replace the enhanced_for_loop used in the code.
// for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i].length() == longestString) {
//                //lsCount++;
//                lsArrayList.add(inputArray[i]);
//            }
//            if (inputArray[i].length() > longestString) {
//                longestString = inputArray[i].length();
//                //lsCount = 1;
//                lsArrayList.clear();
//                lsArrayList.add(inputArray[i]);
//            }
//        }
