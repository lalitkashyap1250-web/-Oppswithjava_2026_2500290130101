class Hello{
    void display(){
        System.out.println("Helloworld!");
    }
}

public class HelloWorldUsingObjectsAndMethodsCalling {
    public static void main(String[] args) {
        Hello obj=new Hello();
        obj.display();
    }
}