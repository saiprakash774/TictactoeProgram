package workshop;

public class Mainclass {
	public static void main(String[] args) {
		TicTacToeGame.board();
		TicTacToeGame.playerchoice();
		TicTacToeGame.displayBoard(TicTacToeGame.board());
		TicTacToeGame.playgame(TicTacToeGame.board());
		TicTacToeGame.winnerdeclare(TicTacToeGame.board());
	}
}
