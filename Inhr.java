public class Inhr {
    public static void main( String args[]){

        Fish shark = new Fish();
        shark.eat();
    }
}

//parent class
class Animal{
    String color ;
    void eat(){
        System.out.println("eating");
    }
    void breathe(){
        System.out.println("breathing");
    }
}

//derive class 

class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swimming");
    }
}