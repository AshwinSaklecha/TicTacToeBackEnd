package models;

public class Player {
    private String Name;
    private Symbol symbol;
    private PlayerType playerType;
    public  Player(String Name,Symbol symbol, PlayerType playerType){
        this.Name = Name;
        this.symbol=symbol;
        this.playerType=playerType;
    }
}
