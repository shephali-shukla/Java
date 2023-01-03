/*Code to find if the given String is palindrome or not.
 * We are using two pointer technique to solve this problem.
 */
public class PalindromeString {
    
    public static boolean isPalindrome(String word){
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = word.length()-1;
        while(start < end){
            if(charArray[start] != charArray[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        
        if(isPalindrome("madam")){
            System.out.println("The string is palindrome.");
        }else{
            System.out.println("The string is not palindrome.");
        }
    }
}
