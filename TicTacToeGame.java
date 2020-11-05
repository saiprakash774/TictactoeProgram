package workshop;
import java.util.Scanner;
public class TicTacToeGame 
{
//UC-1 Create TictacToe Board
	public static char[] board() 
	{
		char board_cell[]=new char[10];
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
		char player;
		char computer;
		while(true) {
		System.out.println("Enter your choice X or O ");
		char value=choice.next().toUpperCase().charAt(0);
		if(value=='X') 
		{
			player='X';
			computer='O';
			System.out.println("players choice is "+player+" and Computer choice is " +computer);
			break;
		}
		else if(value=='O') {
			player='O';
			computer='X';
			System.out.println(" players choice is "+player+" and Computer choice is " +computer);
			break;
		}
		else
			System.out.println("Invalid Input Enter your choice again");
		}
	}
}
