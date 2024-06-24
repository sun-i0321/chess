import javax.swing.*;

public class Queen extends Piece{


    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board) {
        return false;
    }

    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[] board) {
        return false;
    }

    public Queen(boolean w) {

            super(w);
            if(w == true){
                isWhite = true;
                image = new ImageIcon("wqueen.gif");
            }
            else {
                isWhite = false;
                image = new ImageIcon("bqueen.gif");
            }



        }
    }

