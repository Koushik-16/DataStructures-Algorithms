package test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Test4 extends JFrame {
	
	private ImageIcon icon;
	
	Test4()
	{
		initComponents();
	}
	
	public void initComponents()
	{
		icon = new ImageIcon(getClass().getResource("JFrame.jpg"));
		this.setIconImage(icon.getImage());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 frame = new Test4();//where the frame is not visible
		frame.setVisible(true); //to make the frame visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for default close
		frame.setSize(500, 300);//for frame size
		//frame.setLocationRelativeTo(null);//to bring the frame in middle position
		frame.setLocation(100, 200);//set location
		//setBound=setlocation + setSize 
		frame.setBounds(200, 50, 400, 300);
		frame.setTitle("Frame Demo");
		frame.setResizable(false);//does not permit user to resize the frame
	}

}
