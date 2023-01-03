/*Array  is provided that has n-1 distinct numbers in the range of 1 to n.
 * We need to find the missing number.
 * Note: We are using a mathematical formula to solve this number:
 * Sum of first natural numbers = 1+2+3+4+5+...+n = n * (n + 1)/2
 * 
 * Time Complexity: O(n) & Space Complexity: O(1)
*/

public class FindMissingNumber {
    
    public static int findMissingNumber(int[] arr){
        int sum = 0; int n = arr.length + 1;
        for(int i : arr){
            sum = sum + i; //sum = sum - i;
        }
        return (n*(n+1)/2) - sum;
    }

    public static void main(String[] args) {
        
        //FindMissingNumber fnum = new FindMissingNumber();
        System.out.println(findMissingNumber(new int[]{1,2,3,4,5,6,7,8,10}));
    }
}
