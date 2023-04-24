import javax.annotation.processing.ProcessingEnvironment;

public class Methodoverloading {
    
    public static void print(int a){
        System.out.println(a);
    }

    public static void print(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        print(10);
        print("VIT");
    }
}
