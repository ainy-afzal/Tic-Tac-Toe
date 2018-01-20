package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class PlayerTwoStrategy extends PlayerStrategy{
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("pressed " + e.getActionCommand());
		JButton source = (JButton) e.getSource();
		board.getGame().incrementMove(e.getActionCommand());
		source.setBackground(Color.cyan);
		source.setText("O");
		source.setEnabled(false);
		board.getGame().changePlayer();
		board.setStrategy("PlayerOne", buttons);
		
	}

}
