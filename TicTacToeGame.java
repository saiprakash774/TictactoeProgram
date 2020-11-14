package workshop;
import java.util.Scanner;
class TicTacToeGame 
{
//UC-1 Create TictacToe Board
	static char [] board_cell=new char[10];
	public char[] board() 
	{
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
	public void  playerchoice() 
	{
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
	public void displayBoard() {
		System.out.println("Displaying TicTacToe Board");
		for(int index1=1;index1<board_cell.length;index1=index1+3) {
			System.out.println("|"+board_cell[index1]+"|"+board_cell[index1+1]+"|"+board_cell[index1+2]);
			System.out.println(" ------------");
		}	
	}
 //UC-4 Play the game and display pararllely
	static Scanner cellnumber = new Scanner(System.in); 
	private static int userturn = 0;
	private static int computerturn=0;
	private static int result=0;
	public  void playgame() 
	{
		while(userturn<5) 
		{
			while(userturn<=5) 
			{
				System.out.println("Enter the cell number to place your key"+player);
				int cell_value=cellnumber.nextInt();
				if(board_cell[cell_value]==' ') {
					board_cell[cell_value]=player;	
					displayBoard();
					winnerdeclare();
					if(result==1)
						throw new ArithmeticException("winner is declared");
					userturn++;
					break;
				}
				else
				{
					System.out.println(" cell is already filled or invalid cell number entered");
				}
			}
			while(computerturn<4) 
			{
				int cell_value=(int)Math.floor((Math.random()*10)+1)%10;
				if(board_cell[cell_value]==' ') 
				{
					board_cell[cell_value]=computer;
					displayBoard();
					winnerdeclare();
					if(result==1)
						throw new ArithmeticException("winner is declared");
					computerturn++;
					 break;
				}
			}
		}
		if(result==0)
			System.out.println("Game is Draw");
	}
	
	public void winnerdeclare() 
	{
	row_check();	
	column_check();
	daigonal_check();
	}
	private static void row_check()
	{
		for(int index=1;index<board_cell.length;index=index+3) 
		{
			if(board_cell[index]==player && board_cell[index+1]==player && board_cell[index+2]==player) 
			{
				System.out.println(player+" is winner");
				result=1;
				break;
			}
			else if(board_cell[index]==computer && board_cell[index+1]==computer && board_cell[index+2]==computer)
			{
				System.out.println(computer+" is winner");
				result=1;
				break;
			}
		}
	}
	private static void column_check() 
	{
		for(int index=1;index<=3;index++) {
			if(board_cell[index]==player && board_cell[index+3]==player && board_cell[index+6]==player) 
			{
				System.out.println(player+" is winner");
				result=1;
				break;
			}
			else if(board_cell[index]==computer && board_cell[index+3]==computer && board_cell[index+6]==computer)
			{
				System.out.println(computer+" is winner");
				result=1;
				break;
			}	
		}	
	}
	private static void daigonal_check() 
	{
		if(board_cell[1]==player && board_cell[5]==player && board_cell[9]==player || board_cell[3]==player && board_cell[5]==player && board_cell[7]==player)
		{
			System.out.println(player+" is winner");
			result=1;
		}
		else if(board_cell[1]==computer && board_cell[5]==computer && board_cell[9]==computer||board_cell[3]==computer && board_cell[5]==computer && board_cell[7]==computer) 
		{
			System.out.println(computer+" is winner");
			result=1;
		}
	}
}
