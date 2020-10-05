package boardgame;

public class Position {

	//Variables
	private int row;
	private int column;
	
	//Constructor Start
	public Position() {
	}
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	//Constructor End
	
	//Getters & Setters Start
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	//Getters & Setters End
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
}
