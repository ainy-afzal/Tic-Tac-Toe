package tictactoe;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class PlayerOneStrategy extends PlayerStrategy {
	//Game game = board.getGame();
	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("pressed " + e.getActionCommand());
		JButton source = (JButton) e.getSource();
		
		source.setBackground(Color.pink);
		source.setText("X");
		source.setEnabled(false);
		//game.changePlayer();
		board.getGame().incrementMove(e.getActionCommand());
		board.getGame().changePlayer();
		board.setStrategy("PlayerTwo", buttons);
		
	}

}
