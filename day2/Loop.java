import java.util.Scanner;

public class Loop {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value or n number: ");
        int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     System.out.println(i);
        // }

        // int i = 1;
        // while(i<=n){
        //     System.out.println(i);
        //     i++;
        // }

        //Every condition one time loop work
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i>=n);
        // }while(i<=n);
        

        sc.close();
    }
}