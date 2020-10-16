package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {

	//Variables
	private Color color;
	private int moveCount;
	
	//Constructors
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//Getters & Setters
	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	//Custom Methods
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
	public void increaseMoveCount() {
		moveCount++;
	}
	
	public void decreaseMoveCount() {
		moveCount--;
	}

}
