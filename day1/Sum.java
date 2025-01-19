import java.util.Scanner;

class Sum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.print("Sum or two number a and b: "+ sum );
        sc.close();
    }
}