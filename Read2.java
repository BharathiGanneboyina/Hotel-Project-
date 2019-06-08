import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Read2 extends JFrame implements ActionListener{
  
	 JCheckBox checkboxOne = new JCheckBox("tea---10");
	 JCheckBox checkboxTwo = new JCheckBox("coffee--15");
	 JCheckBox checkboxThree = new JCheckBox("idly---25");
		 JCheckBox checkboxfour = new JCheckBox("wada ----30");
 JCheckBox checkboxfive = new JCheckBox("dosa---40");
 JCheckBox checkboxsix = new JCheckBox("chapathi---50");
 JLabel labelname = new JLabel("Name",Label.RIGHT);
	 JTextField textFieldname = new JTextField(10);
	 JLabel labelSum = new JLabel("total",Label.RIGHT);
	 JTextField textFieldSum = new JTextField(15);
	 int sum = 0;
	 Read2() {
		
		setLayout(new FlowLayout());	
		add(checkboxOne);
		add(checkboxTwo);
		add(checkboxThree);
		add(checkboxfour);
		add(checkboxfive);
		add(checkboxsix);
		add(labelname);
		add(textFieldname);
		add(labelSum);
		add(textFieldSum);
		checkboxOne.addActionListener(this);
   checkboxTwo.addActionListener(this);
   checkboxThree.addActionListener(this);
   checkboxfour.addActionListener(this);
    checkboxfive.addActionListener(this);
	checkboxsix.addActionListener(this);	
	}
		public void actionPerformed(ActionEvent event) {
			JCheckBox checkbox = (JCheckBox) event.getSource();
			if (checkbox.isSelected()) {
				if (checkbox == checkboxOne) {
					sum += 10;
				} else if (checkbox == checkboxTwo) {
					sum += 15;
				} 	
              else if (checkbox == checkboxThree) {
					sum += 25;
				
			} 
			else if (checkbox == checkboxfour) {
					sum += 30;
			}else if (checkbox == checkboxfive) {
					sum += 40;
			}else if (checkbox == checkboxsix) {
					sum += 50;
			}
			}
			else {
				if (checkbox == checkboxOne) {
					sum -= 10;
				} else if (checkbox == checkboxTwo) {
					sum -= 15;
				} else if (checkbox == checkboxThree) {
					sum -= 25;
				}
				 else if (checkbox == checkboxfour) {
					sum -= 30;
				}
				 else if (checkbox == checkboxfive) {
					sum -= 40;
				}
				 else if (checkbox == checkboxsix) {
					sum -= 50;
				}
			}
			textFieldSum.setText(String.valueOf(sum));
		
			
		}
	
	
	public static void main(String[] args) 
	{
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Read2().setVisible(true);
			}
		});
	}
}