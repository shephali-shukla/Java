//Program to find second max value in an array.
//Note: Time Complexity- O(n){Single pass solution} & Space Complexity- O(1)

/*Another Approach can be to sort the Array & return the value at 1st index */

public class SecondMaxValue {
    
    public int secondMaxValue(int[] arr){

        if(arr.length < 2) return -1;
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,22,29,1,42};
        SecondMaxValue sm = new SecondMaxValue();
        System.out.println(sm.secondMaxValue(arr));
    }
}
