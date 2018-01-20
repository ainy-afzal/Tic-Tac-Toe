package tictactoe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class PlayerStrategy implements ActionListener  {
	protected Board board; // so our subclasses can access this
	protected JButton  label;
	JButton[] buttons = new JButton[9];

	public void install(JButton[] buttons, Board board) {
		this.board = board;
		this.buttons=buttons;
		int i = 0;
		while (i != 9) {
			buttons[i].addActionListener(this);
			i++;
		}
	}
	
	public void uninstall() {
		int i = 0;
		while (i != 9) {
			buttons[i].removeActionListener(this);
			i++;
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("kk");
		
		
	}

}
