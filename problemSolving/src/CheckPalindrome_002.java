/**Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
solution(inputString) = true;
For inputString = "abac", the output should be
solution(inputString) = false;
For inputString = "a", the output should be
solution(inputString) = true.
Input/Output

 A string that doesn't changed when reversed (it reads the same backward and forward).

 Examples:

 "eye" is a palindrome
 "noon" is a palindrome
 "decaf faced" is a palindrome
 "taco cat" is not a palindrome (backwards it spells "tac ocat")
 "racecars" is not a palindrome (backwards it spells "sracecar")


[execution time limit] 3 seconds (java)

[input] string inputString

A non-empty string consisting of lowercase characters.

Guaranteed constraints:
1 ≤ inputString.length ≤ 105.

[output] boolean

true if inputString is a palindrome, false otherwise.*/

public class CheckPalindrome_002 {
    public static void main(String[] args) {
        String input = "papa";
        System.out.println("isPalindrome: " + solution(input));
    }
    static boolean solution(String inputString) {
        StringBuilder reversed = new StringBuilder();
        char inputChar;
        int length = inputString.length();
        for(int i = length-1; i >= 0; i--){
            inputChar = inputString.charAt(i);
            reversed.append(inputChar);
        }

        boolean isPalindrome = inputString.equals(reversed.toString());

        return isPalindrome;
    }
}

