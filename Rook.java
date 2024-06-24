import javax.swing.*;
public class Rook extends Piece {


    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board) {
        return false;
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[] board) {
        return false;
    }

    public Rook(boolean w) {

        super(w);
        if(w == true){
            isWhite = true;
            image = new ImageIcon("wrook.gif");
        }
        else {
            isWhite = false;
            image = new ImageIcon("brook.gif");
        }

    }
}


