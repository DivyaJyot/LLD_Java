package com.tictactoe;


import com.tictactoe.controller.GameController;
import com.tictactoe.exception.GameOverException;
import com.tictactoe.models.*;
import com.tictactoe.service.winningStrategy.WinningStrategyFactory;
import com.tictactoe.service.winningStrategy.WinningStrategyOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    //get Dimension
    //check if bot is there
    //get playerNameand playerSymbol

    public static void main(String args[]) {
         GameController gameController= new GameController();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimension of game-");
        int dimension = sc.nextInt();
        System.out.println("Is there any bot in the game?:Y or N");
        String isBotPresent= sc.next();
        List<Player> players= new ArrayList<>();
        int iteratorNumber=dimension-1;
        if(isBotPresent.equalsIgnoreCase("Y")){
            iteratorNumber=iteratorNumber-1;
            System.out.println("What is the name of Bot:?");
            String name= sc.next();
            System.out.println("what is the Symbol of Bot:");
            String symbol=sc.next();
            BotDifficultyLevel bdl= BotDifficultyLevel.EASY;
            Bot bot= new Bot(dimension,name,symbol.charAt(0),PlayerType.BOT,bdl);
            players.add(bot);
        }
        for(int i=0;i<iteratorNumber;i++){
            System.out.println("Please enter the name of the player "+i +":");
            String name= sc.next();
            System.out.println("Plaese enter the symbol of the player: ");
            String symbol= sc.next();
            players.add(new Player(i,name,symbol.charAt(0), PlayerType.HUMAN));

        }
        Collections.shuffle(players);
        Game game= gameController.createGame(dimension,players, WinningStrategyFactory.getWinningStrategy(dimension));
        int playerIndex=-1;
        while(gameController.getGameStatus(game).equals(GameStatus.IN_PROGRESS)){
            System.out.println("current board status");
            game.getCurrentBoard().printBoard();
            playerIndex++;
            playerIndex=playerIndex % players.size();
            Move lastmove= null;
            try {
                lastmove = gameController.executeMove(game,players.get(playerIndex));
            } catch (GameOverException e) {
                throw new RuntimeException(e);
            }
            Player winner= gameController.checkWinner(game,lastmove);
            if(winner !=null){
                System. out.println("winner is "+ winner.getName());
                break;
            }
        }
        System.out.println("Final Board status: ");
        gameController.displayBoard(game);

    }

}
