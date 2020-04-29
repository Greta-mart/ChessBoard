package chessBoard;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class chessBoard {

    int lenght;
    int width;


    void inputData () throws Exception {
        Scanner in = new Scanner(System.in);

        //try {
            System.out.print("Insert length of chess board: ");
            this.lenght = in.nextInt();
          //  if (lenght == parseInt(null)) throw new Exception("Null");

            System.out.print("Insert width of the chess board: ");
            this.width = in.nextInt();
            //if (width == parseInt(null)) throw new Exception("Nulllkf");
        //}
        //catch (Exception ex){
            System.out.println("Fields length and width should contain only numbers.");
            System.out.println("Please, try again");
        //}
    }

    void exception(){
        try {
            if (lenght == Integer.parseInt(null)) throw new Exception();

            if (width == Integer.parseInt(null)) throw new Exception();
        }
        catch (Exception ex){
            System.out.println("Fields length and width should contain only numbers.");
            System.out.println("Please, try again");
        }
    }
     void chessBoard() {
        for (int i = 0; i < width; i++)
        {
            int n = i % 2;
            if (i == 0 || n == 0) {
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
