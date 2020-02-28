public class snakeGame {

    private boolean[][] game;
    private int[] headPosition; // size of two, x and y position
    private static int exhaustiveChecks; // static variable means that you only want to refer to only one.
    private static int recursiveChecks;

    // default constructor //
    public snakeGame(){
        game = new boolean[1][1];
    }

    // constructor //
    // x is head and it is the first index //
    // y is the second position //
    // 2d boolean array, copy to one game board. (use nested for loop). //
    public snakeGame(boolean [][] A, int x, int y){
        // game = A //
        // setting the board to the array /
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[i].length; j++){
                game[i][j] = A[i][j];
            }
        }
        headPosition = new int[2];
        headPosition[0] = x; // head position x//
        headPosition[1] = y; // head position y//
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

    // checking cells until tail is found //
    public int[] findTailExhaustive() {
        int counter = 0; // initializing counter, will be used to count how many times we move from one element of the snake to the other to ultimately get the size of the snake. //
        int length = 0; // continue on finding the length of snake //
        int neighbors = 0; // counts the number of neighbors //
        for(int i = 0; i < game.length; i++){ // this for loop iterates through the rows of the grid //
            for(int j = 0; j < game.length; j++){ // this for loop will iterate through the columns of the grid //
                if(game[i][j] == true){ // if there is a snake in the coordinates i,j //
                    //length++;
                    if(i == 0 && j == 1){ // and if the coordinates of i, and j match to the coordinates in 0 and 1. then... set i and j equal to the head //
                        // set the
                    }
                    if(game[i+1][j] == true){ // if the cell to the right of the current cell is part of the snake.. //
                        length++; // then add to the length.. //
                        neighbors++; // and to the neighbors. //
                        continue; // continues to proceed to the next element of the array //
                    }
                    if(game[i-1][j] == true){ // if the cell to the left of the current cell is part of the snake.. //
                        length++; // then add the cell to the length
                        neighbors++; // and to the neighbors. //
                        continue; // continues to proceed to the next element of the array. //
                    }
                    if(game[i][j+1] == true){ // if cell at the top of the current cell is part of the snake.. //
                        length++; // then add to the length //
                        neighbors++; // and add to the neighbors. //
                        continue; // continues to proceed to the next element of the array. //
                    }
                    if(game[i][j-1] == true){ //if the cell at the top of the current cell is part of the snake.. //
                        length++; // then add to the length. //
                        neighbors++; // and add to the neighbors aswell. //
                        continue;
                    }
                }
                else if(game[i][j] == false){
                    continue; // continues on to the next element of the array if there is not part of the snake in the current element. //
                }
                if(game[i][j] == true && game[i+1][j] == true|| game[i][j] == true && game[i-1][j] == true || game[i][j] == true && game[i][j+1] == true || game[i][j] == true && game[i][j-1] == true){
                    //return ();
                }
            }
        }
        return new int[0]; // return the (x,y,length) //
    }

    // length of snake, where my tail is, and to keep track of how many cells ive checked. //
    // 1. reset counters //
    // 2. look at the heads position. //
    // 3. look for their neighbors to trace down the snake and check if its the tail//
    // head position, both parameters. //
    // no loops in this method. //
    // 4. make sure the neighbor we want to check, is not what we already saw. //
    // 5.
    public int[] findTailRecursive(){
        int counter = 0;
        for(int i = 0; i < game.length; i++){
            for(int j = 0; j < game.length; j++){
                //if(game[i][j] == head){
                   // if(){

                    }
                }
                //else if(){

               // }
           // }
      //  }
        return new int[0]; // size of 3, (x position of tail, y position of tail, length of snake) //)
    }

    // actually looks through snake //
    // count length of snake //
    private int[] findTailRecursive(int[] currentPosition, int[] previousPosition){
        findTailRecursive(headPosition, headPosition);
        return new int[0];
    }

    // reset counters to 0 //
    // set both counters equal to zero //
    private void resetCounters(){
        exhaustiveChecks.reset();
        recursiveChecks.reset();
    }

    // getter,
    public static int getRecursiveChecks(){
        return recursiveChecks;
    }

    //
    public static int getExhaustiveChecks(){
        return exhaustiveChecks;
    }
}
