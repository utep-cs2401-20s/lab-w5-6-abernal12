    // two methods that needed to be tested only 5 for recursive and exhaustive //
    // make sure that you're counting the right amount of cells //
    // whether I found the tail //
    // whether I counted the length correctly //

    import static org.junit.Assert.assertEquals;
    import static org.junit.jupiter.api.Assertions.*;

    import org.junit.jupiter.api.Test;

class snakeGameTester {

    /*
     * findTailExhaustive:
     * Test case: 1
     * this test case is supposed to locate the tail and get the exact x and y coordinates, along with the length of the tail.
     * However, the test is failing.
     *
     * this test case should be returning {3, 3, 7}
     */

    @Test
    public void testfindTailExhaustive1() { //NUMBER 1//
        boolean[][] board = {{true, true, false, false},
                {false, true, false, false},
                {false, true, true, false},
                {false, false, true, true}};

        snakeGame game = new snakeGame(board, 0, 0);
        int[] result = game.findTailExhaustive();
        assertArrayEquals(new int[]{3, 3, 7}, result);
    }

    /*
     * findTailExhaustive:
     * Test case: 2
     * this test case is supposed to locate the tail and get the exact x and y coordinates, along with the length of the tail.
     * However, the test is failing.
     *
     * this test case should return {3, 3, 16}
     */

    @Test
    public void testfindTailExhaustive2() { //NUMBER 2//
        boolean[][] board = {{true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}};

        snakeGame game = new snakeGame(board, 0, 0);
        int[] result = game.findTailExhaustive();
        assertArrayEquals(new int[]{3, 3, 16}, result);
    }

    /*
     *tests whether if the method reads just one part of the game board.
     * supposed to return {3, 3, 1}
     */
    @Test
    public void testfindTailExhaustive3() { //NUMBER 2//
        boolean[][] board = {{false, false, false, false},
                            {false, false, false, false},
                            {false, false, false, false},
                            {false, false, false, true}};

        snakeGame game = new snakeGame(board, 0, 0);
        int[] result = game.findTailExhaustive();
        assertArrayEquals(new int[]{3, 3, 1}, result);
    }

    /*
     * test will see if the method will be able to function if there are no parts of the snake within the game board.
     * should return an out of bounds exception or an error.
     */
    @Test
    public void testfindTailExhaustive4() { //NUMBER 2//
        boolean[][] board = {{false, false, false, false},
                            {false, false, false, false},
                            {false, false, false, false},
                            {false, false, false, false}};

        snakeGame game = new snakeGame(board, 0, 0);
        int[] result = game.findTailExhaustive();
        assertArrayEquals(new int[]{0, 0, 0}, result);
    }

    /*
    edge case:
     *check to see if the method will still add to the length and count the parts of the true portions of the game borad even though they are not together.
     *should return an error
     */
    @Test
    public void testfindTailExhaustive5() { //NUMBER 2//
        boolean[][] board = {{true, false, false, false},
                            {false, false, true, false},
                            {false, false, false, false},
                            {false, false, false, true}};

        snakeGame game = new snakeGame(board, 0, 0);
        int[] result = game.findTailExhaustive();
        assertArrayEquals(new int[]{0, 0, 0}, result);
    }
}