package workshop;

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
}
