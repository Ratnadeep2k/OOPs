public class Ex{
    public static void main(String args[]){
        Pen p1 = new  Pen();//we have created a pen object called p1;
        p1.setColor("Black");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);
    }
}

class Pen{
    //prorps + function
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name;
    int age ;
    float percentage ;
    void calcPercentage(int phy, int chem,int math){
        percentage = (phy + chem + math) / 3;
    }
}