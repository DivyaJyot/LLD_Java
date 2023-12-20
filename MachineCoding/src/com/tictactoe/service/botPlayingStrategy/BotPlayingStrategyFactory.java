package com.tictactoe.service.botPlayingStrategy;

import com.tictactoe.service.botPlayingStrategy.BotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(){
        return new RandomBotPlayingSrategy() ;        }
    }

