import java.util.Arrays;

//We need to move all the zeroes to the end of the array & non-zero number int the beginning while 
//maintaing the relative order of non-zero elements.
/**Three Approaches: 1)Time Complexity: O(n^2) && Space Complexity: O(1). 
 *        2)Using extra array: Time Complexity: O(n) && Space Complexity: O(n). 
 *        3)Two Pointer: Time Complexity: O(n) && Space Complexity: O(1). 
 */       

public class MoveAllZeroesToEnd{

    public static void movingZerosToEnd(int[] arr){

        int[] temp = new int[arr.length];
        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        
        movingZerosToEnd(new int[]{0,5,1,0,0,4,2});
    }
}