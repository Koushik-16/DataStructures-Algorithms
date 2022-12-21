package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class NumtoWord extends JFrame { 
	
	String str = "";
	String res = "";
	
	private Container c;
	private JButton convert , clear;
	private JTextField tf;
	private JTextArea ta;
	
	NumtoWord(){
		
		c = this.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.CYAN);
		
		ta = new JTextArea();
		ta.setBounds(30,120,350,40);
		ta.setEditable(false);
		ta.setBackground(Color.WHITE);
		c.add(ta);
		
		tf = new JTextField();
		tf.setBounds(30,50,350,45);
		tf.setBackground(Color.WHITE);
		c.add(tf);
		
		convert = new JButton("Convert");
		convert.setBounds(237,97,80,20);
		convert.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tf.getText().equals("")==false) {
					String input = tf.getText();
					int n = Integer.parseInt(input);
					int rem = 0;
					while(n!=0) {
						rem = n%10;
						disp(rem);
						n=n/10;
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Text Box is Empty...","Empty Input",JOptionPane.INFORMATION_MESSAGE);
				}
			}
			public void disp(int num) {
				switch(num) {
				case 0:
					str = "Zero "+str;
					break;
				case 1:
					str = "One "+str;
					break;
				case 2:
					str = "Two "+str;
					break;
				case 3:
					str = "Three "+str;
					break;
				case 4:
					str = "Four "+str;
					break;
				case 5:
					str = "Five "+str;
					break;
				case 6:
					str = "Six "+str;
					break;
				case 7:
					str = "Seven "+str;
					break;
				case 8:
					str = "Eight "+str;
					break;
				case 9:
					str = "Nine "+str;
					break;
				}
			res = str;
			}
		});
		c.add(convert);
		
		clear = new JButton("Clear");
		clear.setBounds(320,97,64,20);
		c.add(clear);
	}


public static void main(String[] args) {

	 	NumtoWord frame = new NumtoWord();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setBounds(100,50,500,400);
		frame.setTitle("Number to Word Conversion");   

    } 
}