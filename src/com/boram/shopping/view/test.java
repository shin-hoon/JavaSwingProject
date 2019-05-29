package com.boram.shopping.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class test extends JPanel {
	// Panel 리턴
	public JPanel aaa() {
		return this;
	}
	/**
	 * Create the panel.
	 */
	public test() {
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.RED);
		panel.setBounds(78, 91, 184, 112);
		add(panel);
		
		JLabel lblPppppppppp = new JLabel("pppppppppp");
		lblPppppppppp.setBounds(85, 246, 62, 18);
		add(lblPppppppppp);
		setVisible(true);
/*		
		 본인 페이지에서 화면전환 하고 싶은 경우
		 MainView.setMainPage(new 클래스명.getPanel()); 코드 한줄 추가하면 된다.
		 getPanel()은 해당 클래스에서 JPanel을 반환하는 메소드를 작성 해 놓는다.
*/		 
	}
}
