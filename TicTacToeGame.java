package workshop;
import java.util.Scanner;
public class TicTacToeGame 
{
//UC-1 Create TictacToe Board
	public static char[] board() 
	{
		char board_shell[]=new char[10];
		for(int index=1;index<board_shell.length;index++) 
		{
			board_shell[index]=' ';
		}
		return board_shell;
	}
	static Scanner choice=new Scanner(System.in);
//UC-2 Player Choosing the Letter
	public static void  playerchoice() 
	{
		System.out.println("Enter your choice"
				+ "X or"
				+ "O");
		char value=choice.next().charAt(0);
		if(value=='X')
			System.out.println("players choice is X");
		else
			System.out.println("Computer choice will be O");
	}
}
