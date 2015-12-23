// Java Program for creating a Calculator Application
// Dt:09/12/2015
// Author:Vamshi Rakela

import java.awt.*;
import java.awt.event.*;
class  ccdemo implements ActionListener
{
	Frame f;
	Panel p;
	TextField txt;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
	ccdemo()
	{
		f=new Frame();
		p=new Panel();
		txt=new TextField(20);
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		b11=new Button("+");
		b12=new Button("-");
		b13=new Button("*");
		b14=new Button("/");
		b15=new Button("=");
		p.add(txt);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		p.add(b12);
		p.add(b13);
		p.add(b14);
		p.add(b15);
		f.add(p);
		f.setTitle("CDemo");
		f.setSize(300,300);
		f.setVisible(true);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
	}
	int a,b,c,cnt;
	String str=new String("");
	public void actionPerformed(ActionEvent ae)
	{
		
	//	String str=new String("Hello");
	//	String str1=new String("");
	//	String str2=new String("");
		if(ae.getSource()==b1)
		{
			
			str=str+1;
			txt.setText(str);
		}
		if(ae.getSource()==b2)
		{
			
			str=str+2;
			txt.setText(str);
		}
	    if(ae.getSource()==b3)
		{
			 str=str+'3';
			txt.setText(str);
		}
		if(ae.getSource()==b4)
		{
		 	str=str+'4';
			txt.setText(str);
		}
		if(ae.getSource()==b5)
		{
			str=str+'5';
			txt.setText(str);
		}
		if(ae.getSource()==b6)
		{
			str=str+'6';
			txt.setText(str);
		}
		if(ae.getSource()==b7)
		{
			str=str+'7';
			txt.setText(str);
		}
		if(ae.getSource()==b8)
		{
			str=str+'8';
			txt.setText(str);
		}
		if(ae.getSource()==b9)
		{
			 str=str+'9';
			txt.setText(str);
		}
		if(ae.getSource()==b10)
		{
			str=str+'0';
			txt.setText(str);
		}
		if(ae.getSource()==b11)
		{
			//a=Integer.parseInt(txt.getText()) ;
			// str=str+'+';
			String str2=txt.getText();
			str="";
			txt.setText(str);
			a=Integer.parseInt(str2);
			cnt=1;
		}
		if(ae.getSource()==b12)
		{
			//str=str+'-';
			String str2=txt.getText();
			str="";
			txt.setText(str);
			a=Integer.parseInt(str2);
			cnt=2;
		}
		if(ae.getSource()==b13)
		{
			String str2=txt.getText();
			str="";
			txt.setText(str);
			a=Integer.parseInt(str2);
			cnt=3;
		}
		if(ae.getSource()==b14)
		{
			String str2=txt.getText();
			str="";
			txt.setText(str);
			a=Integer.parseInt(str2);
			cnt=4;
		} 
		if(ae.getSource()==b15)
		{
			//int l=str.indexOf('1');
			//txt.setText(""+l); 
			
		//	String strh=str.substring(l);
		//	String strl=str.substring(0,l-1);
		//	int a=Integer.parseInt(strl);
			String str1=txt.getText();
			str="";
			 b=Integer.parseInt(str1);
		if(cnt==1)
			c=a+b;
		if(cnt==2)
			c=a-b;
		if(cnt==3)
			c=a*b;
		if(cnt==4)
			c=a/b;
			txt.setText(""+c);
		}
	}
	public static void main(String[] args) 
	{
		ccdemo c=new ccdemo();
	}
}
