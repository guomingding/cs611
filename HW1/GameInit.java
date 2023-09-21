import java.util.Scanner;

public class GameInit {
    static Scanner kb = new Scanner(System.in);

    public static void initGame(int choice) {
        // initGame switch initalize the game base on user input.
        GameManager game;
        char uPlayer;
        switch (choice) {
            case 1:
                Board.clearScreen();
                System.out.println("Welcome to Tic Tac Toe.");
                game = new TicTacToe(new Board(getBoardSize()));
                uPlayer = playerSymbol();
                startGame(game, uPlayer);
                break;
            case 2:
                System.out.println("Welcome to Order And Chaos");
                game = new OrderAndChaos(new Board(6));
                uPlayer = 'X';
                startGame(game, uPlayer);
                break;
            case 3:
                return;
            default:
                System.out.println("Invaliud choice, please try again.");
                return;
        }
    }

    private static int getBoardSize() {
        // prompt to ask user for size of the board they want to game on.
        //Scanner kb = new Scanner(System.in);
        int size;
        System.out.println("Enter the size of the board you want"
                + "to play on, for example 3 for 3x3 board:");
        while (true) {
            size = kb.nextInt();
            if (size >= 3) {
                break;
            } else {
                System.out.println("Invalid board size. Board size should be at least 3.");
            }
        }
        return size;
    }

    private static char playerSymbol() {
        // prompt to ask user to choice which symobol they want to game with.
        //Scanner kb = new Scanner(System.in);
        char symbol;
        System.out.println("Please select which symbol you want to play with 'X' or 'O'");
        while (true) {
            symbol = kb.next().charAt(0);
            if (symbol == 'X' || symbol == 'O') {
                return symbol;
            }else if(symbol == 'x' || symbol == 'o'){
                symbol = Character.toUpperCase(symbol);
                return symbol;
            }else {
                System.out.println("Invalid choice, please enter again.");
            }
        }
    }

    private static void startGame(GameManager gameManger, char player) {
        // check win for current player after each position input.
        //Scanner kb = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            gameManger.printBoard();
            System.out.println("Player " + player + " please enter the your move."
                    + " For example: 0 1 for 1st row 2nd column:");
            int row = -1;
            int col = -1;
            boolean validMove = false;
            //if the position is taken, user will prompt to enter another position
            while (!validMove) {
                row = kb.nextInt();
                col = kb.nextInt();

                if (gameManger.makeMove(row, col, player)) {
                    validMove = true;
                } else {
                    Board.clearScreen();
                    System.out.println("Invalid move, please try again.");
                    gameManger.printBoard();
                }
            }
            Board.clearScreen();
            System.out.println("Player " + player + " select (" + row + "," + col + ")");
            char win = gameManger.checkWin();
            if (win != ' ') {
                gameManger.printBoard();
                System.out.println("Player " + player + " win!\nPlay other game or retry,"
                        + " please restart the program.");
                end = true;
            } else if (gameManger.isBoardFull()) {
                gameManger.printBoard();
                System.out.println("Draw!");
                end = true;
            } else {
                if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                }
            }
        }
        kb.close();
    }
}
