/** Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.
 * EXAMPLE:
 * For inputArray = [3, 6, -2, -5, 7, 3], the output should be solution(inputArray) = 21.
 * 7 and 3 produce the largest product.
 *
 * INPUT/OUTPUT:
 * [execution time limit] 3 seconds (java)
 * [input] array.integer inputArray
 * An array of integers containing at least two elements.
 *
 * Guaranteed constraints:
 * 2 ≤ inputArray.length ≤ 10,
 * -1000 ≤ inputArray[i] ≤ 1000.
 *
 * [output] integer
 * The largest product of adjacent elements.
 * **/
public class AdjacentElementProduct {

    public static void main(String[] args) {
        // Commented inputArray can be used as test cases
        //inputArray: [3, 6, -2, -5, 7, 3]
        //inputArray: [5, 1, 2, 3, 1, 4]
        //inputArray: [-1, -2]
        //inputArray: [1, 2, 3, 0]
        //inputArray: [9, 5, 10, 2, 24, -1, -48]
        //inputArray: [5, 6, -4, 2, 3, 2, -23]
        //inputArray: [4, 1, 2, 3, 1, 5]
        //inputArray: [-23, 4, -3, 8, -12]
        //inputArray: [1, 0, 1, 0, 1000]
        int[] inputArray = {3, 6, -2, -5, 7, 3};
        System.out.println("largest product is: " + solution(inputArray));
    }
    static int solution(int[] inputArray) {
        int largestProduct = -1000;
        for(int i = 1; i < inputArray.length; i++){
            int product = inputArray[i-1] * inputArray[i];
            if(product > largestProduct) {
                largestProduct = product;
            }
        }
        return largestProduct;
    }
}
