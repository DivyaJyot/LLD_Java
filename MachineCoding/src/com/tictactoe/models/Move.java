package com.tictactoe.models;

public class Move {
    Player player;
    Cell cell;

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Move(int row,int col,Player player) {
        this.player = player;
        Cell cell= new Cell(row,col);
        this.cell=cell;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
