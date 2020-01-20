import java.util.*;


public class Recursion {
// stefan maric

    //Factorial

    /*
    public static long factorial(long n) {
        if (n==0) return 1;
        if (n==1) return 1;

        return n * factorial(n-1);
    }



    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a positive int:");
        int num = sc.nextInt();
        System.out.println("Factorial("+num+") = "+factorial(num));

    }



//fibonnaci
public static long Fibonnaci(long k){
    if (k==0) return 1;
    if (k==1) return 1;

    return k * Fibonnaci(k-1)+Fibonnaci(k-2);
}

    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a positive int:");
        int num = sc.nextInt();
        System.out.println("Factorial("+num+") = "+Fibonnaci(num));

    }
*/

    public static int Fibonnaci(int k){
        if (k==0) return 1;
        if (k==1) return 1;

        return k * Fibonnaci(k-1)+Fibonnaci(k-2);
    }

    public static void printStars(int k) {
        for(int x=0;x<k;x++){
            System.out.println("*");
        }
        System.out.println();
        printStars(k-1);
    }
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a positive int:");
        int num = sc.nextInt();
        System.out.println("Factorial("+num+") = "+Fibonnaci(num));

    }

}