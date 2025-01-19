import java.util.Scanner;

public class Switch {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the color: ");
        
        // int colorId = sc.nextInt();

        // switch(colorId){
        //     case 1: 
        //         System.out.print("Red color");
        //         break;
        //     case 2: 
        //         System.out.print("Blue color");
        //         break;
        //     default: 
        //         System.out.print("Color is not defined");
        // }

        String color = sc.next();

        switch(color){
            case "red": 
                System.out.print("Red color");
                break;
            case "blue": 
                System.out.print("Blue color");
                break;
            default: 
                System.out.print("Color is not defined");
        }

        sc.close();
    }
}