/** An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a
 * computer network that uses the Internet Protocol for communication. There are two versions of the Internet
 * protocol, and thus two versions of addresses. One of them is the IPv4 address.

 Given a string, find out if it satisfies the IPv4 address naming rules.

 Example

 For inputString = "172.16.254.1", the output should be
 solution(inputString) = true;

 For inputString = "172.316.254.1", the output should be
 solution(inputString) = false.

 316 is not in range [0, 255].

 For inputString = ".254.255.0", the output should be
 solution(inputString) = false.

 There is no first number.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] string inputString

 A string consisting of digits, full stops and lowercase English letters.

 Guaranteed constraints:
 1 ≤ inputString.length ≤ 30.

 [output] boolean

 true if inputString satisfies the IPv4 address naming rules, false otherwise.
 * */

public class IsIPv4Address_021 {
    public static void main(String[] args) {
        String input = "64.233.161.00"; // refer to TEST CASES for more input
        System.out.println("" +isIPv4Address(input));
    }

    /*private static boolean isIPv4Address(String inputString) {
        String[] bytes = inputString.split("\\.");
        if (bytes.length != 4) return false;

        try {
            for (String str : bytes) {
                boolean containLeadingZero = str.length() >= 2 && str.charAt(0) == '0';
                if (Integer.parseInt(str) < 0 || Integer.parseInt(str) > 255 ||
                        containLeadingZero || str.isEmpty()) return false;
            }
        } catch (NumberFormatException e) {return false;}
        return true;
    }*/

    //alternative using regex
    private static boolean isIPv4Address(String inputString) {

        return inputString.matches("([0-9]\\.|[1-9][0-9]\\.|[1][0-9][0-9]\\.|[2][0-4][0-9]\\.|25[0-5]\\.){3}(25[0-5]|[2][0-4][0-9]|[1][0-9][0-9]|[1-9][0-9]|[0-9])");

        // Test 10, 11, 12 does not work using the below method
        //return inputString.matches("(([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9][0-9]?|2[0-4][0-9]|25[0-5])");
    }
}

// TEST CASES
// String input = "172.16.254.1";
// String input = "172.316.254.1";
// String input = ".254.255.0";
// String input = "1.1.1.1a";
// String input = "1";
// String input = "0.254.255.0"
// String input = "1.23.256.255."
// String input = "1.23.256..";
// String input = "0..1.0";
// String input = "64.233.161.00";
// String input = "64.00.161.131";
// String input = "01.233.161.131";
// String input = "35..36.9.9.0";
// String input = "1.1.1.1.1";
// String input = "1.256.1.1";
// String input = "a0.1.1.1";
// String input = "0.1.1.256";
// String input = "129380129831213981.255.255.255";
// String input = "255.255.255.255abcdekjhf";
// String input = "7283728";
// String input = "0..1.0.0";


/* IPv4 address
 An identification number for devices connected to the internet. An IPv4 addresses written in dotted quad notation
 consists of four 8-bit integers separated by periods.

 In other words, it's a string of four numbers each between 0 and 255 inclusive, with a "." character in between e
 ach number. All numbers should be present without leading zeros.

 Examples:

 192.168.0.1 is a valid IPv4 address
 255.255.255.255 is a valid IPv4 address
 280.100.92.101 is not a valid IPv4 address because 280 is too large to be an 8-bit integer (the largest 8-bit
 integer is 255)
 255.100.81.160.172 is not a valid IPv4 address because it contains 5 integers instead of 4
 1..0.1 is not a valid IPv4 address because it's not properly formatted
 17.233.00.131 and 17.233.01.131 are not valid IPv4 addresses because they contain leading zeros
  */
