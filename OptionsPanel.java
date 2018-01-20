package tictactoe;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class OptionsPanel extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public JTextField p1;
	public JTextField p2;
	
	public OptionsPanel() {
		this.setLayout(new GridLayout(4, 1));
		this.setPreferredSize(new Dimension(180,800));
		
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		
		p1 = new JTextField("Player 1");
		p1.setHorizontalAlignment(SwingConstants.CENTER);
		p1.setFont(font1);
		p1.setBackground(Color.cyan);
		p1.setForeground(Color.white);
		p1.setEditable(false);
		p1.setBorder(null);
		this.add(p1);
		p1.addActionListener(this);
		
		p2 = new JTextField("Player 2");
		p2.setHorizontalAlignment(SwingConstants.CENTER);
		p2.setFont(font1);
		p2.setBackground(Color.pink);
		p2.setForeground(Color.white);
		p2.setEditable(false);
		p2.setBorder(null);
		this.add(p2);
		p2.addActionListener(this);
		
		JButton restart = new JButton("Restart");
		restart.setBackground(Color.pink);
		restart.setForeground(Color.white);
		restart.setFont(font1);
		this.add(restart);
		restart.addActionListener(this);
		
		JButton exit = new JButton("Exit");
		exit.setBackground(Color.pink);
		exit.setForeground(Color.white);
		exit.setFont(font1);
		this.add(exit);
		exit.addActionListener(this);
		
	}
	public void switchPlayers() {
		if (this.p1.getBackground() == Color.cyan) {
			p1.setBackground(Color.pink);
			p2.setBackground(Color.cyan);
		}
		else if (this.p1.getBackground() == Color.pink) {
			p1.setBackground(Color.cyan);
			p2.setBackground(Color.pink);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
