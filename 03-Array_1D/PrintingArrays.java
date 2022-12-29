import java.util.Arrays;

public class PrintingArrays {
    public static void main(String[] args) {
        
        String[] arr = {"After" , "all" ,"this", "time!?" , "Always"};

        //through for loop:
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //through for-each:
        for(String str:arr){
            System.out.print(str + " ");
        }
        System.out.println();

        //through Arrays.toString() method:
        System.out.println(Arrays.toString(arr));
    }
}
