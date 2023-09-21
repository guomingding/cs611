public class TicTacToe extends GameManager {
    //this is the class for Tic Tac Toe game logic 
    public TicTacToe(Board board) {
        super(board);
    }
    
    @Override
    public char checkWin() {
        char[] boardTemp = board.getBoard();
        //check rows and columns
        for (int i = 0; i < size; i++) {
            //check rows
            if (boardTemp[i * size] != ' ') {
                char rowSign = boardTemp[i * size];
                boolean rowWin = true;
                for (int j = 1; j < size; j++) {
                    if (boardTemp[i * size + j] != rowSign) {
                        rowWin = false;
                        break;
                    }
                }
                if (rowWin) {
                    return rowSign;
                }
            }
            //check columns
            if (boardTemp[i] != ' ') {
                char colSign = boardTemp[i];
                boolean colWin = true;
                for (int j = 1; j < size; j++) {
                    if (boardTemp[j * size + i] != colSign) {
                        colWin = false;
                        break;
                    }
                }
                if (colWin) {
                    return colSign;
                }
            }
        }

        //check diagonals
        if (boardTemp[0] != ' ' && boardTemp[0] == boardTemp[size * size - 1] 
                && boardTemp[0] == boardTemp[size + 1]) {
            return boardTemp[0]; // Diagonal (top-left to bottom-right) win
        }
        if (boardTemp[size - 1] != ' ' && boardTemp[size - 1] == boardTemp[size * 2 - 2] 
                && boardTemp[size - 1] == boardTemp[size * 3 - 3]) {
            return boardTemp[size - 1]; // Diagonal (top-right to bottom-left) win
        }

        // No win yet
        return ' ';
    }
}
