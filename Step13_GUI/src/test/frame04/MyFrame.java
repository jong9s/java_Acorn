package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	// 버튼의 참조값을 담을 필드
	JButton countBtn;
	// 버튼을 누른 횟수를 저장할 필드
	int count = 0;
	
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		this.countBtn = new JButton("0");
		add(countBtn);
		// 버튼의 setText() 메소드를 이용하면 버튼에 출력된 문자열을 변경할 수 있다.

		countBtn.addActionListener(this);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new MyFrame();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼의 text 를 변경하려면 생성자에서 new JButton() 했던 참조값을 여기서 사용할 수 있어야 한다.
		// 필드로 countBtn 을 생성하면 된다.
		// count 값을 1 증가 시킨다
		count++;
		countBtn.setText(Integer.toString(count));
	}
}
