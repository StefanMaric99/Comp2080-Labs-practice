package com.company;
import java.util.*;
public class MyList {
    // Stefan Maric 101208175


    //part 1
    public int numItems(int x, int numItems) {
       int x = arr[].length;
       return numItems;

       public int maxItems(int Q,) {
           int Q = arr[Q];
           Q = 0;
           return maxItems;
        }
    }

    public int myList(int myList, int x) {
        int arr[] = new arr[x];
        return arr[x];
    }

    public boolean addInOrder(boolean l, int h) {

        boolean addInOrder;
        for (int i = 0; i<h;i++) {
         addInOrder(h);

            return addInOrder;
        }
        //Part 2

        void sort(int arr[])
        {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key;
            }
        }


        static void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");

            System.out.println();
        }


        int binSearch(int arr[], int l, int r, int x)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == x)
                    return mid;
                if (arr[mid] > x)
                    return binSearch(arr, l, mid - 1, x);
                return binSearch(arr, mid + 1, r, x);
            }
            return -1;
        }

        //Part 3, gcd

        private static int calcGCD(int num1, int num2) {

            if(num2 == 0){
                return num1;
            }
            return calcGCD(num2, num1%num2);
        }


    }

}
