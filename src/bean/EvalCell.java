/**
 * 
 */
package bean;

/**
 * Lượng giá một ô(Evaluated Cell) trong hàm lượng giá
 */
public class EvalCell {
	private Cell cell;
	private int value;

	public EvalCell() {
		cell = new Cell();
		value = 0;
	}

	public EvalCell(Cell cell, int value) {
		this.cell = cell;
		this.value = value;
	}

	public EvalCell(int x, int y, int value) {
		this.cell = new Cell(x, y);
		this.value = value;
	}

	public Cell getCell() {
		return this.cell;
	}

	public int getX() {
		return this.cell.getX();
	}

	public int getY() {
		return this.cell.getY();
	}

	public int getValue() {
		return this.value;
	}

}
