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
//UC-2 Player Choosing the Letter
	public static void  playerchoice() 
	{
		char computer;
		while(true) 
		{
			System.out.println("Enter your choice X or O ");
			char player=choice.next().toUpperCase().charAt(0);
			if(player=='X')
			{
				computer='O';
				System.out.println("players choice is "+player+" and Computer choice is " +computer);
				break;
			}
			else if(player=='O') 
			{
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
}
