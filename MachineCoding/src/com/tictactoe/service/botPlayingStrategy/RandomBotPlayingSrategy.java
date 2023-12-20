package com.tictactoe.service.botPlayingStrategy;

import com.tictactoe.exception.GameOverException;
import com.tictactoe.models.*;

import java.util.List;

public class RandomBotPlayingSrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) throws GameOverException {
        List<List<Cell>> matrix= board.getBoard();
        int row=matrix.size();
        int col= matrix.get(0).size();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    matrix.get(i).get(j).setCellState(CellState.FILLED);
                    matrix.get(i).get(j).setPlayer(player);
                    return new Move(i,j,player);
                }
            }
        }
        throw new GameOverException("No new cells to play with, Game over ");
    }
}
