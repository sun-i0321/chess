import javax.swing.*;

public class Bishop extends Piece{

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board) {
        return false;
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[] board) {
        return false;
    }

    public Bishop(boolean w) {

        super(w);
        if(w == true){
            isWhite = true;
            image = new ImageIcon("wbishop.gif");
        }
        else {
            isWhite = false;
            image = new ImageIcon("bbishop.gif");
        }



    }
}

