package boardgame;

public class Piece {

	//Variables
	private Board board;
	
	protected Position position;
	
	//Constructor Start
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	//Constructor End

}
