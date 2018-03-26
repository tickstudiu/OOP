import javax.swing.*;
import java.awt.*;       
import java.awt.event.*;  
 
public class AWTCounter extends JFrame implements ActionListener{
   JButton btnAdd;
   JLabel myLabel;
   JTextField myTextField;
   Container c;
   int mycount;

   public AWTCounter(){
      c = getContentPane();           // create the container
      c.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));        // set the layout
   
      mycount = 8;
      btnAdd = new JButton("btnAdd");
      myLabel = new JLabel("Counter: ");
      myTextField = new JTextField(Integer.toString(mycount),10);
 
      btnAdd.addActionListener(this);           // linking to listener
 
      c.add(myLabel);
      c.add(myTextField);
      c.add(btnAdd);        // adding buttons

                   
      setTitle("Buttons In Action");            // usual set methods of AWT frame
      setSize(300, 100);
      setVisible(true);
   }                           // override the abstract method of ActionListener
   public void actionPerformed(ActionEvent e){
      String str = e.getActionCommand();        // know which button user clicked
      int newCount = mycount + 1;
      mycount = newCount;
      if(str.equals("btnAdd")){                     // here, Red is the label of the Button rb
         myTextField.setText(Integer.toString(newCount));        // here, red is the color
      }
   }

   public static void main(String args[])
   {
      new AWTCounter();  
   }
}