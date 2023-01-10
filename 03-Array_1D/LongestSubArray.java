//Program to find the longest Sub Array that has the sum k.

/*
 * 1) Is to use two pointers(nested loop) & look for possible scenarios.
 * 
 * 2)Using Sliding Window Technique.
 */

 public class LongestSubArray{

    public static int sumArray(int[] arr, int k){

        int maxLength = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k){
                    maxLength = Math.max(maxLength,(j-i+1));
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        
        System.out.println(sumArray(new int[]{7,1,6,0},7));
    }
 }