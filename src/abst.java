import java.util.Scanner;
 abstract class Parent{
    abstract void Getuser_value();
    abstract void displayUserdetail();
    String name;
    String address;
    int age;
}
class child extends Parent{
    void Getuser_value(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
         name = sc.nextLine();
        System.out.println("Enter your address");
         address = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
    }
    void displayUserdetail(

    ){
        System.out.println("The user is shown here....");
        System.out.println("Your name is: "+name+"\t"+"Your address is: "+address+"\t"+"your age is: "+age);


    }
}
public class abst {
    public static void main(String[] args) {
        child obj = new child();
        obj.Getuser_value();
        obj.displayUserdetail();
    }
}
