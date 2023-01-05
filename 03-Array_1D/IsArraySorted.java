public class IsArraySorted {
    
    public static boolean isSorted(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(isSorted(new int[]{1,2,3,4,5}));
        System.out.println(isSorted(new int[]{5,4,3,2,1}));
        System.out.println(isSorted(new int[]{8,6,1,4,2,0}));
    }
}
