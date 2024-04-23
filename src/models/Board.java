package models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int Size;
    List<List<Cell>> lists;
    public  Board(int Size , List<List<Cell>> lists){
        this.Size = Size;
        this.lists = new ArrayList<>();
    }
}
