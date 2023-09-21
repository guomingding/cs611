public class TicTacToe extends GameManager {
    public TicTacToe(Board board) {
        super(board);
    }

    @Override
    public char checkWin() {
        char[] boardTemp = board.getBoard();
        // Check rows and columns
        for (int i = 0; i < size; i++) {
            // Check rows return when win
            if (checkRow(boardTemp, i)) {
                return boardTemp[i * size];
            }

            // Check columns return when win
            if (checkColumn(boardTemp, i)) {
                return boardTemp[i];
            }
        }

        // Check diagonals
        if (checkDiagonal(boardTemp)) {
            return boardTemp[0]; // Diagonal (top-left to bottom-right) win
        }
        if (checkReverseDiagonal(boardTemp)) {
            return boardTemp[size - 1]; // Diagonal (top-right to bottom-left) win
        }

        // No win yet
        return ' ';
    }

    private boolean checkRow(char[] boardTemp, int row) {
        char currRow = boardTemp[row * size];
        if (currRow == ' ') {
            return false;
        }
        for (int col = 1; col < size; col++) {
            if (boardTemp[row * size + col] != currRow) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(char[] boardTemp, int col) {
        char currCol = boardTemp[col];
        if (currCol == ' ') {
            return false;
        }
        for (int row = 1; row < size; row++) {
            if (boardTemp[row * size + col] != currCol) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagonal(char[] boardTemp) {
        char firstCell = boardTemp[0];
        if (firstCell == ' ') {
            return false; // The diagonal is empty, no win possible
        }
        for (int i = 1; i < size; i++) {
            if (boardTemp[i * size + i] != firstCell) {
                return false;
            }
        }
        return true;
    }

    private boolean checkReverseDiagonal(char[] boardTemp) {
        char firstCell = boardTemp[size - 1];
        if (firstCell == ' ') {
            return false; // The reverse diagonal is empty, no win possible
        }
        for (int i = 1; i < size; i++) {
            if (boardTemp[i * size + (size - 1 - i)] != firstCell) {
                return false;
            }
        }
        return true;
    }


}
