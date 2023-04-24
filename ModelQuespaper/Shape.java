public class Shape{
 int length;
 int breadth;
 int width;

 public Shape(int l, int b, int w){
length=l;
breadth=b;
width=w;
 }

 public int Area(){
    return length*breadth;
 }

 public int Volume(){
return length*breadth*width;
 }

//  public void sewtWidth(int w){
//     width=w;
//  }

}

class Main{
    public static void main(String[] args){
        Shape s=new Shape(4, 5,6);

        // s.sewtWidth(8);
        System.out.println("Area: "+ s.Area());
        System.out.println("Volume: "+s.Volume());
        
    }
}