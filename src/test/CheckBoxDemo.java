package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.*;

public class CheckBoxDemo extends JFrame {

	private Container c;
	private Font f;
	private JCheckBox javaCheckBox, cCheckBox, mySQLCheckBox;
	private ButtonGroup bg;
	private JLabel l;
	
	CheckBoxDemo()
	{

		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.ORANGE);
		
		f = new Font("Times New Roman",Font.BOLD + Font.ITALIC,20);
		
		bg = new ButtonGroup();
		
		javaCheckBox = new JCheckBox(" Java");
		javaCheckBox.setBounds(50,100,100,30);
		javaCheckBox.setBackground(Color.BLUE);
		javaCheckBox.setFont(f);
		javaCheckBox.setForeground(Color.WHITE);
		c.add(javaCheckBox);
		
		cCheckBox = new JCheckBox(" C ");
		cCheckBox.setBounds(50,140,100,30);
		cCheckBox.setBackground(Color.BLUE);
		cCheckBox.setFont(f);
		cCheckBox.setForeground(Color.WHITE);
		//to make it select internally
		//cCheckBox.setSelected(true);
		c.add(cCheckBox);
		
		mySQLCheckBox = new JCheckBox(" mySQL");
		mySQLCheckBox.setBounds(50,180,100,30);
		mySQLCheckBox.setBackground(Color.BLUE);
		mySQLCheckBox.setFont(f);
		mySQLCheckBox.setForeground(Color.WHITE);
		c.add(mySQLCheckBox);
		
		bg.add(javaCheckBox);
		bg.add(cCheckBox);
		bg.add(mySQLCheckBox);
		
		l = new JLabel(" ");
		l.setBounds(50,230,300,50);
		l.setBackground(Color.CYAN);
		l.setFont(f);
		l.setForeground(Color.BLUE);
		c.add(l);
		
		Handler handler = new Handler("You have not selected anything");
		javaCheckBox.addActionListener(handler);
		cCheckBox.addActionListener(handler);
		mySQLCheckBox.addActionListener(handler);
		
	}
	
	class Handler implements ActionListener{
		String def ;
		
		public Handler(String s) {
			def = s;
		}

		@Override
		public void actionPerformed(ActionEvent ae) {
			
			
			if(javaCheckBox.isSelected())
			{
				l.setText("You have selected Java");
			}
			else if(cCheckBox.isSelected())
			{
				l.setText("You have selected C");
			}
			else if(mySQLCheckBox.isSelected())
			{
				l.setText("You have selected mySQL");
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckBoxDemo frame = new CheckBoxDemo();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(420,50,500,400);
		frame.setTitle("CheckBox Demo");

	}

}
