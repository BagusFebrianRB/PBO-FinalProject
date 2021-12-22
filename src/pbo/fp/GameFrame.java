package pbo.fp;

import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	GameFrame(){
		panel = new GamePanel();
		this.add(panel);
		this.setTitle("Paddle Pong");
		this.setResizable(false);
		this.setBackground(Color.DARK_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}