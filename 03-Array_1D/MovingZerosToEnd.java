import java.util.Arrays;

public class MovingZerosToEnd {
    
    public void moveZero(int[] arr, int n){

        int j = 0; //pointer for 0
        for(int i=0;i<n;i++){ //pointer for non-zero elements
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
    }

    public void demoArray(){
        int[] arr = {6,0,9,7,5,0,8,0};
        moveZero(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        MovingZerosToEnd mz = new MovingZerosToEnd();
        mz.demoArray();
    }
}
