import java.util.Arrays;

//Note: We are NOT using ArrayList for this program.
public class ResizingArray {
    
    public void display(int[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public int[] resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        // arr = temp; since the data is copied to temp; we can simply return temp.
        // return arr;
        return temp;
    }

    public static void main(String[] args) {
        
        ResizingArray ra = new ResizingArray();
        //ra.display(new int[] {1,5,9,7,2});
        int[] original = new int[] {1,5,9,7,2};
        System.out.println("The size of original array: " + original.length);
        
        original = ra.resize(original, 10);
        System.out.println("The size of original array: " + original.length);
    }
}

/*Important:
 * public void resize(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    For above code line 27 would print 5, beacuse the method is void & when the call 
    reaches to line 27; Garbage collector has already removed the data & we get
    answer original length as the answer. Thus, we need to return it back.
 */
