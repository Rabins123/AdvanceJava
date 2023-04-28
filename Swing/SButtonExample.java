import javax.swing.*;
public class SButtonExample {
    SButtonExample(){
        JFrame f=new JFrame("Swing");
       JButton b=new JButton("Click Me");
       f.add(b);
       b.setBounds(50,50,100,30);
       f.setLayout(null);
       f.setSize(200,200);
       f.setVisible(true);
       f.setDefaultCloseOperation(200);


    }
   public static void main(String [] args){
    new SButtonExample();
    
   } 
}
