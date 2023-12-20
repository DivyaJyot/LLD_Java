package com.tictactoe.models;

import com.tictactoe.exception.DuplicateSymbolException;
import com.tictactoe.exception.InvalidBoardSizeException;
import com.tictactoe.exception.InvalidBotCountException;
import com.tictactoe.exception.InvalidPlayerCountException;
import com.tictactoe.models.Board;
import com.tictactoe.models.Move;
import com.tictactoe.models.Player;
import com.tictactoe.service.winningStrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {

    private Board currentBoard;
    private List<Player> player;
    private WinningStrategy winningStrategy;
    private List<Board> boards;
    private List<Move> moves;

    private Player winner;
    private GameStatus gameStatus;

    private int numberOfSymbols;

    public Game(Board currentBoard, List<Player> player, WinningStrategy winningStrategy) {
        this.currentBoard = currentBoard;
        this.player = player;
        this.winningStrategy = winningStrategy;
        this.boards = new ArrayList<Board>();
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameStatus = GameStatus.IN_PROGRESS;
        this.numberOfSymbols = 0;
    }

    public Board getCurrentBoard() {
        return currentBoard;
    }

    public void setCurrentBoard(Board currentBoard) {
        this.currentBoard = currentBoard;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public List<Board> getBoards() {
        return boards;
    }

    public void setBoards(List<Board> boards) {
        this.boards = boards;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }
    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int dimension;
        private List<Player> players;
        private WinningStrategy winningStrategy;

        public Builder dimension(int dimension){
            this.dimension=dimension;
            return this;
        }
        public Builder players(List<Player> players){
            this.players=players;
            return this;
        }
        public Builder winningStrategy(WinningStrategy winningStrategy){
            this.winningStrategy=winningStrategy;
            return this;
        }
        //validate Bot count
        //validate PlayerNumber
        //Validate BoardSize
        //Validate duplicate Symbol
        public void validate() throws InvalidPlayerCountException,InvalidBotCountException,DuplicateSymbolException,InvalidBoardSizeException{
            validateBotCount();
            validatePlayerNumber();
            validateDuplicateSymbol();
            validateBoardSize();
        }

    public Game build() throws InvalidPlayerCountException,InvalidBotCountException,DuplicateSymbolException,InvalidBoardSizeException{
            validate();
            return new Game(new Board(dimension),players,winningStrategy);
        }
        public void validateBotCount() throws InvalidBotCountException {
            int botCount = (int)players.stream().filter(v -> v.getPlayerType() == PlayerType.BOT).count();
            if(botCount>1){
                throw new InvalidBotCountException("Bot count cannot exceed one: currentCount "+botCount);
            }
        }
        public void validatePlayerNumber() throws InvalidPlayerCountException{
            int playerCount=players.size();
            if(players.size()!=dimension-1){
                throw new InvalidPlayerCountException("Number of player is invalid: current count is:"+playerCount);
            }
        }

        public void validateDuplicateSymbol() throws DuplicateSymbolException{
            HashSet<Character> set= new HashSet<>();
            for(int i=0;i<players.size();i++){
                Character c= players.get(i).getSymbol();
                if(set.contains(c)){
                    throw new DuplicateSymbolException("Duplicate Symbol found: "+c);
                }
            }
        }
        public void validateBoardSize() throws InvalidBoardSizeException {
            if(dimension<3 || dimension>10){
                throw new InvalidBoardSizeException("Board size should be >=3 and <=10, current board size" + dimension);
            }
        }
    }
}
