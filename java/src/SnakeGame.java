public class SnakeGame {
    private boolean[][] game;
    private int[] headPosition = new int[2]; //(x,y)
    private static int exhaustiveChecks;
    private static int recursiveChecks;
    int x, y, length;

    SnakeGame(){
        int[][] game = new int[1][1];
    }

    SnakeGame(boolean[][] board, int x, int y) {
        this.game = new boolean[board.length][board[0].length];

    }

    public int[] findTailExhaustive (int x, int y, int length) {
        //find the tail by searching across the whole grid
        resetCounters();
        int[] finalPosition = new int[3];
        length = 0;
        for(int i = 0; i < game.length; i++){
            for(int k = 0; k < game[i].length; k++){
                if(int x == game[i])
                    x = game[i];
                if(int y == game[k])
                    y = game[k];
            }
        }
    }

    public int findTailRecursive () {
        //find the tail using recursion

    }

    private int findTailRecursive(int[] currentPosition, int[] previousPosition){

    }

    private void resetCounters() {
        exhaustiveChecks = 0;
        recursiveChecks = 0;
    }

    private static int getRecursiveChecks() {

    }

    private static int getExhaustiveChecks() {

    }

}

