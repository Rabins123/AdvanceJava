

public class ConstructorOverloading {
    int a,b, c;
    String d,e,f;

    public ConstructorOverloading( int x, int y, int z){
        a=x;
        b=y;
        c=z;
    }

    public ConstructorOverloading(String l,String m,String n){
        d=l;
        e=m;
        f=n;
    }
 
    public void display(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    public void print(){
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}

class Main3{
    public static void main(String[] args) {
        ConstructorOverloading obj1=new ConstructorOverloading(4,5,6);
        ConstructorOverloading obj2=new ConstructorOverloading("Rabins", "Kshitiz", "Pulkit");

        obj1.display();
        obj2.print();
    }
}
