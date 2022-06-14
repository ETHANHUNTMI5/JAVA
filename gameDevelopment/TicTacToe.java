package gameDevelopment;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TicTacToe extends JFrame implements ActionListener {
	
	public static int BoardSize=3;
	
	public static enum GameStatus 
	{
		Incomplete,Xwins,Zwins,Tie;
	}
	
	private JButton[][] buttons = new JButton[BoardSize][BoardSize];
	boolean crossTurn = true;
	
	public TicTacToe()
	{
		super.setTitle("TicTacToe");
		super.setSize(800,800);
		
		GridLayout grid = new GridLayout(BoardSize,BoardSize);
		
		super.setLayout(grid);
		
		Font font = new Font("New Rocker", 1, 150);
		
		for(int row=0;row<BoardSize;row++)
		{
			for(int col=0;col<BoardSize;col++)
			{
				JButton button= new JButton("");
			
				buttons[row][col]= button;
				button.setFont(font);
				button.addActionListener(this);
				
				super.add(button);
			}
		}
		
		super.setResizable(false);
		super.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton clickedButton = (JButton)e.getSource();
		makeMove(clickedButton);
		GameStatus gs = this.getGameStatus(); 
		if(gs== GameStatus.Incomplete)
		{return;}
		
		declareWinner(gs);
		
		int choice = JOptionPane.showConfirmDialog(this,"Wanna Play Again!!");
		if(choice == JOptionPane.YES_OPTION)
		{
			
			for(int row=0;row<BoardSize;row++)
			{
				for(int col=0;col<BoardSize;col++)
				{
					buttons[row][col].setText("");
				}
			}
			crossTurn=true;
		}
		else
		{super.dispose();}
	}

	private void declareWinner(GameStatus gs) {
		
		if(gs==GameStatus.Xwins)
		{
			JOptionPane.showMessageDialog(this, "X Won!!");
		}
		else if(gs==GameStatus.Zwins)
		{
			JOptionPane.showMessageDialog(this, "0 Won!!");
		}
		
		else
		{JOptionPane.showMessageDialog(this, "Woah . It's a TIE");}
	}

	private GameStatus getGameStatus() {
		String text1="",text2 = "";
		
		int row=0,col=0;
		
		// text inside rows
          row=0;
		while(row<BoardSize)
		{
			col=0;
			while(col<BoardSize-1)
			{
				text1= buttons[row][col].getText();
				text2= buttons[row][col+1].getText();
				
				if(!text1.equals(text2) || text1.length()==0)
				{break;}
				col++;
			}
			if(col==BoardSize-1)
			{
				if(text1.equals("X"))
				{return GameStatus.Xwins;}
				else
				{
					return GameStatus.Zwins;
				}
			}
		
			row++;
		}
		
		// text inside columns
		
	    col=0;
			while(col<BoardSize)
			{
				row=0;
				while(row<BoardSize-1)
				{
					text1= buttons[row][col].getText();
					text2= buttons[row+1][col].getText();
					
					if(!text1.equals(text2) || text1.length()==0)
					{break;}
					row++;
				}
				if(row==BoardSize-1)
				{
					if(text1.equals("X"))
					{return GameStatus.Xwins;}
					else
					{
						return GameStatus.Zwins;
					}
				}
			
				col++;
			}
		
			// diagonal 1
			
			row=0;
			col=0;
			
			while(row<BoardSize-1)
			{
				text1= buttons[row][col].getText();
				text2= buttons[row+1][col+1].getText();
				
				if(!text1.equals(text2) || text1.length()==0)
				{break;}
				row++;
				col++;
				
			}
			if(row==BoardSize-1)
			{
				if(text1.equals("X"))
				{return GameStatus.Xwins;}
				else
				{
					return GameStatus.Zwins;
				}
			}
			
			// diagonal 2
			
			row=BoardSize-1;
			col=0;
			
			while(row>0)
			{
				text1= buttons[row][col].getText();
				text2= buttons[row-1][col+1].getText();
				
				if(!text1.equals(text2) || text1.length()==0)
				{break;}
				row--;
				col++;
				
			}
			if(row==0)
			{
				if(text1.equals("X"))
				{return GameStatus.Xwins;}
				else
				{
					return GameStatus.Zwins;
				}
			}
			
			String txt="";
			
			for(int rr=0;rr<BoardSize;rr++)
			{
				for(int cc=0;cc<BoardSize;cc++)
				{
					txt= buttons[rr][cc].getText();
					if(txt.length()==0)
					{return GameStatus.Incomplete;}
				}
			}
			return GameStatus.Tie;
	}

	private void makeMove(JButton clickedButton) {
		String btntxt = clickedButton.getText();
		
		if(btntxt.length()>0)
		{
			JOptionPane.showMessageDialog(this, "Invalid Move");
		  
		}
		else
		{
			if(crossTurn)
			{clickedButton.setText("X");}
			else
			{clickedButton.setText("0");}
		
		 crossTurn=!crossTurn;
		 }
		
	}

}
