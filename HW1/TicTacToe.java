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
        if (checkDiagTopLeftBottomRight(boardTemp)) {
            return boardTemp[0]; // Diagonal (top-left to bottom-right) win
        }
        if (checkDiagTopRightBottomLeft(boardTemp)) {
            return boardTemp[size - 1]; // Diagonal (top-right to bottom-left) win
        }
        return ' ';
    }

    private boolean checkRow(char[] boardTemp, int row) {
        char currCell = boardTemp[row * size];
        if (currCell == ' ') {
            return false;
        }

        for (int col = 1; col < size; col++) {
            if (boardTemp[row * size + col] != currCell) {
                return false;
            }
        }
        return true;
    }

    private boolean checkColumn(char[] boardTemp, int col) {
        char currCell = boardTemp[col];
        if (currCell == ' ') {
            return false;
        }
        for (int row = 1; row < size; row++) {
            if (boardTemp[row * size + col] != currCell) {
                return false;
            }
        }
        return true;
    }

    
    private boolean checkDiagTopLeftBottomRight(char[] boardTemp) {
        char currCell = boardTemp[0];
        if (currCell == ' ') {
            return false;
        }
        for (int i = 1; i < size; i++) {
            if (boardTemp[i * size + i] != currCell) {
                return false;
            }
        }
        return true;
    }

    private boolean checkDiagTopRightBottomLeft(char[] boardTemp) {
        char currCell = boardTemp[size - 1];
        if (currCell == ' ') {
            return false;
        }
        for (int i = 1; i < size; i++) {
            if (boardTemp[i * size + (size - 1 - i)] != currCell) {
                return false;
            }
        }
        return true;
    }
}
