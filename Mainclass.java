package workshop;

public class Mainclass extends TicTacToeGame {

	//private char[] getboard_cell;

	public static void main(String[] args) {
		TicTacToeGame.board();
		TicTacToeGame.playerchoice();
		TicTacToeGame.displayBoard(TicTacToeGame.board());
	}

}
