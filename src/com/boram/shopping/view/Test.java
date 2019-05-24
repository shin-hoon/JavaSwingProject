package com.boram.shopping.view;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame {
	JFrame frame;

	public Test() {
		frame = new JFrame();
		frame.setTitle("Boram´åÄÄ");
		frame.setBounds(600,0,706,764);
		
		JPanel mainMenu = new JPanel();
		mainMenu.setBounds(0, 12, 691, 432);
		mainMenu.setVisible(true);
		
	/*	
		JScrollPane scroll = new JScrollPane(mainMenu);
		mainMenu.setPreferredSize(new Dimension(318,5200));		
		add(scroll);
	*/	
		Image image = null;
		Image image2 = null;
		
        try {
            URL url = new URL("https://m.mutnam.com/web/product/medium/201905/fc7e31fe79e7108dfc8882cfba71da4d.gif");
            URL ur2 = new URL("https://m.mutnam.com/web/product/medium/201905/0c774c7b53fa9f91cd60ccb96502a97e.gif");
            image = ImageIO.read(url);
            image2 = ImageIO.read(ur2);
        } catch (IOException e) {
        	System.out.println(e.getMessage());
        }
        frame.getContentPane().setLayout(null);
        JLabel label = new JLabel(new ImageIcon(image));
        label.setBounds(14, 5, 322, 427);
        JLabel label2 = new JLabel(new ImageIcon(image2));
        label2.setBounds(363, 5, 322, 421);
        mainMenu.setLayout(null);
        
        mainMenu.add(label);
        mainMenu.add(label2);
        frame.getContentPane().add(mainMenu);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
