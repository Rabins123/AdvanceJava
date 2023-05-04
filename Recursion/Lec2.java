public class Lec2{
 

    public static void main(String[] args) {
        int n=5;
        print(n);
    }

    private static void print(int i) {
        if(i==0){
            return;
        }
        System.out.println("Rabins");
        print(i-1);
    }
}