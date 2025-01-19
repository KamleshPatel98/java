import java.util.Scanner;

public class If {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age value: ");
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }

        sc.close();
    }
}