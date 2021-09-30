# MarsRoverKata Description
Program to move one Mars Rover vehicle around the surface of Mars.
The program will create a plateau with maximum coordinates of 5,5 it will build a grid with x,y coordinates 0-5. 
Program then receives current location of rover e.g. 11N coordinate (1,1 on grid and direction N)
The program then receives the move instructions e.g. RLM instructing rover to rotate right and then left and then move in direction it is facing one coordinate on the grid
When move completed the rover will output its new location e.g. 12N
Rover will only move within the bounds of the grid and will output location of last move if asked to move outside of boundary.

Inputs
1. The first line inputted into the program represents the upper-right coordinates of the Plateau. 5 5
N.B. Assume that the lower-left coordinates is (0, 0).

Subsequent Lines of Input into the Program - Input to Rovers
This represents the instructions to move the rovers.

Each rover receives two lines of input.
First Line of Input to a Rover
1. The Rover’s position is represented by two integers representing the X and Y coordinates and a letter representing where the Rover is facing (its
orientation). 1 2 N

Second Line of Input to a Rover
2. A string of letters representing the instructions to move the Rover around the Plateau. e.g LMLMLMLMMR (M=Move R=Right L=Left)
Movement Rules
Rovers move sequentially, this means that the first Rover needs to finish moving first before the next one can move.
Output

Outputs
For each Rover, the output represents its final position (final coordinates and where it is facing).
eg.1 3 N

**********************************************************************************************************

To run the program:
Run tests in the VehicleMarsRoverControllerTest to move the Rover
The tests will create a plateau with upper coordinates 55 and a rover with a set location. eg 11N
It will then move the rover according to move instructions eg. MMRLM and will validate that move is not out of the plateau boundary

**********************************************************************************************************

Still to implement:
A main application to ask for input strings from user
Validation of input string for rover's current location and move instructions
Change Direction enum class to N,S,E,W rather than North, South, East, West enum values
Make extendable by adding abstract classes as in UML diagram
Add packages for model and controller classes

Documentation:
UML diagram to be updated and added

