import java.util.Scanner;

public class LoopTask {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        
        // Task 1 Print all even numbers till n
        // System.out.print("Enter the value of n: ");
        // int n = sc.nextInt();

        // for(int i=1; i<=n; i++){
        //     if(i % 2 == 0){
        //         System.out.println(i);
        //     }
        // }

        //Task 2 check the code
        // for(; ;){
        //     System.out.println("Hello world!");
        // }
        // output: unlimited time

        //Task 3
        // Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
        // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
        // If they enter 0 then stop.
        // If he/ she scores :
        // Marks >=90 -> print “This is Good”
        // 89 >= Marks >= 60 -> print “This is also Good”
        // 59 >= Marks >= 0 -> print “This is Good as well”
        //     Because marks don’t matter but our effort does.
        // (Hint : use do-while loop but think & understand why)
        System.out.print("Enter any number like 1 or 0: ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.print("Enter any marks number out of 100");
            int marks = sc.nextInt();
            if(marks >= 90){
                System.out.print("This is Good");
            }else if(89 >= marks && marks >= 60){
                System.out.print("This is also Good");
            }else if(59 >= marks && marks >= 0){
                System.out.print("This is Good as well");
            }
        }else{
            System.out.print("Stop");
            return;
        }

        sc.close();
    }
}