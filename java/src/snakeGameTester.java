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
         * A([0,0,0,0],
         *   [0,*,-,-].
         *   [0,0,0,-],
         *   [0,-,-,-]) → head
         */

        @Test
        public void testfindTailExhaustive1() { //NUMBER 1//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailExhaustive());
        }


        /*
         *
         */

        @Test
        public void testfindTailExhaustive2() { //NUMBER 2//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailExhaustive());
        }

        /*
         *
         *
         */

        @Test
        public void testfindTailExhaustive3() { //NUMBER 3//
            snakeGame sol = new snakeGame();
            int[] A = {1,2,3};
            assertEquals(3, sol.findTailExhaustive());
        }

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
