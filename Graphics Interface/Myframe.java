import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;

public class Myframe extends JFrame implements ActionListener{
    //this is our variable
    static double a=0,b=0,result=0;
    static int operator=0;
    //create a label and text field
    JTextField label;
    //create our button object
    JButton button_0;
    JButton button_1;
    JButton button_2;
    JButton button_3;
    JButton button_4;
    JButton button_5;
    JButton button_6;
    JButton button_7;
    JButton button_8;
    JButton button_9;
    //operation button
    JButton button_plus;
    JButton button_sub;
    JButton button_div;
    JButton button_multi;
    // clear and return button
    JButton button_clr;
    JButton button_ret;
    //this is our frame
    Myframe(){
        //create our label
        label = new JTextField();
        // create our button
        button_0 = new JButton();
        button_1 = new JButton();
        button_2 = new JButton();
        button_3 = new JButton();
        button_4 = new JButton();
        button_5 = new JButton();
        button_6 = new JButton();
        button_7 = new JButton();
        button_8 = new JButton();
        button_9 = new JButton();
        button_plus = new JButton();
        button_sub = new JButton();
        button_div = new JButton();
        button_clr = new JButton();
        button_ret = new JButton();
        button_multi = new JButton();
        // controle our label 
        label.setBounds(20, 10, 260,50);
        label.setForeground(Color.WHITE);
        label.setBackground(Color.BLACK);
        // controle our button
        button_1.setBounds(20, 70, 50, 50);
        button_2.setBounds(90,70, 50, 50);
        button_3.setBounds(160,70, 50, 50);
        button_plus.setBounds(230,70, 50, 50);
        button_4.setBounds(20, 140, 50, 50);
        button_5.setBounds(90, 140, 50, 50);
        button_6.setBounds(160, 140, 50, 50);
        button_sub.setBounds(230, 140, 50, 50);
        button_7.setBounds(20, 210, 50, 50);
        button_8.setBounds(90, 210, 50, 50);
        button_9.setBounds(160, 210, 50, 50);
        button_div.setBounds(230, 210, 50, 50);
        button_clr.setBounds(20, 280, 50, 50);
        button_0.setBounds(90, 280, 50, 50);
        button_ret.setBounds(160, 280, 50, 50);
        button_multi.setBounds(230, 280, 50, 50);
        // set text to our button
        button_0.setText("0");
        button_1.setText("1");
        button_2.setText("2");
        button_3.setText("3");
        button_4.setText("4");
        button_5.setText("5");
        button_6.setText("6");
        button_7.setText("7");
        button_8.setText("8");
        button_9.setText("9");
        button_plus.setText("+");
        button_sub.setText("-");
        button_div.setText("/");
        button_multi.setText("X");
        button_clr.setText("=");
        button_ret.setText(".");
        //remove grid from our button
        button_0.setFocusable(false);
        button_1.setFocusable(false);
        button_2.setFocusable(false);
        button_3.setFocusable(false);
        button_4.setFocusable(false);
        button_5.setFocusable(false);
        button_6.setFocusable(false);
        button_7.setFocusable(false);
        button_8.setFocusable(false);
        button_9.setFocusable(false);
        button_plus.setFocusable(false);
        button_sub.setFocusable(false);
        button_div.setFocusable(false);
        button_multi.setFocusable(false);
        button_clr.setFocusable(false);
        button_ret.setFocusable(false);
        //generale system for our frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300,390);
        this.setTitle("calculator");
        this.getContentPane().setBackground(Color.black);
        // add our button do the frame
        this.add(button_0);
        this.add(button_1);
        this.add(button_2);
        this.add(button_3);
        this.add(button_4);
        this.add(button_5);
        this.add(button_6);
        this.add(button_7);
        this.add(button_8);
        this.add(button_9);
        this.add(button_plus);
        this.add(button_sub);
        this.add(button_div);
        this.add(button_multi);
        this.add(button_clr);
        this.add(button_ret);
        this.add(label);
        //add action listener
        button_0.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        button_plus.addActionListener(this);
        button_sub.addActionListener(this);
        button_div.addActionListener(this);
        button_multi.addActionListener(this);
        button_clr.addActionListener(this);
        button_ret.addActionListener(this);
        // show our frame
        this.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button_1)
            label.setText(label.getText().concat("1"));
        if(e.getSource()==button_2)
            label.setText(label.getText().concat("2"));
        if(e.getSource()==button_3)
            label.setText(label.getText().concat("3"));
        if(e.getSource()==button_4)
            label.setText(label.getText().concat("4"));
        if(e.getSource()==button_5)
            label.setText(label.getText().concat("5"));
        if(e.getSource()==button_6)
            label.setText(label.getText().concat("6"));
        if(e.getSource()==button_7)
            label.setText(label.getText().concat("7"));
        if(e.getSource()==button_8)
            label.setText(label.getText().concat("8"));
        if(e.getSource()==button_9)
            label.setText(label.getText().concat("9"));
        if(e.getSource()==button_0)
            label.setText(label.getText().concat("0"));
        if(e.getSource()==button_ret)
            label.setText(label.getText().concat("."));    
        if(e.getSource()==button_plus){
            a=Double.parseDouble(label.getText());
            operator=1;
            label.setText("");
        }
        if(e.getSource()==button_sub){
            a=Double.parseDouble(label.getText());
            operator=2;
            label.setText("");
        }
        if(e.getSource()==button_multi){
            a=Double.parseDouble(label.getText());
            operator=3;
            label.setText("");
        }
        if(e.getSource()==button_div){
            a=Double.parseDouble(label.getText());
            operator=4;
            label.setText("");
        }
        if(e.getSource()==button_clr){
            b=Double.parseDouble(label.getText());
            switch(operator){
                case 1: result=a+b;
                break;
                case 2: result=a-b;
                break;
                case 3: result=a*b;
                break;
                case 4: result=a/b;
                break;
                default: result=0;
            }
            label.setText(""+result);
        }
    }
}
