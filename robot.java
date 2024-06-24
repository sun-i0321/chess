import java.awt.Robot;

public class robot {
    public static void main(String[] args) {


        try {
            Robot robot = new Robot();

            robot.mouseMove(10, 10);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}



