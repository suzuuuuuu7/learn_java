class mat{
    public   void sum(int a ,int b){
        System.out.println(a+b);

    }
    public float sum(float x ,float y){
        return x+y;
    }

    public class f_overloading {
        public static void main(String[] args) {
            mat ob = new mat();
            ob.sum(3, 3);
            float sum = ob.sum(3f, 3f);
            System.out.println(sum);
        }
    }
}
