/** Call two arms equally strong if the heaviest weights they each are able to lift are equal.

 Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right
 and the left), and so are their weakest arms.

 Given your and your friend's arms' lifting capabilities find out if you two are equally strong.

 Example

 For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10, the output should be
 solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
 For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output should be
 solution(yourLeft, yourRight, friendsLeft, friendsRight) = true;
 For yourLeft = 15, yourRight = 10, friendsLeft = 15, and friendsRight = 9, the output should be
 solution(yourLeft, yourRight, friendsLeft, friendsRight) = false.
 Input/Output

 [execution time limit] 3 seconds (java)

 [input] integer yourLeft

 A non-negative integer representing the heaviest weight you can lift with your left arm.

 Guaranteed constraints:
 0 ≤ yourLeft ≤ 20.

 [input] integer yourRight

 A non-negative integer representing the heaviest weight you can lift with your right arm.

 Guaranteed constraints:
 0 ≤ yourRight ≤ 20.

 [input] integer friendsLeft

 A non-negative integer representing the heaviest weight your friend can lift with his or her left arm.

 Guaranteed constraints:
 0 ≤ friendsLeft ≤ 20.

 [input] integer friendsRight

 A non-negative integer representing the heaviest weight your friend can lift with his or her right arm.

 Guaranteed constraints:
 0 ≤ friendsRight ≤ 20.

 [output] boolean

 true if you and your friend are equally strong, false otherwise.
 * */

import java.util.HashSet;
import java.util.Set;

public class AreEquallyStrong_019 {
    public static void main(String[] args) {
        int yourLeft = 10, yourRight =15, friendsLeft = 15, friendRight = 10; // refer to TEST CASES for more input
        System.out.println("Are equally Strong is: " +areEquallyStrong(yourLeft, yourRight, friendsLeft, friendRight));
    }
    private static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int yourSum = yourLeft + yourRight;
        int friendsSum = friendsLeft + friendsRight;

        Set<Integer> set = new HashSet<>();
        set.add(yourLeft);
        set.add(yourRight);
        set.add(friendsLeft);
        set.add(friendsRight);

        return ((set.size() == 2) || (set.size() == 1)) && yourSum == friendsSum;
    }
}

// TEST CASES
// int yourLeft = 10, yourRight = 15, friendsLeft = 15, friendRight = 10;
// int yourLeft = 15, yourRight = 10, friendsLeft = 15, friendRight = 10;
// int yourLeft = 15, yourRight = 10, friendsLeft = 15, friendRight = 9;
// int yourLeft = 10, yourRight = 5, friendsLeft = 5, friendRight = 10;
// int yourLeft = 10, yourRight = 15, friendsLeft = 5, friendRight = 20;
// int yourLeft = 10, yourRight = 20, friendsLeft = 10, friendRight = 20;
// int yourLeft = 5, yourRight = 20, friendsLeft = 20, friendRight = 5;
// int yourLeft = 20, yourRight = 15, friendsLeft = 5, friendRight = 20;
// int yourLeft = 5, yourRight = 10, friendsLeft = 5, friendRight = 10;
// int yourLeft = 1, yourRight = 10, friendsLeft = 10, friendRight = 0;
// int yourLeft = 5, yourRight =  5, friendsLeft = 10, friendRight = 10;
// int yourLeft = 10, yourRight = 5, friendsLeft = 10, friendRight = 6;
// int yourLeft = 1, yourRight = 1, friendsLeft = 1, friendRight = 1;
// int yourLeft = 0, yourRight = 10, friendsLeft = 10, friendRight = 0;
