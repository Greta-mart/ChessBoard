import java.util.Scanner;

public class chessBoard {

    public void chessBoard(int lenght, int width) {
        for (int i = 0; i < width; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < lenght; j++)
                    System.out.print("* ");
            } else {
                System.out.println();
                for (int j = 0; j < lenght; j++)
                    System.out.print(" *");
                System.out.println();
            }
        }
    }
}
