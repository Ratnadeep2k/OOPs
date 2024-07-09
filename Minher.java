public class Minher {
    public static void main(String[] args) {
        Dog da = new Dog();
        da.bark();
        da.run();
        da.eat();
        da.breathe();
    }
}
 //Multilevel Inheritance
class Animal{
    String color ;
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

class Mammals extends Animal{
    int legs;
    void run(){
        System.out.println("running");
    }
}
class Dog extends Mammals{
    void bark(){
        System.out.println("barking");
    }
}