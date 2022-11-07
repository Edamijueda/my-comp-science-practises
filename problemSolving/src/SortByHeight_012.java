/** Some people are standing in a row in a park. There are trees between them which cannot be moved.
 * Your task is to rearrange the people by their heights in a non-descending order without moving the
 * trees.People can be very tall!

 Example

 For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
 solution(a) = [-1, 150, 160, 170, -1, -1, 180, 190].

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.integer a

 If a[i] = -1, then the ith position is occupied by a tree. Otherwise a[i] is the height of a person standing in
 the ith position.

 Guaranteed constraints:
 1 ≤ a.length ≤ 1000,
 -1 ≤ a[i] ≤ 1000.

 [output] array.integer

 Sorted array a with all the trees untouched.
 * */

import java.util.Arrays;

public class SortByHeight_012 {
    public static void main(String[] args) {
        int[] a = { -1, 150, 190, 170, -1, -1, 160, 180 }; // refer to TEST CASES for more input
        System.out.println("Sorted array a with all the trees untouched: " + Arrays.toString(solution(a)));
    }
    private static  int[] solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(a[i] == -1) System.out.print("");

            else {
                for (int j = i+1; j < a.length; j++) {
                    if ( (a[i] > a[j]) && (a[j] != -1) ){
                        // here swapping algorithm is used
                        int temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    } else System.out.print("");

                }
            }
        }
        return a;
    }
}

// TEST CASES
// int[] a = { -1, 150, 190, 170, -1, -1, 160, 180 };
// int[] a = { -1, -1, -1, -1, -1 };
// int[] a = { -1 };
// int[] a = { 4, 2, 9, 11, 2, 16 };
// int[] a = { 2, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1 };
// int[] a = { 23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3 };

// Approach 2
/*private static int[] solution(int[] a) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : a) {
            if (i != -1) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
        }
        return a;
    }*/

// approach 3
/* private static int[] solution(int[] a) {
    int temp;
        for(int i=0; i<a.length; i++)
            for(int j=i+1; j<a.length; j++)
                if( a[i]>a[j] && a[i]!=-1 && a[j]!=-1 ) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
        return a;
}*/
