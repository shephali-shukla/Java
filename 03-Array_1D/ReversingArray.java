/*Note: In order to solve this question:
 * 1st approach: Simply printing the array from last index to first.
 * 2nd approach: Initializing a new array with same capacity as the given array and storing the value in reverse order.
 * 3rd approach: Using two pointer technique and no extra space.
 * 
 */
/*Note: We are using two pointer technique to solve this problem. 
 * Time Complexity: O(n) ; where n is number of elements in the array.
 * Space Complexity: O(1) ; since we are using no extra space.
 * Also, this algorithm will work fine for odd number of elements as the middle elements retains its place after the reversal.
 */
import java.util.Arrays;
public class ReversingArray {
    
    public static int[] reverseArray(int[] number, int start, int end){

        while(start < end){
            int temp = number[start];
            number[start] = number[end];
            number[end] = temp;

            start++;
            end--;
        }
        return number;
    }

    public static void main(String[] args) {
        
        int[] number = {1,3,4,5,8,11,16,22};
        System.out.println("Original Array: " + Arrays.toString(number));

        //reversed Array
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(number, 0, number.length-1)));
    }
}


