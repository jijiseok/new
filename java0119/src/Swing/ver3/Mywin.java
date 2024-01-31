package Swing.ver3;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;


public class Mywin extends JFrame implements ActionListener{
	JLabel lb1= new JLabel("이름1");
	JTextField tf1= new JTextField(5);
	JButton bt1= new JButton("버튼1");
	JLabel lb2= new JLabel("이름2");
	JTextField tf2= new JTextField(5);
	JButton bt2= new JButton("버튼2");
	
	
	public Mywin() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lb1);	con.add(tf1);	con.add(bt1);
		con.add(lb2);	con.add(tf2);	con.add(bt2);
		this.setTitle("자바 스윙");
		this.setSize(400,200);
		this.setLocation(700,400);
		this.setVisible(true);
		
		bt1.addActionListener(this); //actionPerformed 가능하게해줌
		bt2.addActionListener(this);
	}

	public static void main(String[] args) {
		new Mywin(); //생성자가 실행
	}

	@Override
	public void actionPerformed(ActionEvent e) { //버튼에대한이벤트
//		System.out.println("클릭!");
		if(e.getSource().equals(bt1)) {
			System.out.println("버튼1");
		}else if(e.getSource().equals(bt2)) {
			System.out.println("버튼2");
		}
		
	
	}

}
