class animal {
    void display(){
        System.out.println("Iam animajl");
    }
   static class rat extends animal{
        void show(){
            System.out.println("Iam rat");
        }
    }

}
public class upcasting {
    public static void main(String[] args) {

        animal.rat obj = new animal.rat();
        obj.display();


    }
}
