# WordHunt Solver

Java program designed with a recursive backgracking algorithm to find all possible WordHunt board solutions.

User is prompted to enter the dimmensions of their desired game-board, as well as the letters they want in each cell of the board. Once entered, the algorithm parses the NxM matrix and checks all possible sequences of adjacent indices/characters comparing them to a hash set of strings retrieved from a text file of the English dictionary.
