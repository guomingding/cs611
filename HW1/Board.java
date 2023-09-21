public class Board {
    /*
    Boad handle all the board related function, which include print out 
    the board and initalize the board and etc.
    */
    public static Object clearTerminal;
    private char[] board;
    private int size;
    private int totalPosition;

    //create board with size that user given
    public Board(int size) {
        this.size = size;
        this.board = new char[size*size];
        this.totalPosition = size * size;
        createBoard();
    }

    //create new board
    private void createBoard() {
        for (int i = 0; i < size*size; i++) {
                board[i] = ' ';
        }
    }

    //print out board
    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int pos = i * size + j;
                System.out.print(board[pos]);
                if (j < size - 1)
                    System.out.print("|");
            }
            System.out.println();
            if (i < size - 1) {
                for (int x = 0; x < size; x++) {
                    System.out.print("-");
                    if (x<size-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    //clear terminal to keep the output easy to read
    public static void clearScreen(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    //check if the board is full
    public boolean checkBoardFull() {
        return totalPosition == 0;
    }

    //return size of the board
    public int getSize(){
        return size;
    }

    //return the board
    public char[] getBoard(){
        return board;
    }


}