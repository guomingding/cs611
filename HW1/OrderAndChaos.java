public class OrderAndChaos extends GameManager {
    private static final int WINNING_PATTERN_LENGTH = 5; // Define the winning pattern length
    public OrderAndChaos(Board board) {
        super(board);
    }

    @Override
    public char checkWin() {
        char[] boardTemp = board.getBoard();

        // Check for Order (O) win
        if (checkPattern(boardTemp, 'O')) {
            return 'O'; // Order (O) wins
        }

        // Check for Chaos (X) win
        if (checkPattern(boardTemp, 'X')) {
            return 'X'; // Chaos (X) wins
        }

        // Check for a draw
        if (isBoardFull()) {
            return 'D'; // It's a draw
        }

        return ' '; // No win or draw yet
    }

    private boolean checkPattern(char[] boardTemp, char player) {
        // Check rows and columns for a winning pattern
        for (int i = 0; i < size; i++) {
            if (checkRow(boardTemp, player, i) || checkColumn(boardTemp, player, i)) {
                return true;
            }
        }

        // Check diagonals for a winning pattern
        return checkDiagonal(boardTemp, player);
    }

    private boolean checkRow(char[] boardTemp, char player, int row) {
        int consecutiveCount = 0; // Count consecutive pieces

        for (int col = 0; col < size; col++) {
            if (boardTemp[row * size + col] == player) {
                consecutiveCount++;
                if (consecutiveCount == WINNING_PATTERN_LENGTH) {
                    return true;
                }
            } else {
                consecutiveCount = 0; // Reset the count if not consecutive
            }
        }
        return false;
    }

    private boolean checkColumn(char[] boardTemp, char player, int col) {
        int consecutiveCount = 0; // Count consecutive pieces

        for (int row = 0; row < size; row++) {
            if (boardTemp[row * size + col] == player) {
                consecutiveCount++;
                if (consecutiveCount == WINNING_PATTERN_LENGTH) {
                    return true;
                }
            } else {
                consecutiveCount = 0; // Reset the count if not consecutive
            }
        }
        return false;
    }

    private boolean checkDiagonal(char[] boardTemp, char player) {
        // Check top-left to bottom-right diagonal
        for (int i = 0; i <= size - WINNING_PATTERN_LENGTH; i++) {
            for (int j = 0; j <= size - WINNING_PATTERN_LENGTH; j++) {
                boolean diagonalWin = true;
                for (int k = 0; k < WINNING_PATTERN_LENGTH; k++) {
                    if (boardTemp[(i + k) * size + (j + k)] != player) {
                        diagonalWin = false;
                        break;
                    }
                }
                if (diagonalWin) {
                    return true;
                }
            }
        }

        // Check top-right to bottom-left diagonal
        for (int i = 0; i <= size - WINNING_PATTERN_LENGTH; i++) {
            for (int j = WINNING_PATTERN_LENGTH - 1; j < size; j++) {
                boolean diagonalWin = true;
                for (int k = 0; k < WINNING_PATTERN_LENGTH; k++) {
                    if (boardTemp[(i + k) * size + (j - k)] != player) {
                        diagonalWin = false;
                        break;
                    }
                }
                if (diagonalWin) {
                    return true;
                }
            }
        }
        return false;
    }
}
