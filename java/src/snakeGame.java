public class snakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    // default constructor //

    public snakeGame(){
        game = new boolean[1][1];
    }

    // constructor //
    // x is head and it is the first index //
    // y is the second position //
    public snakeGame(boolean [][] A, int x, int y){
        game = A;
        headPosition = new int[2];
        headPosition[0] = x;
        headPosition[1] = y;
    }

    // make static //
    // reset counters, will reset counters and... //
    // start at first cell //
    // check its neighbors //
    // check if you are part of the snake //
    // every time you find a cell, you add it to snake //
    // checks numbers //
    // if not part of the snake, move to next cell //
    // if part of the snake, how many neighbors are in snake> //
    // if one neighbor, either at head or tail... you know //
    // if two neighbors, move to next cell //
    // return tail (x,y) //

    ////////////////////////////////////////////////////////////////////////

    // reset counter //
    // traverse board: row traverse board: col //
    // if part of the snake //
    // if not foundTail //
    // if tail + not head + L height //
    // foundTail (arrow pointing to the left) true //
    // else // foundTail //
    // exhChecks-- //
    // exhChecks //

    public int[] findTailExhaustive() {
        int counter = 0; // initializing counter, will be used to count how many times we move from one element of the snake to the other to ultimately get the size of the snake. //

        for(int i = 0; i < game.length; i++){ // this for loop iterates through the rows of the grid //
            for(int j = 0; j < game.length; j++){ // this for loop will iterate through the columns of the grid //
                if(game[i][j] == true){ // if there is a snake in the coordinates i,j //
                    if(i == 0 && j == 1){ // and if the the coordinates of i, and j match to the coordinates in 0 and 1. then... //
                        continue; // continue on to the next
                    }
                }

            }
        }
        return new int[0];
    }

    // length of snake, where my tail is, and to keep track of how many cells ive checked. //
    // 1. reset counters //
    // 2. look at the heads position. //
    // 3. look for their neighbors to trace down the snake and check if its the tail//
    // no loops in this method. //
    // 4. make sure the neighbor we want to check, is not what we already saw. //
    // 5.
    public int[] findTailRecursive(){
        int counter = 0;
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game.length; j++){
                if()
            }
        }
        return new int[0];
    }

    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        return new int[0];
    }

    private void resetCounters(){

    }

    private static int getRecursiveChecks(){
        return 0;
    }

    private static int getExhaustiveChecks(){
        return 0;
    }
}
