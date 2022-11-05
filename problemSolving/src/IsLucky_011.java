/** Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the
 * sum of the first half of the digits is equal to the sum of the second half.

 Given a ticket number n, determine if it's lucky or not.

 Example

 For n = 1230, the output should be
 solution(n) = true;
 For n = 239017, the output should be
 solution(n) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer n

 A ticket number represented as a positive integer with an even number of digits.

 Guaranteed constraints:
 10 ≤ n < 106.

 [output] boolean

 true if n is a lucky ticket number, false otherwise.
 * */

// Solved the problem using 4 approaches
public class IsLucky_011 {
    public static void main(String[] args) {
        int n = 123321;  // refer to TEST CASES for more input
        System.out.println("isLucky equals: " +solution(n));
    }

    private static boolean solution(int n) { // using 3rd approach
        int digitsLength = digitsLength(n);
        int firstHalf = 0;
        int secondHalf = 0;
        int count = 0;

        while (n > 0) {
            count++;
            // Finding the remainder (Last Digit)
            int remainder = n % 10;
            // Removing the last digit/current last digit
            n = n / 10;
            if ( count <= (digitsLength/2) ) secondHalf += remainder;
            else firstHalf += remainder;
        }

        return firstHalf == secondHalf;
    }

    private static int digitsLength(int number) {  // get length without calling API. Used in 3rd approach
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        return length;
    }
}

// TEST CASES
// int n = 1230;
// int n = 239017;
// int n = 134008;
// int n = 10;
// int n = 11;
// int n = 1010;
// int n = 261534;
// int n = 100000;
// int n = 999999;
// int n = 123321;

// using 1st approach
/*boolean solution(int n) {
    String toRefTypeString = Integer.toString(n);
        int digitsLength = toRefTypeString.length();
        // int digitsLength = String.valueOf(n).length(); // can also length using this
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < digitsLength; i++) {
            if (i < (digitsLength/2)) firstHalf += toRefTypeString.charAt(i);
            else secondHalf += toRefTypeString.charAt(i);
        }

        return firstHalf == secondHalf;
}*/

// using 2nd approach
/*private static boolean solution(int n) {

    // String toRefTypeString = Integer.toString(n);

    // Add first half, subtract second half.
    int sum = 0;
    int mid = toRefTypeString.length()/2;

    for (int i=0; i<mid; i++) {
        sum += toRefTypeString.charAt(i);
        sum -= toRefTypeString.charAt(i+mid);
     }

    // If zero, halves match
    return (sum == 0);
}*/

// using 4th approach
/*boolean solution(int n) {
    String s = n+"";
    int sum = 0;

    for(int i=0; i<s.length()/2; i++)
        sum+=( s.charAt(i) - s.charAt(s.length()-1-i) );

    return sum == 0;
}*/

