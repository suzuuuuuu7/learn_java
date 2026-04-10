interface A{
    int a = 20;
    void screen();

}
interface B {
    int b = 20;

    void display();

}
 class C implements A,B{
   public void screen(){
        System.out.println("screen form a");
    }
   public void display() {
        System.out.println("display from B");
    }
    int sum(int a ,int b){
       return a+b;
    }
        }
        public class multiple_in{
            public static void main(String[] args) {
                C obj = new C();
                int result = obj.sum(30,30);
                System.out.println(result);
                obj.display();
                obj.screen();
            }
        }
