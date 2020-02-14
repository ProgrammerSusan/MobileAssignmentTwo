package com.example.app8;

public class Model
{
    static int[][] board;
    public static int[][] makeboard()
    {
       board = Sudoku.generate();
       return board;
    }

    //get board set
    public static void setBoard(int x, int y, int e)
    {
        board[x][y] = e;
    }

    public static boolean isValid(int x, int y, int e)
    {
        //cannibalized from blackbox code
        for (int j = 0; j < 9; j++)
            if (board[x][j] == e)
                return false;

        for (int i = 0; i < 9; i++)
            if (board[i][y] == e)
                return false;

        for (int i = y; i < y+3; i++)
            for (int j = x; j < x+3; j++)
                if (board[i][j] == e)
                    return false;
        return true;
    }
}
