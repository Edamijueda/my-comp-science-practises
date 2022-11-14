/** Given a string, find out if its characters can be rearranged to form a palindrome.

 Example

 For inputString = "aabb", the output should be
 solution(inputString) = true.

 We can rearrange "aabb" to make "abba", which is a palindrome.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of lowercase English letters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 50.

 [output] boolean

 true if the characters of the inputString can be rearranged to form a palindrome, false otherwise.
 * */

import java.util.HashMap;
import java.util.Map;

public class PalinRearrange_018 {
    public static void main(String[] args) {
        String input = "abbcabb"; // refer to TEST CASES for more input
        System.out.println("Can be rearranged to form a palindrome? " +solution(input));
    }

    private static boolean solution(String input) { // Using Map(HashMap)
        // Even no of characters except one
        // 1. Iterate tru each chars in the input string
            // a. Add it value to a hashMap
        // 2. Iterate tru each key at HashMap
            // a. if we see more than one instance of an odd no, return false

        // char         count
        Map<Character, Integer> counter = new HashMap< >();
        for (char c :
                input.toCharArray()) {
           if (counter.containsKey(c)) counter.put(c, counter.get(c)+1);
           else counter.put(c, 1);
        }
        int odd = 0;
        for (Character c :
                counter.keySet()) {
            if (counter.get(c) % 2 == 1) {
                odd++;
                if (odd == 2) return false;
            }
        }
        return true;
    }

    /*private static boolean solution(String input) { // using LeftShift << operator, bitwise AND '&', NOR ^ Operator
        int map = 0;
        for(int i=0; i<input.length(); i++) {
            map ^= 1 << (input.charAt(i) - 'a');
        }
        return map == 0 || (map & -map) == map;
    }*/
}

// TEST CASES
// String input = "aabb";
// String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc";
// String input = "abbcabb";
// String input = "zyyzzzzz";
// String input = "z";
// String input = "zaa";
// String input = "abca";
// String input = "abcad";
// String input = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";
// String input = "abdhuierf";
