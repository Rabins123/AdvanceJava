class X {

    public void display(){
        System.out.println("Hello Nitesh");
    }

    private void print(){
        System.out.println("Hello Bipin");
    }
}

class Y extends X{

    
    
    @Override
    public void display(){
        //super key word
        super.display();
        System.out.println("Hello Pulkit");
    }

    //super.rint()
}




public class MethodOverriding3 {
    public static void main(String [] args){
    Y obj1=new Y();
    obj1.display();

    
    }

}
