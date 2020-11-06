package workshop;
import java.util.Scanner;
class TicTacToeGame 
{
//UC-1 Create TictacToe Board
	public static char[] board() 
	{
		char [] board_cell=new char[10];
		for(int index=1;index<board_cell.length;index++) 
		{
			board_cell[index]=' ';
		}
		return board_cell;
	}
	static Scanner choice=new Scanner(System.in);
	private static char player;
	private static char computer;
//UC-2 Player Choosing the Letter
	public static void  playerchoice() 
	{
	// 	char computer;
		while(true) 
		{
			System.out.println("Enter your choice X or O ");
			char value=choice.next().toUpperCase().charAt(0);
			if(value=='X')
			{
				player='X';
				computer='O';
				System.out.println("players choice is "+player+" and Computer choice is " +computer);
				return;
			}
			else if(value=='O') 
			{
				player='O';
				computer='X';
				System.out.println(" players choice is "+player+" and Computer choice is " +computer);
				break;
			}
			else
				System.out.println("Invalid Input Enter your choice again");
		}
	}
//UC-3 Displaying Tictactoeboard
	public static void displayBoard(char[] board) {
		System.out.println("Displaying TicTacToe Board");
		for(int index1=1;index1<board.length;index1=index1+3) {
			System.out.println("|"+board[index1]+"|"+board[index1+1]+"|"+board[index1+2]);
			System.out.println(" ------------");
		}	
	}
 //UC-4 Play the game and display pararllely
	static Scanner cellnumber = new Scanner(System.in); 
	static int result=0;
	public static void playgame(char[] board) 
	{
		int userturn = 0;
		int computerturn=0;
		while(computerturn<=4) {
		while(userturn<=5) {
			System.out.println("Enter the cell number to place your key"+player);
			int cell_value=cellnumber.nextInt();
			if(board[cell_value]==' ') {
				//board[cell_value]=TicTacToeGame.player;
				board[cell_value]=player;	
				TicTacToeGame.displayBoard(board);
				userturn++;
				break;
			}
			else
			{
				System.out.println(" cell is already filled or invalid cell number entered");
			}
		}
		while(computerturn<=4) {
		int cell_value=(int)Math.floor((Math.random()*10)+1)%10;
		if(board[cell_value]==' ') {
			board[cell_value]=computer;
			TicTacToeGame.displayBoard(board);
			computerturn++;
			 break;
		}
		}
		}
		
	}
}
