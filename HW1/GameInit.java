import java.util.Scanner;

public class GameInit {
    public static void initGame(int choice) {
        //initGame switch initalize the game base on user input.
        GameManager game;
        switch (choice) {
            case 1:
                Board.clearScreen();
                System.out.println("Welcome to Tic Tac Toe.");
                game = new TicTacToe(new Board(getBoardSize()));
                startGame(game);
            case 2:
                System.out.println("Welcome to Order And Chaos");
                game = new OrderAndChaos(new Board(getBoardSize()));
                startGame(game);
            case 3:
                return;
            default:
                System.out.println("Invaliud choice, please try again.");
                return;
        }
    }

    private static int getBoardSize() {
        //prompt to ask user for size of the board they want to game on.
        Scanner kb = new Scanner(System.in);
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
        kb.close();
        return size;
    }

    private static char playerSymbol() {
        //prompt to ask user to choice which symobol they want to game with.
        Scanner kb = new Scanner(System.in);
        char symbol;

        System.out.println("Please select which symbol you want to play with 'X' or 'O'");
        while (true) {
            symbol = kb.next().charAt(0);
            if (symbol == 'X' || symbol == 'O') {
                kb.close();
                return symbol;
            } else {
                System.out.println("Invalid choice, please enter again.");
            }
        }
    }

    private static void startGame(GameManager game) {
        //check win for current player after each position input.
        char player = playerSymbol();
        Scanner kb = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            game.printBoard();
            int x = kb.nextInt();
            int y = kb.nextInt();
            if (game.makeMove(x, y, player)) {
                Board.clearScreen();
                char win = game.checkWin();
                if (win != ' ') {
                    game.printBoard();
                    System.out.println(player + " Win!");
                    end = true;
                } else if (game.isBoardFull()) {
                    game.printBoard();
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
        }
        kb.close();
    }
}
