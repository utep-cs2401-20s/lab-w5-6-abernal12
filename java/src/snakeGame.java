public class snakeGame {

    private boolean[][] game;
    private int[] headPosition;
    private static int exhaustiveChecks;
    private static int recursiveChecks;

    // default constructor //

    public snakeGame(){
        int[][] gameBoard = new int[1][1];
    }

    // constructor //
    // x is head and it is the first index //
    // y is the second position //
    public snakeGame(int x, int y){
        boolean[][] a = new boolean [x][y];
        int[][] head = new int[x][y];
    }

    // make static //
    // reset counters, will reset counters and... //
    // start at first cell //
    // check its neighbors //
    // check if you are of the snake //
    // every time you find a cell, you add it to snake //
    // checks numbers //
    // if not part of the snake, move to next cell //
    // if part of the snake, how many neighbors are in snake> //
    // if one neighbor, either at head or tail... you know //
    // if two neighbors, move to next cell //
    // return tail (x,y) //

    public static int[] findTailExhaustive() {
        return new int[0];
    }

    public static int[] findTailRecursive(){
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
