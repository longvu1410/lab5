package lab_5;

public class Task2 {
	private static final char EMPTY = ' ';
	private char[][] board;
	//

	public boolean checkRows() {
	    for (int row = 0; row < 3; row++) {
	        if (board[row][0] != EMPTY && board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
	            return true; // All cells in the row are marked by the same player
	        }
	    }
	    return false; // No row has all cells marked by the same player
	}
	/*
	* This method checks all columns and returns true if any 
	of them are marked
	* with all of a single player's.
	* Otherwise, returns false.
	*/
	public boolean checkColumns() {
	//TODO
		for(int col =0; col< 3;col++) {
			if(board[0][col] != EMPTY && board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
				return true;
			}
		}
	return false;
	}
	public boolean checkDiagonals() {
	    // Check top-left to bottom-right diagonal
	    if (board[0][0] != EMPTY && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
	        return true; // Đường chéo từ trái trên xuống phải có tất cả ô được đánh dấu bởi cùng một người chơi
	    }

	    // Check bottom-left to top-right diagonal
	    if (board[2][0] != EMPTY && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
	        return true; // Đường chéo từ trái dưới lên trên phải có tất cả ô được đánh dấu bởi cùng một người chơi
	    }

	    return false; // Không có đường chéo nào có tất cả ô được đánh dấu bởi cùng một người chơi
	}

}
