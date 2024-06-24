import javax.swing.*;
public class Knight extends Piece {


    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board) {
        return false;
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[] board) {
        return false;
    }

    public Knight(boolean w) {

        super(w);
        if(w == true){
            isWhite = true;
            image = new ImageIcon("wknight.gif");
        }
        else {
            isWhite = false;
            image = new ImageIcon("bknight.gif");
        }

    }
}


