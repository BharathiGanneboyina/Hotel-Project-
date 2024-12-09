/* This is comment in Java */ 

/* This is second line commit */
import java.awt.*;
import java.awt.event.*;
public class Read1 extends Frame implements ItemListener{
  Checkbox c1,c2,c3;
   Frame f=new Frame();
	Label l1=new Label(" Number");
	Label l2=new Label("Number 2");
	Label l3=new Label("Result1");
	Label l4=new Label("res2");
	Label l5=new Label("res3");
	
	
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	TextField t4=new TextField();
	TextField t5=new TextField();
	
	
   public Read1()
   {
     setLayout(new FlowLayout());
	 
	l1.setBounds(50,100,100,20);
		
		l2.setBounds(50,140,100,20);
		l2.setBounds(50,180,100,20);
		l3.setBounds(50,220,100,20);
		l4.setBounds(50,260,100,20);
		l5.setBounds(50,300,100,20);
		
		
		t1.setBounds(200,100,100,20);
		t2.setBounds(200,140,100,20);
		t3.setBounds(200,180,100,20);
		t4.setBounds(200,220,100,20);
		t5.setBounds(200,260,100,20);
		
	  c1=new Checkbox("Add",false);
	   c2=new Checkbox("Sub",false);
	  c3=new Checkbox("Mul",true);
	  add(c1);
	  add(c2);
	  add(c3);
	  add(l1);
	     add(t1);
      add(l2);
	     add(t2);
	  add(l3);
	     add(t3);
		 add(l4);
		 add(t4);
		 add(l5);
		 add(t5);
      
  
	  c1.addItemListener(this);
	  c2.addItemListener(this);
	  c3.addItemListener(this);
	  
	   f.setLayout(null);
	   setBackground(Color.blue);
	  setTitle("reading checkbox");
	  setSize(400,400);
	  setVisible(true);
	  }
	  public void itemStateChanged(ItemEvent e)
	  {
		  int  n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
	
		   if(e.getSource()==c1)                         


		{
			
			t3.setText(String.valueOf(n1+n2));
			

		}
			
	 if(e.getSource()==c2)
		{
	                               t4.setText(String.valueOf(n1-n2));
			
		}

		if(e.getSource()==c3)
		{
		t5.setText(String.valueOf(n1*n2));
		}                                      
          repaint();                                                  
            
}
    public void paint(Graphics g)
	{
	g.drawString("checkbox values",10,80);
	g.drawString(" add "+t3.getText(),10,130);
	g.drawString("sub:"+t4.getText(),10,150);
	g.drawString("mul:"+t5.getText(),10,180);
		//msg="current Selection:";
		//msg+=cbg.getSelectedCheckbox().getLabel(t3);
		//g.drawString(msg,10,100);
	
		//g.drawString("Add :"+c1.getSelectedItem(),10,130);
		//g.drawString("sub :"+c2.getState(),10,150);
		//g.drawString("mul :"+c3.getState(),10,180);
	}
		
		  public static void main(String args[])	
		  {
		  new Read1();
		  }
		  }
		
   