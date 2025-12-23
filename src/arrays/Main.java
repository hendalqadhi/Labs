package arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println("test");
         //array with values
       int numbers[]={1,2,3,4,5};

        //array with default values (0)
        int nums[]= new int[5];
        //array of assignment

//obj for using the methods
         Arrayss array=new Arrayss();
        // array.input(nums);
         //array.update(nums,0,0);
         //array.delete(nums,2);
        // array.Travesal1(nums);
         //array.updating_user(nums);
        //array.Travesal1(nums);
       // array.shift_left_delete(numbers,3);
        //array.Travesal_r(numbers);

        //int result= array.linear_serch(numbers,2);
        int result=array.binarySearch(numbers,4,0,3);
        if (result!=-1)
           System.out.println("value found at index :"+result);
        else
             System.out.println(" value not found");
        int number[]={2,3,4,5,6};

        array.shiftRightInsert(number,0,1);
        array.Travesal1(number);


        //to string
        //System.out.println(Arrays.toString(numbers));
       // System.out.println(Arrays.toString(nums));



    }
}
