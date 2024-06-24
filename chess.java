import javax.swing.*;

public class chess {


    static line line;


    public static void main(String[] args) {
        position[0][1] = new Pawn(false);
        position[2][0] = new Bishop(false);
        position[5][0] = new Bishop(false);
        position[1][0] = new Knight(false);
        position[6][0] = new Knight(false);
        position[4][0] = new King(false);
        position[3][0] = new Queen(false);
        position[0][0] = new Rook(false);
        position[7][0] = new Rook(false);
        position[0][6] = new Pawn(true);
        position[1][6] = new Pawn(true);
        position[2][6] = new Pawn(true);
        position[3][6] = new Pawn(true);
        position[4][6] = new Pawn(true);
        position[5][6] = new Pawn(true);
        position[6][6] = new Pawn(true);
        position[7][6] = new Pawn(true);
        position[1][1] = new Pawn(false);
        position[2][1] = new Pawn(false);
        position[3][1] = new Pawn(false);
        position[4][1] = new Pawn(false);
        position[5][1] = new Pawn(false);
        position[6][1] = new Pawn(false);
        position[7][1] = new Pawn(false);
        position[2][7] = new Bishop(true);
        position[5][7] = new Bishop(true);
        position[1][7] = new Knight(true);
        position[6][7] = new Knight(true);
        position[4][7] = new King(true);
        position[3][7] = new Queen(true);
        position[0][7] = new Rook(true);
        position[7][7] = new Rook(true);


        JFrame window = new JFrame("chess");
        window.setSize(820, 900);

         line = new line();
        window.add(line);

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

        line.addMouseListener(new BoardMouseListener());
    }


        public static Piece[][] position = new Piece[8][8];


       // position[1][2] = new knight(true);


}