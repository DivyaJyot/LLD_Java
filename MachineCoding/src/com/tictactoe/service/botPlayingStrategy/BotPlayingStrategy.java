package com.tictactoe.service.botPlayingStrategy;

import com.tictactoe.exception.GameOverException;
import com.tictactoe.models.Board;
import com.tictactoe.models.Move;
import com.tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player) throws GameOverException;
}
