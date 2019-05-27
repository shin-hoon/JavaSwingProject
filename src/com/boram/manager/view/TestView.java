package com.boram.manager.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JPanel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class TestView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	public void run() {
		try {
			TestView window = new TestView();
			window.frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public TestView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 745, 691);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("\uAD00\uB9AC\uC790 \uD398\uC774\uC9C0");
		label_1.setFont(new Font("±¼¸²Ã¼", Font.BOLD | Font.ITALIC, 20));
		label_1.setBounds(249, 34, 153, 67);
		frame.getContentPane().add(label_1);
		
		JPanel searchMember = new JPanel();
		searchMember.setBounds(155, 100, 343, 67);
		frame.getContentPane().add(searchMember);
		
		JLabel LsearchMember = new JLabel("1. \uD68C\uC6D0\uC815\uBCF4 \uC870\uD68C");
		searchMember.add(LsearchMember);
		
		JPanel insertProduct = new JPanel();
		insertProduct.setBounds(155, 179, 343, 67);
		frame.getContentPane().add(insertProduct);
		
		JLabel LinsertProduct = new JLabel("2. \uBB3C\uD488\uB4F1\uB85D");
		insertProduct.add(LinsertProduct);
		
		JPanel manageProduct = new JPanel();
		manageProduct.setBounds(155, 261, 343, 67);
		frame.getContentPane().add(manageProduct);
		
		JLabel LmanageProduct = new JLabel("3.\uC81C\uD488\uAD00\uB9AC");
		manageProduct.add(LmanageProduct);
		
		JPanel analysis = new JPanel();
		analysis.setBounds(155, 343, 343, 67);
		frame.getContentPane().add(analysis);
		
		JLabel Lanalysis = new JLabel("4. \uD310\uB9E4 \uBD84\uC11D");
		analysis.add(Lanalysis);
		
		JPanel salesState = new JPanel();
		salesState.setBounds(155, 425, 343, 67);
		frame.getContentPane().add(salesState);
		
		JLabel LsalesState = new JLabel("5. \uD310\uB9E4\uD604\uD669");
		salesState.add(LsalesState);
		
		frame.setVisible(true);
		
		
		searchMember.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
			
		});
		insertProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
			
		});
		manageProduct.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
			
		});
		analysis.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			}
			
		});
		salesState.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
			
		});
		
		
		
		
	}
}
