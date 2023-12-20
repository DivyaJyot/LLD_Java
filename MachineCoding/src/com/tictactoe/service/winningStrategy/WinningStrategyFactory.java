package com.tictactoe.service.winningStrategy;

public class WinningStrategyFactory {

    public static WinningStrategy getWinningStrategy(int dimension){
        return new WinningStrategyOne(dimension);
    }
}
