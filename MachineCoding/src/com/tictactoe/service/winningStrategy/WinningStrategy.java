package com.tictactoe.service.winningStrategy;

import com.tictactoe.models.Board;
import com.tictactoe.models.Move;
import com.tictactoe.models.Player;

public interface WinningStrategy {
   Player checkWinner(Board board, Move lastMove);
}
