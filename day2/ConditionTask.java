import java.util.Scanner;

public class ConditionTask {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        // Task 1
        // System.out.print("Enter value of a: ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b: ");
        // int b = sc.nextInt();
        // System.out.print("Enter perform operation: ");
        // String operation = sc.next();

        // switch(operation){
        //     case "add": 
        //         System.out.print(a+b);
        //         break;
        //     case "subract":
        //         System.out.print(a-b);
        //         break;
        //     case "multiply":
        //         System.out.print(a*b);
        //         break;
        //     case "division":
                // if(b == 0) {
                //     System.out.println("Invalid Division");
                // } else {
                //     System.out.println(a/b); // 34 / 15 => 2
                // }
        //         break;
        //     case "remainder":
                    // if(b == 0) {
                    //     System.out.println("Invalid Division");
                    // } else {
                    //     System.out.println(a%b); // 34 % 15 => 4
                    // }
        //         break;
        //     default: 
        //         System.out.print("Condition not satisfy");
        // }

        // Task 2
        System.out.print("Enter the number of the month: ");
        int month = sc.nextInt();

        switch(month){
            case 1: 
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("Novmber");
                break;
            case 12:
                System.out.print("December");
                break;
            default: 
                System.out.print("You enter wront number of month");
        }

        sc.close();
    }
}