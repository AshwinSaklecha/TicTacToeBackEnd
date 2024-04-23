package models;

public class Move {
    private Cell cell;
    private Player player;
    public  Move(Cell cell , Player player){
        this.player=player;
        this.cell = cell;
    }
}
