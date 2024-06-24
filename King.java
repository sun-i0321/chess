import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class King extends Piece {



    //  rclass constructor to set color


    //  @Override


    /* public boolean canMove(int startx, int starty, int endx, int endy,Piece[]board) {
         if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1)  {
             return true; }

         else if (startx == 0 && Piece.board[endx][endy] == null || Piece.board[endx][endy].isWhite() != this.isWhite) {
             return true;
         }


         return false;
     }


     */
   public King(boolean w) {


        super(w);
        if (w == true) {
            isWhite = true;
            image = new ImageIcon("wking.gif");
            Piece.white = this;
        } else {
            isWhite = false;
            image = new ImageIcon("bking.gif");
            Piece.black = this;
        }

        int location;
        Color color;

    }


    @Override
    public boolean canMove(int startx, int starty, int endx, int endy, Piece[][] board) {
        return false;
    }

    public boolean canMove(int startx, int starty, int endx, int endy, Piece[] board) {

        if (Math.abs(startx - endx) <= 1 && Math.abs(starty - endy) <= 1) {
            return true;
        } else if (Piece.board[endx][endy] == null || chess.position[startx][starty].isWhite != this.isWhite) {
            return true;
        }


      //  Scanner scanner = new Scanner(System.in);
      //  String answer = scanner.next();

      /*  while (answer.equals("q")) {
            System.out.println("quit");
            break;

       */




        return false;

       // chess.line.repaint();
    }


}

