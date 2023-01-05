//Remove duplicates & return the number of unique elements
//Time Complexity = O(n) & Space Complexity = O(1)
public class removeDuplicates {
    
    public static int removeElements(int arr[]){

        int i = 0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        
        System.out.println( removeElements(new int[]{1,1,2,2,3,3}));
       
    }
}
