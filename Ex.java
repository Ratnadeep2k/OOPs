public class Ex{
    public static void main(String args[]){
        Pen p1 = new  Pen();//we have created a pen object called p1;
        p1.setColor("Black");
        System.out.println(p1.getColor());
        p1.setTip(6);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class Pen{
    //prorps + function
   private String color; 
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return this.color;//same name variable
    }
    int getTip(){
        return this.tip;
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