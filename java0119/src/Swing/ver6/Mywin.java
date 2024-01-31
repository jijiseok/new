package Swing.ver6;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Mywin extends JFrame { //필드
	JLabel lb1 = new JLabel("이름1");
	JTextField tf1 = new JTextField(5);
	JButton bt1 = new JButton("버튼1");
	JLabel lb2 = new JLabel("이름2");
	JTextField tf2 = new JTextField(5);
	JButton bt2 = new JButton("종료");
	JLabel lbState = new JLabel("메세지를 보여 줍니다.");
	//상태별 메세지를 보여줌	
	public Mywin() { //생성자
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		Container con = this.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(lbState);
		con.add(lb1);
		con.add(tf1);
		con.add(bt1);
		con.add(lb2);
		con.add(tf2);
		con.add(bt2);
		this.setTitle("자바 스윙");
		this.setSize(400, 200);
		this.setLocation(700, 400);
		this.setVisible(true);
		bt1.addActionListener(new ActionListener() {// 익명의객체생성

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1");
				lbState.setText("버튼1을 클릭했습니다.");
				//버튼1 클리하면 메세지를 보여줌
			}
		});

		bt2.addActionListener(new ActionListener() {// 익명의객체생성

			@Override
			public void actionPerformed(ActionEvent e) {
				confirmExit();
			}
		});
		//파일읽기 작업 처리
		JOptionPane.showMessageDialog(this, 
				"파일을 읽었습니다!", "파일읽기", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void confirmExit() {
		int answer = JOptionPane.showConfirmDialog(this, 
				"종료하시겠습니까?","confirm",JOptionPane.YES_NO_OPTION);
		if(answer==JOptionPane.YES_OPTION) { //사용자가 yes를 눌렀을경우
			System.out.println("프로그램을 종료합니다.");
			//파일로 객체를 보내는 일 처리
			System.exit(0);
		}else { //사용자가 yes 이외의 값을 눌렀을 경우.
			System.out.println("종료를 취소합니다.");
			lbState.setText("취소했습니다.");
		}
	}
	
	public static void main(String[] args) {
		new Mywin(); // 생성자가 실행
	}

}
