public class Encap {
    public static void main(String args[]){

        Student s1 = new Student("Ratnadeep");
        s1.roll =456;
        s1.password="abcd";
        
        Student s2 = new Student(s1);//copy constructor s1 is copied into s2
        s2.password="xyz";
    }
}

class Student{
    String name;
    int roll ;
    String password;
    Student(Student s1){
        //copy constructor
        this.name = s1.name;
        this.roll = s1.roll;
    }
    Student(){  
        System.out.println("constructor is called");
    }
    Student(String name){
        //constructor 
        this.name = name ;

    }
    Student(int roll){
        this.roll = roll;
    }

}