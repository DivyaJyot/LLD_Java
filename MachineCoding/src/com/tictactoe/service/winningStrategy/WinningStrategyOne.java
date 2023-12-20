package com.tictactoe.service.winningStrategy;

import com.tictactoe.models.Board;
import com.tictactoe.models.Move;
import com.tictactoe.models.Player;
import com.tictactoe.service.winningStrategy.WinningStrategy;

import java.util.*;

public class WinningStrategyOne implements WinningStrategy {

    private int dimension;
    private List<HashMap<Character,Integer>> rowHashMaps;
    private List<HashMap<Character,Integer>> colHasMaps;
    private HashMap<Character,Integer> topLeftMaps;
    private HashMap<Character,Integer> topRightMaps;
    private HashMap<Character,Integer>  cornerMaps;

public WinningStrategyOne(int dimension){
    this.dimension=dimension;
    rowHashMaps= new ArrayList<>() ;
    cornerMaps=new HashMap<>();
    colHasMaps=new ArrayList<>();
    topLeftMaps=new HashMap<>();
    topRightMaps= new HashMap<>();
    for(int i=0;i<dimension;i++){
        rowHashMaps.add(new HashMap<>());
        colHasMaps.add(new HashMap<>());
    }

}
public boolean isTopLeftDiagonalCell(int row,int col){
    return(row==col);
}
public boolean isTopRightDiagonalCell(int row,int col){
    return(row+col == dimension-1);
}
public boolean isCornelCell(int row, int col) {
        if (row == 0 || row == dimension - 1 ){
        return (col == 0 || col == dimension - 1);
    }
    return false;
}

private boolean checkRowWin(int row, char symbol){
    rowHashMaps.get(row).putIfAbsent(symbol,0);
    rowHashMaps.get(row).put(symbol,rowHashMaps.get(row).get(symbol)+1);
    return rowHashMaps.get(row).get(symbol) ==dimension;

}
private boolean checkColwin(int col, char symbol){
    colHasMaps.get(col).putIfAbsent(symbol,0);
    colHasMaps.get(col).put(symbol,colHasMaps.get(col).get(symbol)+1);
    return colHasMaps.get(col).get(symbol) ==dimension;

}

private boolean checkTopLeftDiagonalWin(char symbol){
    topLeftMaps.putIfAbsent(symbol,0);
    topLeftMaps.put(symbol,topLeftMaps.get(symbol)+1);
    return topLeftMaps.get(symbol)==dimension;
}
private boolean checkTopRightDiagonalWin(char symbol){
    topRightMaps.putIfAbsent(symbol,0);
    topRightMaps.put(symbol,topRightMaps.get(symbol)+1);
    return topRightMaps.get(symbol)==dimension;

}
private boolean checkCornerWin(char symbol){
    cornerMaps.putIfAbsent(symbol,0);
    cornerMaps.put(symbol,cornerMaps.get(symbol)+1);
    return cornerMaps.get(symbol)==4;

}
    @Override
    public Player checkWinner(Board board, Move lastMove) {
        Player player= lastMove.getPlayer();
        int row=lastMove.getCell().getRow();
        int col=lastMove.getCell().getCol();
        char symbol=player.getSymbol();
        if(checkColwin(col,symbol)){
            return player;
        };
        if (checkRowWin(row, symbol)){
            return player;
        };
        if(isCornelCell(lastMove.getCell().getRow(),lastMove.getCell().getCol()) && checkCornerWin(symbol)){
            return player;
        }
        if(isTopLeftDiagonalCell(lastMove.getCell().getRow(),lastMove.getCell().getCol())&& checkTopLeftDiagonalWin(symbol)){
            return player;
        }
        if(isTopRightDiagonalCell(lastMove.getCell().getRow(),lastMove.getCell().getCol())&&
        checkTopRightDiagonalWin(symbol)){
            return player;
        }
        return null;
    }
}

