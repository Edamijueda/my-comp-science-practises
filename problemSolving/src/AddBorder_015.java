/** Given a rectangular matrix of characters, add a border of asterisks(*) to it.

 Example

 For
 picture = ["abc",
 "ded"]
 the output should be

 solution(picture) = ["*****",
 "*abc*",
 "*ded*",
 "*****"]
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.string picture

 A non-empty array of non-empty equal-length strings.

 Guaranteed constraints:
 1 ≤ picture.length ≤ 100,
 1 ≤ picture[i].length ≤ 100.

 [output] array.string

 The same matrix of characters, framed with a border of asterisks of width 1.
 * */

import java.util.Arrays;

public class AddBorder_015 {
    public static void main(String[] args) {
        String[] picture = {"abc", "ded"}; // refer to TEST CASES for more input
        System.out.println("Output is: " + Arrays.toString(solution(picture)));
    }

    private static String[] solution(String[] picture) {
        int picLen = picture.length;
        int strLen = picture[0].length();
        String[] output = new String[picLen+2];
        StringBuilder asterisks = new StringBuilder("*");

        // Add * to asterisks, strLen+2 times
        asterisks.append("*".repeat(Math.max(0, strLen + 1)));

        output[0] = String.valueOf(asterisks);
        output[output.length-1] = String.valueOf(asterisks);

        // Add * to start and end of each element in picture. Add them to
        // output[i] excluding output[0] and output[length-1]
        for (int i = 1; i < output.length-1; i++) {
            output[i] = "*".concat(picture[i-1]).concat("*");
        }
        return output;
    }

    /*private  static String[] solution(String[] picture) {
        String[] framedPicture = new String[picture.length + 2];

        for(int i = 0 ; i < picture.length ; i++) {
            framedPicture[i+1] = '*' + picture[i] + '*';
        }

        framedPicture[0] = framedPicture[picture.length + 1] = framedPicture[1].replaceAll(".","*");

        return framedPicture;
    }*/
}

// TEST CASES
// String[] picture = {"abc", "ded"};
// String[] picture = {"a"};
// String[] picture = {"aa", "**", "zz"};
// String[] picture = {"abcde", "fghij", "klmno", "pqrst", "uvwxy"};
// String[] picture = {"*******", "*wzy***", "*******"};
