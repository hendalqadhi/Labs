package arrays;

import java.util.Scanner;

public class Arrayss {
    //Scaner method
    Scanner inputt = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Scanner newAssign = new Scanner(System.in);


    //display with traditional for
    public void Travesal1(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("Index  " + "[" + i + "] =" + a[i]);
    }

    public void Travesal_r(int[] a) {
        for (int i = a.length - 1; i >= 0; i--)
            System.out.println("Index  " + "[" + i + "] =" + a[i]);
    }


    //display with for each
    public void Travesal2(int[] a) {
        for (int e : a)
            System.out.println(e);

        // scannering values from the user
    }

    public void input(int[] a) {
        System.out.println("Enter " + a.length + " numbers");
        for (int i = 0; i < a.length; i++)
            a[i] = inputt.nextInt();
    }

    //updating
    public void update(int[] a, int index, int newValue) {
        //System.out.println("Enter the index of the value you want to change");
        //in.nextInt();
        if (index == 0 || index >= a.length)
            System.out.println("The index is unvalid ");
        else
            a[index] = newValue;

    }

    public void delete(int[] a, int index) {
        if (index == 0 || index >= a.length)
            System.out.println("The index is unvalid ");
        else
            a[index] = 0;

    }

    public void updating_user(int[] a) {
        System.out.println("Enter the index of the value you want to update");
        int index = in.nextInt();
        System.out.println("Enter the new value ");
        int newValue = newAssign.nextInt();
        if (index == 0 || index >= a.length)
            System.out.println("The index is unvalid ");
        else
            a[index] = newValue;


    }

    public void shift_left_delete(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++)
            a[i] = a[i + 1];


        a[a.length - 1] = Integer.MIN_VALUE;
    }

    public int linear_serch(int[] a, int value) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == value)
                return i;
        //-1 means not found
        return -1;
    }

    public void shiftRightInsert(int[] a, int index, int value) {
        if (index < 0 || index == a.length)
            System.out.println("Enter correctly");
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }


        a[index] = value;

    }

    public int binarySearch(int[] a, int svalue, int findex, int lindex) {
        while (findex <= lindex) {
int mid =(findex+lindex)/2;
if (svalue==a[mid])
    return mid;
if(svalue>a[mid])
    findex=mid+1;
if (svalue<a[mid])
    lindex=mid-1;

        }
return -1;
    }
    public int binarySearch(int[] a, int svalue) {
        int findex=0;
        int lindex =a.length-1;
        while (findex <= lindex) {
            int mid =(findex+lindex)/2;
            if (svalue==a[mid])
                return mid;
            if(svalue>a[mid])
                findex=mid+1;
            if (svalue<a[mid])
                lindex=mid-1;

        }
        return -1;
    }
}


