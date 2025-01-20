import java.util.Scanner;

public class Pattern {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        // System.out.print("Enter the value of m: ");
        // int m = sc.nextInt();

        //1 
        // n=4; m=5
        // *****
        // *****
        // *****
        // *****

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 2
         // n=4; m=5
        // *****
        // *   *
        // *   *
        // *****

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || i==n || j==1 || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        // 3 
        // only use n
        // *
        // **
        // ***
        // ****

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 4
        // Enter the value of n: 5
        // *****
        // ****
        // ***
        // **
        // *
        // for(int i=1; i<=n; i++){
        //     for(int j=n; j>=i; j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 5
        // Enter the value of n: 5
        //     *
        //    **
        //   ***
        //  ****
        // *****
        // for(int i=1; i<=n; i++){
        //     //space inner loop
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     //star inner loop
        //     for(int k=1; k<=i; k++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 6
        // 1
        // 12
        // 123
        // 1234
        // 12345
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // 7
        // Enter the value of n: 5
        // 12345
        // 1234
        // 123
        // 12
        // 1
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

    }
}