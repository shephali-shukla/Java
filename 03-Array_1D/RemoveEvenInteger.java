import java.util.Arrays;

public class RemoveEvenInteger {
    
    public static int[] removeEven(int[] arr){

        int countOdd = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                countOdd++;
            }
        }
        int[] odd = new int[countOdd];

        int idx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                odd[idx] = arr[i];
                idx++;
            }
        }
        return odd;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,3,4,5,8,12,15,20,28};
        System.out.println(Arrays.toString(arr));

        //Array with odd elements.
        System.out.println(Arrays.toString(removeEven(arr)));
    }
}
