import java.util.Arrays;

//Every element needs to be shifted one place left.
/*
 * Two Approaches:
 * 1) Using another temp array & shifting elements to one place left.
 *    Time Complexity: O(n) & Space Complexity: O(n).
 * 
 * 2) Another is using In-place to complete the task without using extra space.
 *    Time Complexity: O(n) & Space Complexity: O(1).
 */
public class LeftRotateArrayByOne {
    
    public static int[] rotateLeftOne(int[] nums){

        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;

        return nums;
    }

    public static void main(String[] args) {
        
        System.out.println(Arrays.toString( rotateLeftOne(new int[]{1,2,3,4,5})));
    }
}
