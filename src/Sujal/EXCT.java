package Sujal;
import java.util.InputMismatchException;
import java.util.Scanner;
public class EXCT {
    public static void main(String[] args){
        try {
            int a = 0;
            int b = 0;
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter first value");
                a = sc.nextInt();
                System.out.println("Enter second value");
                b = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e);
                System.out.println("Plz inter valid integer");
            }

             int div = a/b;
            System.out.println("Result" + div);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("divide by one is undefined");
        }
        finally {
            System.out.println("Iam always executed");
        }

    }
}
