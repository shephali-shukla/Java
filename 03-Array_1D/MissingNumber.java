//Array consists of elements from 0-N; find the missing element.
/*
 * 1) Approach can be using Hashinf through a substitute array.
 * Time Complexity- O(n) & Space Complexity- O(n)
 * 
 * 2) We can use Mathematical formula sum = n * (n + 1)/2 & add up the elements in array then suntract it from sum.
 */
public class MissingNumber {
    
    public static void main(String[] args) {
        
        int[] arr = {0,1,2,3,4};
        int n = arr.length; //length of array.
        //int mathSum = (n * (n + 1))/2;
        

        int sum = n * (n+1)/ 2;
        for (int i = 0; i < n; i++)
            sum -= arr[i];
        
        
        System.out.println("The missing number is: " + (sum));
    }
}

/*Note: This approach works since the array consists of 0. If the 0 was missing and elements were from 0-N it won't work.*/
