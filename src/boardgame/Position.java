package boardgame;

public class Position {

	private int row;
	private int column;
	
	public Position() {
		
	}

	public Position(int row, int colunm) {
		this.row = row;
		this.column = colunm;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int colunm) {
		this.column = colunm;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
