
class A{

    public void display(){
        System.out.println("Hello Zaid");
    }

    public void print(){
        System.out.println("Hello Nikhil");
    }
}

class B extends A{

    @Override
    public void print(){
        System.out.println("Hello Rabins");
    }
}



public class MethodOverriding2 {
    public  static void main(String[] args){
 
        B obj1=new B();
        obj1.display();

        B obj2=new B();
        obj2.print();
    }
}
