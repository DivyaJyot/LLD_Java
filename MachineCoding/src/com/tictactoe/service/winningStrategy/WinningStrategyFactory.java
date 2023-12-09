package com.tictactoe.service.winningStrategy;

public class WinningStrategyFactory {

    public static WinningStrategy getWinningStrategy(){
        return new WinningStrategyOne();
    }
}
