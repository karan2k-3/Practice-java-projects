import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
    public static void main(String[] args) {
        abc obj1 = new abc();
        
    }
    
}
class abc extends JFrame{
   public abc(){
    JLabel l = new JLabel("HI this is karan");
    add(l);
    setVisible(true);
    setSize(400,400);
   }
}