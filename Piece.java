import javax.swing.*;
import java.awt.*;

public abstract class Piece extends BoardMouseListener {
    public abstract boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board);


    protected static Object[][] board;
    public boolean isWhite;
    ImageIcon image ;
    public static King white;
    public static King black;



   /* public boolean canMove(int startx, int starty, int endx, int endy,Piece[]board) {
        if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1)  {
            return true; }

        else if (startx == 0 && Piece.board[endx][endy] == null || Piece.board[endx][endy].isWhite() != this.isWhite) {
            return true;
        }


        return false;
    }


    */


    public abstract boolean canMove(int startx, int starty, int endx, int endy, Piece[]board );


       /* if (Math.abs(startx - endx) <= 0 && Math.abs(starty - endy) <= 0)  {
            return true; }

            else if (startx == 0) {
                return true;
            }

        return false;



        */

        public void Draw (Graphics g,int x, int y){
            g.drawImage(image.getImage(), 100 * x + 30, 100 * y + 30, null);

        }
        int King;
        int Queen;
        int Rook;
        int Bishop;
        int Knight;
        int Pawn;
        Color color;
        int location;
        int x;
        int y;


    public Piece(boolean isWhite)
        {

            location = 0;
            x = 0;
            y = 0;
            this.King = King;
            this.isWhite = this.isWhite;
        }





}