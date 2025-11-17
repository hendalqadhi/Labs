package arrays;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
         int numbers[]={1,2,3,4,5};
         int nums[]= new int[4];
//methods for display
         //Traditional loop
       for (int i=0;i<numbers.length;i++)
            System.out.println("Index"+"["+i+"]"+numbers[i]);
//for each
        for(int num :numbers)
            System.out.println(num);
        //to string
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(nums));



    }
}
