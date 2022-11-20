/** Last night you partied a little too hard. Now there's a black and white photo of you that's about to go
 * viral! You can't let this ruin your reputation, so you want to apply the
 * box blur algorithm (https://en.wikipedia.org/wiki/Box_blur) to the photo to hide its content.

 The pixels in the input image are represented as integers. The algorithm distorts the input image in the following
 way: Every pixel x in the output image has a value equal to the average value of the pixel values from the 3 × 3
 square that has its center at x, including x itself. All the pixels on the border of x are then removed.

 Return the blurred image as an integer, with the fractions rounded down.

 Example

 For

 image = [[1, 1, 1],
 [1, 7, 1],
 [1, 1, 1]]
 the output should be solution(image) = [[1]].

 To get the value of the middle pixel in the input 3 × 3 square: (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) = 15 / 9 = 1.66666 = 1.
 The border pixels are cropped from the final result.

 For

 image = [ [7, 4, 0, 1],
           [5, 6, 2, 2],
           [6, 10, 7, 8],
           [1, 4, 2, 0]]
 the output should be

 solution(image) = [[5, 4],
 [4, 4]]
 There are four 3 × 3 squares in the input image, so there should be four integers in the blurred output. To get the
 first value: (7 + 4 + 0 + 5 + 6 + 2 + 6 + 10 + 7) = 47 / 9 = 5.2222 = 5. The other three integers are obtained the
 same way, then the surrounding integers are cropped from the final result.

 Input/Output

 [execution time limit] 3 seconds (java)

 [input] array.array.integer image

 An image, stored as a rectangular matrix of non-negative integers.

 Guaranteed constraints:
 3 ≤ image.length ≤ 100,
 3 ≤ image[0].length ≤ 100,
 0 ≤ image[i][j] ≤ 255.

 [output] array.array.integer

 A blurred image represented as integers, obtained through the process in the description.
 * */

import java.util.Arrays;

public class BoxBlur_023 {
    public static void main(String[] args) {
        int[][] image = { {1,1,1}, {1,7,1}, {1,1,1} }; // refer to TEST CASES for more input
        System.out.println("output is: " + Arrays.deepToString(solution(image)));
    }

    private static int[][] solution(int[][] image) {
        // 1. iterate tru each square that is not in the border
        // 2. get average of 3x3 area including square that you are on as center
        // 3. return that image
        int rows = image.length;
        int cols = image[0].length;
        int[][] blur = new int[rows-2][cols-2];
        for (int r = 1; r < rows - 1; r++) {
            for (int c = 1; c < cols - 1; c++) {
                blur[r-1][c-1] = getAvg(image, r, c);
            }
        }
        return blur;
    }

    private static int getAvg(int[][] img, int r, int c) {
        //ul(-1,-1), um(-1,0), ur(-1,+1), ml(0,-1), mm(0,0), mr(0,+1), dl(+1,-1), dm(+1,0), dr(+1,+1)
        return (img[r-1][c-1] + img[r-1][c] + img[r-1][c+1] +
                img[r][c-1] + img[r][c] + img[r][c+1] +
                img[r+1][c-1] + img[r+1][c] + img[r+1][c+1]) / 9;
    }
}

// TEST CASES
// int[][] image = { {1,1,1}, {1,7,1}, {1,1,1} };
// int[][] image = { {0,18,9}, {27,9,0}, {81,63,45} };
// int[][] image = { {36,0,18,9}, {27,54,9,0}, {81,63,72,45} };
// int[][] image = { {7,4,0,1}, {5,6,2,2}, {6,10,7,8}, {1,4,2,0} };
/* int[][] image = { {36,0,18,9,9,45,27},
                   {27,0,54,9,0,63,90},
                   {81,63,72,45,18,27,0},
                   {0,0,9,81,27,18,45},
                   {45,45,27,27,90,81,72},
                   {45,18,9,0,9,18,45},
                   {27,81,36,63,63,72,81} };*/
/* int[][] image = { {36,0,18,9,9,45,27},
                   {27,0,254,9,0,63,90},
                   {81,255,72,45,18,27,0},
                   {0,0,9,81,27,18,45},
                   {45,45,227,227,90,81,72},
                   {45,18,9,255,9,18,45},
                   {27,81,36,127,255,72,81} };*/
