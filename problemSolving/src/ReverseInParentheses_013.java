/** Write a function that reverses characters in (possibly nested) parentheses in the input string.

 Input strings will always be well-formed with matching ()s.

 Example

 For inputString = "(bar)", the output should be
 solution(inputString) = "rab";
 For inputString = "foo(bar)baz", the output should be
 solution(inputString) = "foorabbaz";
 For inputString = "foo(bar)baz(blim)", the output should be
 solution(inputString) = "foorabbazmilb";
 For inputString = "foo(bar(baz))blim", the output should be
 solution(inputString) = "foobazrabblim".
 Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim".
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of lowercase English letters and the characters ( and ). It is guaranteed that all
 parentheses in inputString form a regular bracket sequence.

 Guaranteed constraints:
 0 ≤ inputString.length ≤ 50.

 [output] string

 Return inputString, with all the characters that were in parentheses reversed.
 * */

import java.util.Stack;

public class ReverseInParentheses_013 {
    public static void main(String[] args) {
        //String inputString = "foo(bar(baz))blim"; // refer to TEST CASES for more input
        //System.out.println("" + solution(inputString));
        //System.out.println("" + reverseInParentheses(inputString));

        String str = "(abc)d(efg)";
        int len = str.length();
        System.out.println("Output is: " + reverseParentheses(str, len));

    }

    //Approach: This problem can be solved using a stack. First, whenever a ‘(‘ is encountered then push the
    // index of the element into the stack, and whenever a ‘)’ is encountered then get the top element of the
    // stack as the latest index and reverse the string between the current index and index from the top of
    // the stack. Follow this for the rest of the string and finally print the updated string.

    // Function to return the modified string
    static String reverseParentheses(String str, int len) { // Solved using a Stack & recursion
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; i++) {

            // Push the index of the current opening bracket
            if (str.charAt(i) == '(') {
                st.push(i);
            }

            // Reverse the substring starting after the last encountered opening bracket till the current character
            else if (str.charAt(i) == ')') {
                char[] A = str.toCharArray();
                reverse(A, st.peek() + 1, i);
                str = String.copyValueOf(A);
                st.pop();
            }
        }

        // To store the modified string
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ')' && str.charAt(i) != '(') {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

    static void reverse(char[] A, int l, int h) {
        if (l < h) {
            // Swap algorithm is used here
            char temp = A[l];
            A[l] = A[h];
            A[h] = temp;
            reverse(A, l + 1, h - 1);
        }
    }

   /* private static  String reverseInParentheses(String s) { // Solved using recursion

        if (s.contains("(")) {
            int start = s.lastIndexOf("(");
            int end = s.indexOf(")", start);
            String revStr = new StringBuilder(s.substring(start+1, end)).reverse().toString();
            String firstPart = s.substring(0, start);
            String lastPart = s.substring(end+1);
            return reverseInParentheses(firstPart + revStr + lastPart);
        }
        return s;
    }*/

    /*private static String solution(String input) { // Solved using iterative(while loop) method
        // 1. Find d last parens "(" call it firstIndex;
        // 2. Find d parens closing "(" call it lastIndex;
        // 3. Reverse d index btw firstIndex and lastIndex
        // 4. Recreate inputString with
            // firstPart - word from begin -> firstIndex
            // revString from step 1 to 3
            // lastPart - word from lastIndex -> end
        // 5. Repeat step 1 to 5 until there are no parens left

        int firstIndex = input.lastIndexOf("(");
        int lastIndex = input.indexOf(")", firstIndex);
        while (firstIndex != -1 && lastIndex != -1) {
            String revStr = new StringBuilder(input.substring(firstIndex+1, lastIndex)).reverse().toString();
            String firstPart = input.substring(0, firstIndex);
            String lastPart = input.substring(lastIndex+1);
            input = firstPart + revStr + lastPart;
            firstIndex = input.lastIndexOf("(");
            lastIndex = input.indexOf(")", firstIndex);
        }
        return input;
    }*/
}

// TEST CASES
// String input = "(bar)";
// String input = "foo(bar)baz";
// String input = "foo(bar)baz(blim)";
// String input = "foo(bar(baz))blim";
// String input = "";
// String input = "()";
// String input = "(abc)d(efg)";
// String input = "(skeeg(for)skeeg)";
