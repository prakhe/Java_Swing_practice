/*This is just a simple program explaining how to make a simple java gui. Helpful to all beginners.*/
import javax.swing.*;  
public class Java_gui//defining a class 
{  
public static void main(String args[] ) //main method
{  
JFrame f=new JFrame(); //A frame for our application is defined here
          
JButton b=new JButton("click"); /*A button is defined in our application. This is the same method we use to define buttons in all programs*/
b.setBounds(130,100,100, 40); //Height,width and breath of our application
          
f.add(b); //Adding button in the frame
          
f.setSize(400,500); //size of the button
f.setLayout(null);
f.setVisible(true);
}  
}  
