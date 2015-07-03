package Swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setSize(600, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 우측 상단 창닫기 버튼
		setTitle("스윙예제");
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // 툴킷의 객체를 생성
		Dimension dim = toolkit.getScreenSize(); // 스윙객체가 보여지는 위치 선정
		
		// 패널 생성
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		// 패널 색상 변경
		panel.setBackground(Color.GREEN);
		panelA.setBackground(Color.BLUE);
		panelB.setBackground(Color.YELLOW);
		
		// 레이블 객체 생성
		JLabel label = new JLabel("MVC 모델의 역할 분담");
		panelA.add(label);
		
		// 버튼 객체 생성
		JButton button1 = new JButton("Model : 자바");
		JButton button2 = new JButton("View : JSP");
		JButton button3 = new JButton("Controller : 써블릿");
		JButton button4 = new JButton("(+) Database : 오라클");
		
		// 패널에 버튼을 추가
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		panelB.add(button4);

		// 패널에 패널A 와 패널B 를 설치
		panel.add(panelA);
		panel.add(panelB);
		
		// 프레임의 패널을 설치
		add(panel);
		setLocation(dim.width/2, dim.width/2); // 화면 중앙 근처에 위치 시킴
		setVisible(true);
		
	}
}
