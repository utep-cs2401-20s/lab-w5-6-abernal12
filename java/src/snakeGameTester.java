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
         * Test case: 1
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
         *
         */

//        @Test
//        public void testfindTailExhaustive2() { //NUMBER 2//
//            snakeGame sol = new snakeGame();
//            int[] result = {4, 0, 5};
//            assertEquals(result, sol.findTailExhaustive());
//        }

        /*
         *
         *
         */

//        @Test
//        public void testfindTailExhaustive3() { //NUMBER 3//
//            snakeGame sol = new snakeGame();
//            int[] A = {1,2,3};
//            assertEquals(A, sol.findTailExhaustive());
//        }

        /*
         *
         */

        @Test
        public void testfindTailExhaustive4() { //NUMBER 4//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailExhaustive());
        }

        /*
         *
         */

        @Test
        public void testfindTailExhaustive5() { //NUMBER 5//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailExhaustive());
        }

        ////////////////////////////////////////////////////////////////////////////////

        /*
         *
         */

        @Test
        public void testfindTailRecursive1() { //NUMBER 1//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailRecursive());
        }

        /*
         *
         */

        @Test
        public void testfindTailRecursive2() { //NUMBER 2//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailRecursive());
        }

        /*
         *
         */

        @Test
        public void testfindTailRecursive3() { //NUMBER 3//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailRecursive());
        }

        /*
         *
         */

        @Test
        public void testfindTailRecursive4() { //NUMBER 4//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailRecursive());
        }

        /*
         *
         */

        @Test
        public void testfindTailRecursive5() { //NUMBER 5//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailRecursive());
        }
}
