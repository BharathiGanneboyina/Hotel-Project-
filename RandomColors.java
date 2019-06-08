import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class RandomColors extends Frame implements ActionListener
{
  public RandomColors() 
  {
    setLayout(new FlowLayout());
 
    Button btn = new Button("Click me");
    btn.addActionListener(this);
    add(btn);
 
    setTitle("Generating Random Colors");
    setSize(300, 300);
    setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    Random rand = new Random();
 
    int redValue = rand.nextInt();
   Color clr = new Color(redValue);
    setBackground(clr);

  }
  public static void main(String args[])
  {
    new RandomColors();
  }
}