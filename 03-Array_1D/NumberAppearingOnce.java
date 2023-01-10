public class NumberAppearingOnce {
    
    public static int singleNumber(int[] nums) {
        
       int number = 0;
       for(int i=0;i<nums.length;i++){
        number ^= nums[i];
       }
       return number;
    }

    public static void main(String[] args) {
        
        System.out.println(singleNumber(new int[]{2,1,2}));
    }
}
