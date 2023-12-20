package com.tictactoe.models;

import com.tictactoe.exception.GameOverException;
import com.tictactoe.service.botPlayingStrategy.BotPlayingStrategy;
import com.tictactoe.service.botPlayingStrategy.BotPlayingStrategyFactory;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    public Bot(int id, String name, char symbol, PlayerType playerType, BotDifficultyLevel botDifficultyLevel) {
        super(id, name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move makeMove(Board board) throws GameOverException {
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy();
        return botPlayingStrategy.makeMove(board, this);
    }

}
