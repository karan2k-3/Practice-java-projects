import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {
    public static void main(String[] args) {
        abc obj1 = new abc();
        
    }
    
}
class abc extends JFrame{//follows crd layout can only see the top card of the stack

    ///this whole section is basic for creating a jframe window 
   public abc(){
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this is used to close jframe code not just making it invisible
   }
}