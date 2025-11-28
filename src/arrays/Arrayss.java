package arrays;

import java.util.Scanner;

public class Arrayss {
//Scaner method
    Scanner inputt=new Scanner(System.in);


    //display with traditional for
    public void Travesal1 (int []a){
        for (int i=0;i<a.length;i++)
            System.out.println("Index = "+"["+i+"]"+a[i]);
    }


    //display with for each
    public void Travesal2 (int []a) {
        for(int e :a )
        System.out.println(e);

        // scannering values from the user
    }
        public void input (int []a){
            System.out.println("Enter "+a.length+" numbers");
            for (int i=0 ;i<a.length;i++)
                a[i]= inputt.nextInt();
        }
        public void update(int []a, int index, int newValue){
        if (index==0 || index>= a.length)
            System.out.println("The index is unvalid ");
        else
        a[index] = newValue;

        }
    public void delete(int []a, int index){
        if (index==0 || index>= a.length)
            System.out.println("The index is unvalid ");
        else
            a[index] = 0;

    }

    }


