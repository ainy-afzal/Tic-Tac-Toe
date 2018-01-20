package tictactoe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Board extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Game game;
	private PlayerStrategy strategy;
	public String s;
	public JButton[] buttons = new JButton[9];
	public String[] labels = {"11", "12", "13", "21", "22", "23", "31", "32", "33"};
	public Board(Game game) {
		this.game = game;
		Font font1 = new Font("SansSerif", Font.BOLD, 120);
		this.setLayout(new GridLayout(3, 3));
		this.setPreferredSize(new Dimension(800,800));
		int i = 0;
		while (i != 9) {
			
			JButton  label = new JButton();
			buttons[i] = label;
			label.setFont(font1);
			label.setActionCommand(labels[i]);
			label.setBackground(Color.white);
			label.setForeground(Color.white);
			this.add(label);
			//label.addActionListener(this);
			i++;
		}
		setStrategy("PlayerOne", buttons);
	}
	void setStrategy(String strategyName, JButton[] buttons){
		s = strategyName;
		if(this.strategy!=null){
			this.strategy.uninstall();
		}
		if (strategyName == "PlayerOne"){
			
			this.strategy = new PlayerOneStrategy();
			this.strategy.install(buttons, this);
				
		}
		if (strategyName == "PlayerTwo"){
			this.strategy = new PlayerTwoStrategy();
			this.strategy.install(buttons, this);
			
		}
		
	}
	public String getStrategy(){
		return s;
		
	}
	public Game getGame(){
		return this.game;
		
	}

/*	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("pressed");
		System.out.println(e.getActionCommand());
		JButton source = (JButton) e.getSource();
		source.setBackground(Color.pink);
		source.setEnabled(false);
		
	}*/

}
