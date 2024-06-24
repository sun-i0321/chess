import javax.swing.*;
import java.awt.*;

public class line extends JComponent {
    public void paintComponent(Graphics g) {
        g.setColor(new Color(233, 174, 95));
        g.fillRect(10, 0, 100, 100);
        g.fillRect(210, 0, 100, 100);
        g.fillRect(410, 0, 100, 100);
        g.fillRect(610, 0, 100, 100);
        g.fillRect(10, 200, 100, 100);
        g.fillRect(210, 200, 100, 100);
        g.fillRect(410, 200, 100, 100);
        g.fillRect(610, 200, 100, 100);
        g.fillRect(10, 400, 100, 100);
        g.fillRect(210, 400, 100, 100);
        g.fillRect(410, 400, 100, 100);
        g.fillRect(610, 400, 100, 100);
        g.fillRect(10, 600, 100, 100);
        g.fillRect(210, 600, 100, 100);
        g.fillRect(410, 600, 100, 100);
        g.fillRect(610, 600, 100, 100);
        g.fillRect(110, 100, 100, 100);
        g.fillRect(110, 300, 100, 100);
        g.fillRect(110, 500, 100, 100);
        g.fillRect(110, 700, 100, 100);
        g.fillRect(310, 100, 100, 100);
        g.fillRect(310, 300, 100, 100);
        g.fillRect(310, 500, 100, 100);
        g.fillRect(310, 700, 100, 100);
        g.fillRect(510, 100, 100, 100);
        g.fillRect(510, 300, 100, 100);
        g.fillRect(510, 500, 100, 100);
        g.fillRect(510, 700, 100, 100);
        g.fillRect(710, 100, 100, 100);
        g.fillRect(710, 300, 100, 100);
        g.fillRect(710, 500, 100, 100);
        g.fillRect(710, 700, 100, 100);

        g.setColor(new Color(177, 113, 24));
        g.fillRect(110, 0, 100, 100);
        g.fillRect(310, 0, 100, 100);
        g.fillRect(510, 0, 100, 100);
        g.fillRect(710, 0, 100, 100);
        g.fillRect(110, 200, 100, 100);
        g.fillRect(310, 200, 100, 100);
        g.fillRect(510, 200, 100, 100);
        g.fillRect(710, 200, 100, 100);
        g.fillRect(110, 400, 100, 100);
        g.fillRect(310, 400, 100, 100);
        g.fillRect(510, 400, 100, 100);
        g.fillRect(710, 400, 100, 100);
        g.fillRect(110, 600, 100, 100);
        g.fillRect(310, 600, 100, 100);
        g.fillRect(510, 600, 100, 100);
        g.fillRect(710, 600, 100, 100);
        g.fillRect(10, 100, 100, 100);
        g.fillRect(10, 300, 100, 100);
        g.fillRect(10, 500, 100, 100);
        g.fillRect(10, 700, 100, 100);
        g.fillRect(210, 100, 100, 100);
        g.fillRect(210, 300, 100, 100);
        g.fillRect(210, 500, 100, 100);
        g.fillRect(210, 700, 100, 100);
        g.fillRect(410, 100, 100, 100);
        g.fillRect(410, 300, 100, 100);
        g.fillRect(410, 500, 100, 100);
        g.fillRect(410, 700, 100, 100);
        g.fillRect(610, 100, 100, 100);
        g.fillRect(610, 300, 100, 100);
        g.fillRect(610, 500, 100, 100);
        g.fillRect(610, 700, 100, 100);


     //   g.setColor(Color.black);
        g.drawLine(10, 0, 810, 0);
        g.drawLine(10, 100, 810, 100);
        g.drawLine(10, 200, 810, 200);
        g.drawLine(10, 300, 810, 300);
        g.drawLine(10, 400, 810, 400);
        g.drawLine(10, 500, 810, 500);
        g.drawLine(10, 600, 810, 600);
        g.drawLine(10, 700, 810, 700);
        g.drawLine(10, 800, 810, 800);

        g.drawLine(10, 0, 10, 800);
        g.drawLine(110, 0, 110, 800);
        g.drawLine(210, 0, 210, 800);
        g.drawLine(310, 0, 310, 800);
        g.drawLine(410, 0, 410, 800);
        g.drawLine(510, 0, 510, 800);
        g.drawLine(610, 0, 610, 800);
        g.drawLine(710, 0, 710, 800);
        g.drawLine(810, 0, 810, 800);


        /*
        ImageIcon image ;

        image = new ImageIcon("wrook.gif");
        g.drawImage(image.getImage(), 1 * 44, 1 * 44, null);
        image = new ImageIcon("wking.gif");
        g.drawImage(image.getImage(), 10 * 44, 1 * 44, null);
        image = new ImageIcon("wqueen.gif");
        g.drawImage(image.getImage(), 8 * 44, 1 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 1 * 44, 3 * 44, null);
        image = new ImageIcon("wbishop.gif");
        g.drawImage(image.getImage(), 5 * 44, 1 * 44, null);
        image = new ImageIcon("wknight.gif");
        g.drawImage(image.getImage(), 3 * 44, 1 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 3 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 5 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 8 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 10 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 12 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 14 * 44, 3 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 17 * 44, 3 * 44, null);

/*
        image = new ImageIcon("wrook.gif");
        g.drawImage(image.getImage(), 1 * 44, 16 * 44, null);
        image = new ImageIcon("wking.gif");
        g.drawImage(image.getImage(), 10 * 44, 16 * 44, null);
        image = new ImageIcon("wqueen.gif");
        g.drawImage(image.getImage(), 8 * 44, 16 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 1 * 44, 14 * 44, null);
        image = new ImageIcon("wbishop.gif");
        g.drawImage(image.getImage(), 5 * 44, 16 * 44, null);
        image = new ImageIcon("wknight.gif");
        g.drawImage(image.getImage(), 3 * 44, 16 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 3 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 5 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 8 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 10 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 12 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 14 * 44, 14 * 44, null);
        image = new ImageIcon("wpawn.gif");
        g.drawImage(image.getImage(), 17 * 44, 14 * 44, null);

 */


        for (int x = 0; x < 8; x = x + 1) {
            for (int y = 0; y < 8; y = y + 1) {
                if (chess.position[x][y] != null) {
                    chess.position[x][y].Draw(g, x, y);
                }
            }
        }
    }

        public static Piece[][] position = new Piece[8][8];


        //  public static boolean W(int y) {

   /* public static boolean isWhite(int x){
            if () {
                return true;
            }
            return false;


            if (w == isWhite(x)){

            }
        }


    //   public static void main(String[] args) {
       //     position[0][4] = new King();


    */

    }








