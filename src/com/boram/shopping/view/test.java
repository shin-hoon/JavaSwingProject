package com.boram.shopping.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class test extends JPanel {
	// Panel ����
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
		 ���� ���������� ȭ����ȯ �ϰ� ���� ���
		 MainView.setMainPage(new Ŭ������.getPanel()); �ڵ� ���� �߰��ϸ� �ȴ�.
		 getPanel()�� �ش� Ŭ�������� JPanel�� ��ȯ�ϴ� �޼ҵ带 �ۼ� �� ���´�.
*/		 
	}
}
