import java.util.Scanner;

public class ArraySum {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.print("Enter n: "+ n +" numbers: ");
        for(int i=0; i<n; i++){
            numbers[i] =  sc.nextInt();
            sum += numbers[i];
        }

        System.out.println("Array sum: "+sum);

    }
}