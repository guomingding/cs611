# CS611-Assignment 1
## Tic Tac Toe
---------------------------------------------------------------------------
Name    Qinfeng Li
Email   ql2016@bu.edu
Student ID  U84055774

## Files
---------------------------------------------------------------------------

Board.java -- This is the class to create all the "graphics" in the terminal. 
                It has function for initiate new board with the size determin
                by the user, and it has function to print out the board and clear
                the "screen".

GameInit.java -- This is class to has initate the game, which include asking 
                    user input for which game they want to play. Getting the 
                    board size they want their TicTacToe be. Symbol they want to play.
                    For game choice, if user choice 2(Order and Chaos), they will
                    be assign as 'X' and the board size is 6 with winning condition of 5.

GameManager.java -- This this an abstract class for board game like tictactoc
                    and order and chaos. It contains helper method such as 
                    isBoardFull and printBoard. And makeMove to fill in the
                    cordinate position player choose.
                    
GameSelect.java -- This class use to take in user input for the scanner (kb). And it 
                    also print out the game menu.

OrderAndChaos.java -- This is the game logic for Order And Chaos. 
                        The win condition for this game is 5 for player with 
                        symbol 'X'. Player 'O' will win when there is no more 
                        space for 'X' to fill in/the board is full.

TicTacToe.java -- This is the game logic for Tic Tac Toe. It has function to check rows, 
                    columns, both diagonals to see if any player has meet the winning condition.
                    The winning condition of Tic Tac Toe is the size of the board, e.g. if size of baord is 4, winning condition is 4.

Play.java -- This is the main class, it use to play the game.

## Notes
---------------------------------------------------------------------------
1. Eveytime player input a move into the board, terminal will clear out 
        to make the game esay to see.


## How to compile and run
---------------------------------------------------------------------------
Game was run under java 1.8.0_202, in vscode. Game can be run in the followwing method:
1. Unzip the file.
2. cd into the derectory where all the .java files are
3. Run the following command line in terminal:
    javac *.java
    java Play
4. Game menu should prompt out if no error occur.

## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. Label each text with input and output. For example:

Output:
Hi welcome, please choose the game you want to play:
1. Tic Tac Toe
2. Order and Chaos
3. Exit
Input:
1
Output:
Welcome to Tic Tac Toe.
Enter the size of the board you wantto play on, for example 3 for 3x3 board:
Input:
4
Output:
4
Please select which symbol you want to play with 'X' or 'O'
Input:
O
Output:
 | | | 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | | 
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
0 2
Output:
Player O select (0,2)
 | |O| 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | | 
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
0 1
Output:
Player X select (0,1)
 |X|O| 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | | 
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
0 2
Output:
Invalid move, please try again.
 |X|O| 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | | 
Input:
0 4
Output:
Invalid move, please try again.
 |X|O| 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | | 
Input:
3 3
Output:
Player O select (3,3)
 |X|O| 
- - - -
 | | | 
- - - -
 | | | 
- - - -
 | | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
2 2
Output:
Player X select (2,2)
 |X|O| 
- - - -
 | | | 
- - - -
 | |X| 
- - - -
 | | |O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
2 3
Output:
Player O select (2,3)
 |X|O| 
- - - -
 | | | 
- - - -
 | |X|O
- - - -
 | | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
1 3
Output:
Player X select (1,3)
 |X|O| 
- - - -
 | | |X
- - - -
 | |X|O
- - - -
 | | |O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
1 1
Output:
Player O select (1,1)
 |X|O| 
- - - -
 |O| |X
- - - -
 | |X|O
- - - -
 | | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
0 0
Output:
Player X select (0,0)
X|X|O| 
- - - -
 |O| |X
- - - -
 | |X|O
- - - -
 | | |O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
1 0
Output:
Player O select (1,0)
X|X|O| 
- - - -
O|O| |X
- - - -
 | |X|O
- - - -
 | | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
2 0
Output:
Player X select (2,0)
X|X|O| 
- - - -
O|O| |X
- - - -
X| |X|O
- - - -
 | | |O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
3 0
Output:
Player O select (3,0)
X|X|O| 
- - - -
O|O| |X
- - - -
X| |X|O
- - - -
O| | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
1 2
Output:
Player X select (1,2)
X|X|O| 
- - - -
O|O|X|X
- - - -
X| |X|O
- - - -
O| | |O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
0 3
Output:
Player O select (0,3)
X|X|O|O
- - - -
O|O|X|X
- - - -
X| |X|O
- - - -
O| | |O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
3 2
Output:
Player X select (3,2)
X|X|O|O
- - - -
O|O|X|X
- - - -
X| |X|O
- - - -
O| |X|O
Player O please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
3 1
Output:
Player O select (3,1)
X|X|O|O
- - - -
O|O|X|X
- - - -
X| |X|O
- - - -
O|O|X|O
Player X please enter the your move. For example: 0 1 for 1st row 2nd column:
Input:
2 1
Output:
Player X select (2,1)
X|X|O|O
- - - -
O|O|X|X
- - - -
X|X|X|O
- - - -
O|O|X|O
Draw!