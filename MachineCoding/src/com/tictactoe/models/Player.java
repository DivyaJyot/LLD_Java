package com.tictactoe.models;

import java.util.Scanner;

import static com.tictactoe.models.CellState.FILLED;

public class Player {
    private String id;
    private String name;
    private char symbol;
    private PlayerType playerType;

    public Player(){

    }

    public Player(String id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of your move:");
        int row = sc.nextInt();
        System.out.println("Enter the column of your move ");
        int col= sc.nextInt();

        board.getBoard().get(row).get(col).setPlayer(this);
        board.getBoard().get(row).get(col).setCellState(CellState.FILLED);
        return new Move(row,col,this);

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
