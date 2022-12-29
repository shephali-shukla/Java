public class AddingOrUpdating {
    
    //Note: Print Method
    public void print(int[] arr){
       int len = arr.length; //return capacity of the length.
       for(int i=0;i<len;i++){
            System.out.print(arr[i] + " ");
        } 
    }

    public void addOrUpdate(){
        int[] array = new int[5];
        //print(array);
        array[0] = 1;
        array[1] = 5;
        array[2] = 6;
        array[3] = 56;
        array[4] = 12;
        print(array);
        array[2] = 99; //this overwrites the element on index 2.

        //Here: prints capacity of array.
        System.out.println(array.length);
        //prints element on the last index of the array.
        System.out.println(array[array.length - 1]);

        //Here: Hardcoding 
        int[] array2 = {1,5,6,88,12};
        print(array2);
    }

    public static void main(String[] args) {
        
        AddingOrUpdating arrayDemo = new AddingOrUpdating();
        arrayDemo.addOrUpdate();
    }
}
