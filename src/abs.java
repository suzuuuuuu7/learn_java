
    abstract class Animal {
        abstract void sound();
        abstract void drink();

        void eat() {
            System.out.println("Dog eat food");
        }

         static class Dog extends Animal {
            void sound() {
                System.out.println("Dog barks");
            }
            void drink(){
                System.out.println("drink");
            }
        }
    }
    class cat extends Animal.Dog{
        void sound(){
            System.out.println("Cat meowww");
        }
        void cry(){
            System.out.println("ok");
        }

    }
        public class abs {

            public static void main(String[] args) {
               Animal.Dog d = new Animal.Dog();
               d.sound();
               d.eat();
               d.drink();
               cat obj = new cat();
               obj.cry();
               obj.sound();
               obj.eat();
               obj.drink();


            }
        }

