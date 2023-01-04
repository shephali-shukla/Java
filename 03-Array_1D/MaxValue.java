//To find maximum element in the array.
//This is a brute approach with Time Complexity: O(n) & Space Complexity: O(1)
public class MaxValue {
    
    public int maxValue(int[] num){
        //edge case:
        if(num.length == 0 || num == null){
            throw new IllegalArgumentException("Invalid Input");
        }
        int max = num[0];
        for(int i=0;i<num.length;i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        MaxValue mx = new MaxValue();
        System.out.println("The max value is: " + mx.maxValue(new int[]{5,7,9,6,12,11}));
    }
}
