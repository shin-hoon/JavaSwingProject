package com.boram.shopping.view;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPage{
	public void start() {
		JFrame frame = new JFrame();
		frame.setTitle("Boram닷컴");
		frame.setBounds(600,0,1018,900);  //  600윈도우 위치 x , 윈도우 위치 y , 컨테이너 x , 컨테이너 y 418,900
		frame.setLayout(null);
		
		JPanel mainMenu = new JPanel();
		mainMenu.setBounds(-50,30,1000,400);
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
        JLabel label = new JLabel(new ImageIcon(image));
        JLabel label2 = new JLabel(new ImageIcon(image2));
        
        mainMenu.add(label);
        mainMenu.add(label2);
        frame.add(mainMenu);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

