package com.tictactoe.controller;

import com.tictactoe.exception.GameOverException;
import com.tictactoe.models.Game;
import com.tictactoe.models.GameStatus;
import com.tictactoe.models.Move;
import com.tictactoe.models.Player;
import com.tictactoe.service.winningStrategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players, WinningStrategy winningStrategy){
        try {
            return Game.builder()
                    .dimension(dimension).players(players).winningStrategy(winningStrategy).build();
        } catch (Exception e) {
            System.out.println("Something went wrong. cannot start the game"+e.getMessage()+e);
        }
        return null;
    }

    public void displayBoard(Game game){
        game.getCurrentBoard().printBoard();
    }
    public GameStatus getGameStatus(Game game){
       return game.getGameStatus();
    }
    public Player getGameWinner(Game game){
        return game.getWinner();

    }
    public Player checkWinner(Game game, Move lastPlayerMove){
        Player player=game.getWinningStrategy().checkWinner(game.getCurrentBoard(),lastPlayerMove);
        if(player !=null){
            game.setWinner(player);
            game.setGameStatus(GameStatus.COMPLETED);

        }
        return player;
    }
    public Move executeMove(Game game, Player player) throws GameOverException {
        Move move=player.makeMove(game.getCurrentBoard());
        game.setNumberOfSymbols(game.getNumberOfSymbols()+1);
      //  Player winner=checkWinner(game,move);
        updateBoardStatus(game);
        updateGameMove(game,move);
        return move;
    }
    public void updateGameStatus(Game game){
        if(game.getNumberOfSymbols()==game.getCurrentBoard().getSize()*game.getCurrentBoard().getSize()){
            game.setGameStatus(GameStatus.DRAW);
        }
    }
    //getGameWinnerf
    //exceuteMove
    //undoMove
    //replayGame
    //updateBoardStatus
    //updateGameStatus
    public void updateBoardStatus(Game game){
        game.getBoards().add(game.getCurrentBoard());
    }
    public void updateGameMove(Game game,Move move){
        game.getMoves().add(move);
    }
}
