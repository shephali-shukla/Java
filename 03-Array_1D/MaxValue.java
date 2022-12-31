//Program to find minimum value in the array.
/*Note: Time Complexity- O(n) & Space Complexity- O(1) */
public class MaxValue {
    
    public int minElement(int[] arr){

        //edge case
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int arr[] = {5,8,44,1,6};
        MaxValue mx = new MaxValue();
        System.out.println("Minimum value in array: " + mx.minElement(arr));
        //System.out.println(mx.minElement(new int[0]));
    }
}
