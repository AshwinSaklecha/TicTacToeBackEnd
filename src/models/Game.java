package models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private int nextPlayerMoveIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    int num;

    public Game(Board board, List<Player> players,int num) {
        this.board = board;
        this.players = players;
        this.nextPlayerMoveIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.gameState = GameState.isInProgress;
        this.num =num;
    }
}
