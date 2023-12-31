public abstract class GameManager {
    //abstract GameManger allow create different board game with their own set of rules
    protected int size;
    protected Board board;

    public GameManager(Board board){
        this.board = board;
        this.size = board.getSize();
    }
    
    //fill in the position player choose if the position open
    public boolean makeMove(int row, int col, char player) {
        int position = row * size + col;
        //position already taken
        if (row < 0 || row >= size || col < 0 || 
            col >= size || board.getBoard()[position] != ' ') {
                Board.clearScreen();
                System.out.println("Invalid move, please try again.");
            return false;
        }
        //fill in the position with player symbol
        board.getBoard()[position] = player;
        board.totalPosition--;
        return true;
    }

    public abstract char checkWin();

    //check the board is full
    public boolean isBoardFull(){
        return board.checkBoardFull();
    }

    //print board
    public void printBoard(){
        board.printBoard();
    }

}
