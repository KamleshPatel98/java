import java.util.Scanner;

public class Function {
    // 1
    // public static void printMyName(String name){
    //     System.out.print(name);
    //     return;
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     String name = sc.next();
    //     printMyName(name);
    // }


    //2 Sum of two number
    // public static int printSum(int a, int b){
    //     int sum = a + b;
    //     System.out.print(sum);
    //     return 1;
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter no. of a: ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter no. of b: ");
    //     int b = sc.nextInt();
    //     System.out.print("Enter sum of a and b is: ");
    //     printSum(a,b);
    // } 


    // 3 Multiply 2 numbers
    // public static int calculateProduct(int a, int b){
    //     return a * b;
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of a: ");
    //     int a = sc.nextInt();
    //     System.out.print("Enter value of b is: ");
    //     int b = sc.nextInt();
    //     System.out.print("Product of 2 numbers is: "+calculateProduct(a,b));
    // }


    // 4 factorial of n numbers
    // public static void calculateFactorial(int n){
    //     if(n < 0){
    //         System.out.print("Invalid Number");
    //         return;
    //     }
    //     int factorial = 1;
    //     for(int i=1; i<=n; i++){
    //         factorial *= i;
    //     }
    //     System.out.print(factorial);
    //     return;
    // }

    // public static void main(String[] arg){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter value of n: ");
    //     int n = sc.nextInt();
    //     System.out.print("Factorial of "+n+" numbers is: ");
    //     calculateFactorial(n);
    // }


    //  5 
    public static void calculateFactorial(int n){
        if(n < 0){
            System.out.print("Invalid Number");
            return;
        }
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        System.out.print(factorial);
        return;
    }

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" numbers is: ");
        calculateFactorial(n);
    }
}