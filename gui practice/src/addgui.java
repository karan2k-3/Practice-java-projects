import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class addgui {
    public static void main(String[] args) {
        addition obj = new addition();
    }
}
class addition extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton b ;
    JLabel l;
    public addition(){
       t1 = new JTextField(5);
       t2 = new JTextField(5);

       b = new JButton("OK");
       l = new JLabel("Result");
       
        add(t1);
        add(t2);
        add(b);
        add(l);
        b.addActionListener(this);//Actionlistner is an inteface 
       
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int num1= Integer.parseInt(t1.getText());//integer.parsint converets string value to integer
        int num2=Integer.parseInt(t2.getText());
        int value = num1 + num2;
        l.setText(value + "");//any interger output + "" is a string output

    }
}