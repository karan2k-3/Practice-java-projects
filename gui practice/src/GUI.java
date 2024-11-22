import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class GUI {
    public static void main(String[] args) {
        abc obj1 = new abc();
        
    }
    
}
class abc extends JFrame{//follows card layout can only see the top card of the stack

    JTextField t1,t2;//adding text feilds to my empty frame later gonna modify 
    JButton b,minus,multiply,divide;
    public abc(){
    t1 = new JTextField(7);
    t2 = new JTextField(7);
    b = new JButton("+");
    minus = new JButton("-");
    multiply = new JButton("*");
    divide = new JButton("/");

    add(t1);
    add(t2);
    add(b);
    add(minus);
    add(multiply);
    add(divide);
    ActionListener act = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int num1= Integer.parseInt(t1.getText());//integer.parsint converets string value to integer
                int num2=Integer.parseInt(t2.getText());
                int value = num1 + num2;
                b.setText(value + "");//any interger output + "" is a string output
            
        }
    };
    b.addActionListener(act);
    ActionListener ac = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int num1= Integer.parseInt(t1.getText());//integer.parsint converets string value to integer
                int num2=Integer.parseInt(t2.getText());
                int value = num1 - num2;
                minus.setText(value + "");//any interger output + "" is a string output
            
        }
    };
    minus.addActionListener(ac);
    ActionListener act1 = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int num1= Integer.parseInt(t1.getText());//integer.parsint converets string value to integer
                int num2=Integer.parseInt(t2.getText());
                int value = num1 * num2;
                multiply.setText(value + "");//any interger output + "" is a string output
            
        }
    };
    multiply.addActionListener(act1);

    ActionListener act2 = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            int num1= Integer.parseInt(t1.getText());//integer.parsint converets string value to integer
                int num2=Integer.parseInt(t2.getText());
                int value = num1 /num2;
                divide.setText(value + "");//any interger output + "" is a string output
            
        }
    };
    divide.addActionListener(act2);
    
    ///this whole section is basic for creating a jframe window 
   
    setLayout(new FlowLayout());
    setVisible(true);
    setSize(500,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this is used to close jframe code not just making it invisible
   }
}