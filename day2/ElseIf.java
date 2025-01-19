import java.util.Scanner;

public class ElseIf {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age value: ");
        int age = sc.nextInt();

        if(age < 13){
            System.out.println("Child");
        }else if(age < 18){
            System.out.println("Younger");
        }else{
            System.out.println("Adult");
        }
    }
}