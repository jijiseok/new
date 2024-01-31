package Swing.ver1;

import java.awt.Container;

import javax.swing.JFrame;

public class Mywin extends JFrame{
	public Mywin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		this.setTitle("자바 스윙");
		this.setSize(400,200);
		this.setLocation(700,400);
		this.setVisible(true);
	
	}

	public static void main(String[] args) {
		new Mywin(); //생성자가 실행
	}

}
