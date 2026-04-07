interface calculate{
    int sum(int a,int b);
    void display();
}
class math implements calculate{
   public int sum(int a ,int b){
        return a+b;
    }
    public void display(){
       System.out.println("its me sujalkc");
    }
}
 public class inter_face {
     public static void main(String[] args) {
         math obj = new math();
         int result = obj.sum(40,30);
         System.out.println("Result is:" +result);
         obj.display();
     }
}

