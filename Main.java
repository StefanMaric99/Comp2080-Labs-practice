package com.company;
import java.util.*;

// Stefan Maric 101208175

public class Main {



    public static void main(String[] args) {

                Scanner ipt = new Scanner(System.in);

                //Part 1 and 2
                int x;
                BinSearch ob = new BinSearch();
                int arr[] = {x};
                int n = arr.length;
                int x = 10;
                int result = ob.binSearch(arr, 0, n - 1, x);
                if(arr[x] <= 10) {
                    System.out.println("Please enter a int");
                    arr[x] = ipt.nextInt();
                } else System.out.println("Please enter another num");
                    arr[x] = ipt.nextInt();


                if (result == -1)
                    System.out.println("Value not present");
                else
                    System.out.println("Value found at index " + result);



                //Part 3
                System.out.println("Please enter int to find GCD");
                int number1 = ipt.nextInt();
                System.out.println("Please enter another int to find GCD");
                int number2 = ipt.nextInt();
                System.out.println("GCD of the inputed numbers are  " + number1 +" and "
                        + number2 +" is:  " + findGCD(number1,number2));
        }
}
