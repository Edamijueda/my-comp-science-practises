/** Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

 A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by
 taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You
 can see the 1-, 2-, 3- and 4-interesting polygons in the picture at --> resources/shapeArea image.png

 EXAMPLE:
 For n = 2, the output should be
 solution(n) = 5;
 For n = 3, the output should be
 solution(n) = 13.

 INPUT/OUTPUT:
 [execution time limit] 3 seconds (java)
 [input] integer n
 Guaranteed constraints:
 1 ≤ n < 10 raised to power 4.
 [output] integer
 The area of the n-interesting polygon.
 * */

public class ShapeArea_005 {
    public static void main(String[] args) {
        int n = 100;
        System.out.println("The area of the " +n +"-interesting polygon is " + solution(n));
    }
    static int solution(int n) {
        int area = 1;
        int diff = 0;
        for(int i = 1; i < n; i++){
            diff += 4;
            area += diff;
        }
        return area;
    }
}
// OTHER APPROACH TO SOLVE THE PROBLEM
// 1. Mathematically using a formula
            /* static int solution(int n) {
                    return (n*n) + ( (n-1)*(n-1) );
                }*/
// 2. Using recursion
            /* static int solution(int n) {
                    if(n == 1) return 1;
                    return 4*(n-1) + solution(n-1);
                }*/
// 3. Mathematically using a formula
            /* static int solution(int n) {
                    return 1 + 2 * n * (n-1);
                }*/
// 4. Using Java api - Math.pow(a,b)
            /* static int solution(int n) {
                    return (int) (Math.pow(n, 2) + Math.pow(n-1, 2));
                }*/