# CS611-Assignment 1
## Tic Tac Toe
---------------------------------------------------------------------------
Name    Qinfeng Li
Email   ql2016@bu.edu
Student ID  U84055774

## Files
---------------------------------------------------------------------------

Board.java -- This class ...
GameInit.java
GameManager.java
GameSelect.java
OrderAndChaos.java
play.java
TicTacToe.java


## Notes
---------------------------------------------------------------------------
Please explain the cool features of your program. Anything that you feel like you did a good job at or were creative about, explain it in bullets here. Additionally, any design decisions should be made here.

Example.
1. I woke up this morning and chose to wear green pants because they look nice
2. Map can be extended to 3-D
3. Game can determine that the game is a tie before the end of all moves are taken.
4. Etc.

## How to compile and run
---------------------------------------------------------------------------
Your directions on how to run the code. Ideally should resemble the lines below

1. Navigate to the directory "YourCodeDirectory" after unzipping the files
2. Run the following instructions:
javac *.java -d bin
java -cp ./bin Main

## Input/Output Example
---------------------------------------------------------------------------
Please give us a full execution of what we should see on the screen. Label each text with input and output. For example:

Output:
[+] Hello there! Let's play a game!
[+] Enter a number for the following options:
[+] 1. Tic Tac Toe
[+] 2. Connect Four
[+] 3. Order and Chaos: 
Input:
1
Output:
[+] Welcome to Tic Tac Toe!
[+] Enter the number of teams: 
Input:
2
Output:
[+] Team 1 , please enter your team name: 
Input:
East
Output:
[+] Enter the number of players for team East: 
Input:
2
Output:
[+] Team 1 , please enter your team color: 
Input:
Red
Output:
[+] Team East, Player 1 , please enter your name: 
Input:
Biggie
Output:
[+] Team East, Player 1 , please enter your symbol: 
Input:
X
Output:
[+] Team East, Player 2 , please enter your name: 
Input:
Nas
Output:
[+] Team East, Player 2 , please enter your symbol: 
Input:
O
Output:
[+] Team 2 , please enter your team name: 
Input:
West
Output:
[+] Enter the number of players for team West: 
Input:
1  
Output:
[+] Team 2 , please enter your team color: 
Input:
Blue
Output:
[+] Team West, Player 1 , please enter your name: 
Input:
Pac
Output:
[+] Team West, Player 1 , please enter your symbol: 
Input:
X
Output:
[+] Would you like to change the board size? (y/n):
Input:
Y
Output:
[+] Enter the number of columns for the board: 
Input:
4
Output:
[+] Enter the number of rows for the board: 
Input:
3
Output:
[+] Would you like to change number of symbols in a row to win? (y/n): 
Input:
N
Output:
+---------------+---------------+---------------+---------------+
|         1         |         2         |         3        |       4       |
+---------------+---------------+---------------+---------------+
|         5         |         6         |         7        |       8       |
+---------------+---------------+---------------+---------------+
|         9         |         10       |         11      |       12      |
+---------------+---------------+---------------+---------------+
[+] Biggie, it's your turn! Please enter a valid position: 
Input:
1
+---------------+---------------+---------------+---------------+
|         X         |         2       |         3         |         4         |
+---------------+---------------+---------------+---------------+
|         5         |         6        |         7        |         8         |
+---------------+---------------+---------------+---------------+
|         9         |        10       |        11       |         12        |
+---------------+---------------+---------------+---------------+
[Omitted because Kevin is Lazy]
Output:
TEAM: East, PLAYER: Biggie played X's.
WINS: 1
LOSSES: 0
GAMES PLAYED: 1

TEAM: East, PLAYER: Nas played O's.
WINS: 1
LOSSES: 0
GAMES PLAYED: 1

TEAM: West, PLAYER: Pac played X's.
WINS: 0
LOSSES: 1
GAMES PLAYED: 1

[+] Would you like to play again? (y/n):
Input:
N
Output:
[+] Would you like to play a different game? (y/n):
Input:
Y
Output:
[+] Hello there! Let's play a game!
[+] Enter a number for the following options:
[+] 1. Tic Tac Toe
[+] 2. Connect Four
[+] 3. Order and Chaos:
Input:
Quit
Output:
[+] Goodbye!

