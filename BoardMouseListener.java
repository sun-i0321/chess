import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import static java.lang.Math.random;

public class BoardMouseListener implements MouseListener {


    Random random = new Random();

    public static int startx, endx, x;
    public static int starty, endy, y;
    public boolean ifNotPlayer = true;


   /* public void PlayerMove() {

            while (true) {
                startx = random.nextInt(0, 8);
                starty = random.nextInt(0, 8);
                endx = random.nextInt(0, 8);
                endy = random.nextInt(0, 8);

                if (chess.position[startx][starty] != null && !chess.position[startx][starty].isWhite && chess.position[startx][starty].canMove(startx, starty, endx, endy, chess.position)) {
                    chess.position[startx][starty] = null;
                    chess.position[endx][endy] = chess.position[startx][starty];

                    chess.line.repaint();
                    break;
                }
            }

        }





        /*    while (true) {


        startx = random.nextInt(0, 8);
        starty = random.nextInt(0, 8);
        endx = random.nextInt(0, 8);
        endy = random.nextInt(0, 8);






    }


         */



        public void mouseClicked (MouseEvent e){


    }

        @Override
        public void mousePressed (MouseEvent e){

            if(ifNotPlayer) {
                startx = e.getX() / 100;
                starty = e.getY() / 100;
            }
    }

        @Override
        public void mouseReleased (MouseEvent e){


        while (true) {
            if (ifNotPlayer) {

                endx = e.getX() / 100;
                endy = e.getY() / 100;
                chess.position[endx][endy] = chess.position[startx][starty];
                //   chess.position[startx][starty] = null;
                chess.line.repaint();

                // for (int x = 0; x < 7; x = x + 1) {
                startx = random.nextInt(0 , 8 );
                starty = random.nextInt(0,  8);
                endx = random.nextInt(0,  8);
                endy = random.nextInt(0 ,  8);
                //  if (startx < x && starty < x && endy < x && endx < x) {
                if (chess.position[startx][starty] == null) {
                    continue;
                } else if (startx == endx && starty == endy) {
                    continue;
                } else if (chess.position[startx][starty].isWhite) {
                    continue;
                }

                chess.line.repaint();
                whoisWinner();
             //   ifNotPlayer = false;
               // PlayerMove();
                break;


                //   }
                //  } else {


                //  }


            }
        }

    }
    public void PlayerMove() {
        Thread MoveThread = new Thread() ;
        while (!ifNotPlayer) {
            startx = random.nextInt(0, 8);
            starty = random.nextInt(0, 8);
            endx = random.nextInt(0, 8);
            endy = random.nextInt(0, 8);

            if (chess.position[startx][starty] != null && !chess.position[startx][starty].isWhite && chess.position[startx][starty].canMove(startx, starty, endx, endy, chess.position)) {
                chess.position[startx][starty] = null;
                chess.position[endx][endy] = chess.position[startx][starty];

                chess.line.repaint();
                whoisWinner();
                ifNotPlayer =true;
                break;
            }
        }
        MoveThread.start();

    }



        @Override
        public void mouseEntered (MouseEvent e){

    }

        @Override
        public void mouseExited (MouseEvent e){

    }

    public void whoisWinner(){
        if (Piece.white == null) {
            System.out.println("black wins");
        }
        else if (Piece.black == null) {
            System.out.println("White wins");
        }
    }



        // if Math. absolute(sx-ex) =< 0   Math. absolute(sy-ey) =< 0
        // can move
        // canMove(sx,sy,ex,ey)
    }

