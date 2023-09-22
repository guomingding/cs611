public class OrderAndChaos extends GameManager {
    private int winCondition = 5; 

    public OrderAndChaos(Board board) {
        super(board);
    }

    @Override
    public char checkWin() {
        char[] boardTemp = board.getBoard();
        for (int i = 0; i<size; i++){
            if(checkRow(boardTemp, 'X', i) ||checkColumn(boardTemp, 'X', i)){
                return 'X';
            }
        }
        if (checkDiagTopLeftBottomRight(boardTemp, 'X') || checkDiagTopRightBottomLeft(boardTemp, 'X')){
            return 'X';
        }
        return ' ';
    }
    
    //check rows
    private boolean checkRow(char[] boardTemp, char player, int row) {
        int count = 0;

        for (int col = 0; col < size; col++) {
            if (boardTemp[row * size + col] == player) {
                count++;
                if (count == winCondition) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    //check columns
    private boolean checkColumn(char[] boardTemp, char player, int col) {
        int count = 0;

        for (int row = 0; row < size; row++) {
            if (boardTemp[row * size + col] == player) {
                count++;
                if (count == winCondition) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }
    //check every diagonal from top left to bottom right
    private boolean checkDiagTopLeftBottomRight(char[] boardTemp, char player) {
        for (int i = 0; i <= size - winCondition; i++) {
            for (int j = 0; j <= size - winCondition; j++) {
                boolean diagonalWin = true;
                for (int k = 0; k < winCondition; k++) {
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
        return false;
    }

    //check every diagonal from top right to bottom left
    private boolean checkDiagTopRightBottomLeft(char[] boardTemp, char player) {
        for (int i = 0; i <= size - winCondition; i++) {
            for (int j = winCondition - 1; j < size; j++) {
                boolean diagonalWin = true;
                for (int k = 0; k < winCondition; k++) {
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
