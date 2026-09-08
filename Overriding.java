public class Overriding {
    public static void main(String[] args) {
        Shape obj = new Circle(20.0);
        obj.area();
        Shape obj2 = new Rectangle(10,20);
        obj2.area();
        Shape[] obj3 = {new Circle(20.0),new Rectangle(10,20)};
        for(Shape i:obj3)
            i.area();
    }
    
}
class Shape{
    void area(){

    }
}
class Circle extends Shape{
    private double r;
    Circle(double r){
        this.r=r;
    }
    void area(){
        System.out.println("Area of circle is"+(22/7.0 *r *r));
    }
}
class Rectangle extends Shape{
    private int i,b;
    Rectangle(int i,int b){
        this.i = 1;
        this.b = b;
    }
    void area(){
System.out.println("Area of Rectangle is" + (1*b));
    }
}