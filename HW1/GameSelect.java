public class GameSelect {
    public static int chooseGame() {
        //prompt out welcome message and game menu.
        int choice;
        welcomePrintOut();
        while (true) {
            if (GameInit.kb.hasNextInt()) {
                choice = GameInit.kb.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                } else {
                    Board.clearScreen();
                    System.out.println("Invalid choice. Please select again.");
                    welcomePrintOut();
                }
            }else{
                Board.clearScreen();
                System.out.println("Invalid choice. Please select again.");
                welcomePrintOut();
                GameInit.kb.next();
            }
        }
        return choice; 
    }

    //Game selection menu
    public static void welcomePrintOut(){
        System.out.println("Hi welcome, please choose the game you want to play:"
                + "\n1. Tic Tac Toe"
                + "\n2. Order and Chaos"
                + "\n3. Exit");
    }
}
