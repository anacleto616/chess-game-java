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

	public int getColunm() {
		return column;
	}

	public void setColunm(int colunm) {
		this.column = colunm;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
