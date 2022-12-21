package test;

import javax.swing.JOptionPane;

public class InputDialog1{

 	public static void main(String[] args){

	String F_name=JOptionPane.showInputDialog(null,"Enter your first name : ","This is Title",JOptionPane.INFORMATION_MESSAGE);
	String L_name=JOptionPane.showInputDialog("Enter your last name : ");

	String name=F_name+ " " +L_name;

	JOptionPane.showMessageDialog(null,"Your Name is : "+name);
	}
}
