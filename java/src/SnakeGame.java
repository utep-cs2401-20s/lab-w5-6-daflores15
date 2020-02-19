public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition = new int[2]; //(x,y)
    private static int exhaustiveChecks;
    private static int recursiveChecks;
    int x, y;
    int length;

    SnakeGame(){
        int[][] gameBoard = new int[1][1];
    }

    SnakeGame(boolean[][] headPosition, int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int findTailExhaustive (int x, int y, int lenght) {
        //find the tail by searching across the whole grid

    }

    public int findTailRecursive () {
        //find the tail using recursion

    }

    private int findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters() {

    }

    private static int getRecursiveChecks() {

    }

    private static int getExhaustiveChecks() {

    }

}

