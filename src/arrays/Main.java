package arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // System.out.println("test");
         //array with values
      //  int numbers[]={1,2,3,4,5};

        //rray with default values (0)
        int nums[]= new int[5];

//obj for using the methods
         Arrayss array=new Arrayss();
         array.input(nums);
         array.update(nums,0,0);
         array.delete(nums,2);
         array.Travesal1(nums);

        //to string
        //System.out.println(Arrays.toString(numbers));
       // System.out.println(Arrays.toString(nums));



    }
}
