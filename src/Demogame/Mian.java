package Demogame;

import javax.swing.JFrame;

public class Mian {

	public static void main(String[] args)
	{
		JFrame obj = new JFrame();
		
		Gameplay gamePlay =  new Gameplay();
		
		obj.setBounds(10, 10, 700, 800);
		obj.setTitle("Brick Breaker Game");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
	}

}
