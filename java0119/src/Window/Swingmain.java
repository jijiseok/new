package Window;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;



public class Swingmain extends JFrame {
	public Swingmain (){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 100);
		this.setSize(500, 300);
		this.setTitle("스윙"); //박스 제목
		this.setVisible(true);  //윈도우 보이게
	
		JButton jb3 = new JButton("조회");
		jb3.setLocation(380, 350);
		jb3.setSize(100, 30);
		

	}
	

	public static void main(String[] args) {
		new Swingmain();
		
	}


	
}
