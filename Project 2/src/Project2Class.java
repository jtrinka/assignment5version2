import java.awt.*; 
import javax.swing.*;

class ButtonFrame extends JFrame
{
  JButton bChange ; // reference to the button object
JButton cChange;
  // constructor for ButtonFrame
  ButtonFrame(String title) 
  {
    super( title );                     // invoke the JFrame constructor
    setLayout( new FlowLayout() );      // set the layout manager

    bChange = new JButton("Ford");// construct a JButton
    cChange = new JButton("Chevy");
    add( bChange ); // add the button to the JFrame
    add(cChange);
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );   
  }
}

public class Project2Class
{
  public static void main ( String[] args )
  {
    ButtonFrame frm = new ButtonFrame("Button Demo");

    frm.setSize( 300, 300 );     
    frm.setVisible( true );   
  }
}