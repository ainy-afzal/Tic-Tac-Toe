package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



public class Game extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Game();
			}
		});
	}
	
	
	private Board board;
	private OptionsPanel options;
	private JFrame frame;
	
	public String[] one;
	public String[] two;
	
	
	
	public int oneMoves;
	public int twoMoves;
	
	public String[] firstRow;
	public String[] secondRow;
	public String[] thirdRow;
	
	public String[] firstColunm;
	public String[] secondColunm;
	public String[] thirdColunm;
	
	public String[] diagonal;
	
	public int fr;
	public int sr;
	public int tr;
	
	public int fc;
	public int sc;
	public int tc;
	
	public int d;
	
	
	public Game() {
		this.options = new OptionsPanel();
		this.board = new Board(this);
		
		one = new String[9];
		two = new String[9];
		
		oneMoves = 0;
		twoMoves = 0;
		
		firstRow = new String[3];
		secondRow = new String[3];
		thirdRow = new String[3];;
		
		firstColunm = new String[3];
		secondColunm = new String[3];
		thirdColunm = new String[3];
		
		diagonal = new String[3];
		
		fr = 0;
		sr = 0;
		tr = 0;
		
		fc = 0;
		sc = 0;
		tc = 0;
		
		d = 0;
		
		frame = new JFrame("Graphics Panel"); // Frame with title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout());
		frame.setBackground(Color.white);
		frame.setPreferredSize(new Dimension(1000,850));
		frame.getContentPane().add(this.board, BorderLayout.CENTER);
		frame.getContentPane().add(this.options, BorderLayout.WEST);
		frame.pack();

		//frame.setSize(500,600);
		frame.setResizable(false);
		frame.setVisible(true);
	}
	public String getStrategy() {
		return board.getStrategy();
	}
	public void changePlayer() {
		this.options.switchPlayers();
	}

	public void incrementMove(String position) {

		
		
		if (board.getStrategy() == "PlayerOne") {
			oneMoves++;
			System.out.println(oneMoves);
			one[oneMoves] = position;
			
			System.out.println(one[1].substring(0, 1));

			for(int i = 1; i <= oneMoves; i++) {
				if(one[i].substring(0, 1) == "1") {
					fr++;
					
					System.out.println(fr);
				}
				if(one[i].substring(0, 1) == "2") {
					sr++;
				}
				if(one[i].substring(0, 1) == "3") {
					tr++;
				}
				if(one[i].substring(1) == "1") {
					fc++;
				}
				if(one[i].substring(1) == "2") {
					sc++;
				}
				if(one[i].substring(1) == "3") {
					tc++;
				}
				if(one[i].substring(0, 1) == one[i].substring(1)) {
					d++;
				}
				
			}
			if (fr == 3 || sr == 3 || tr == 3 || fc == 3 || sc == 3 || tc == 3|| d == 3 ) {
				System.out.println("player 1 won!");
			}
			
		}
		else if(board.getStrategy() == "PlayerTwo") {
			twoMoves++;
			two[twoMoves] = position;
			
			for(int i = 1; i <= twoMoves; i ++) {
				if(two[i].substring(0, 1) == "1") {
					fr++;
				}
				if(two[i].substring(0, 1) == "2") {
					sr++;
				}
				if(two[i].substring(0, 1) == "3") {
					tr++;
				}
				if(two[i].substring(1) == "1") {
					fc++;
				}
				if(two[i].substring(1) == "2") {
					sc++;
				}
				if(two[i].substring(1) == "3") {
					tc++;
				}
				if(two[i].substring(0, 1) == one[i].substring(1)) {
					d++;
				}
			}
			
			if (fr == 3 || sr == 3 || tr == 3 || fc == 3 || sc == 3 || tc == 3|| d == 3 ) {
				System.out.println("player 2 won!");
			}
			
			
		}
		fr = 0; sr = 0; tr = 0; fc = 0; sc = 0; tc = 0; d = 0;
		
	}
	/*
	 * Possible winning combinations:
	 * 
	 * 11 12 13
	 * 21 22 23
	 * 31 32 33
	 * 
	 * 
	 */
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
