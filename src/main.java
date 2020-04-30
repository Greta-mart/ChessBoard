import static java.lang.Integer.parseInt;

public class main {
    public static void main(String[] args) {
        chessBoard board = new chessBoard();

        int length=0;
        int width=0;
        if (args.length > 0)
            try {
            width = Integer.parseInt(args[0]);
            length = Integer.parseInt(args[1]);
        }
        catch (NumberFormatException e) {
                System.err.println("Argument" + " must be an integer");
                System.exit(1);
        }
        else {
            System.out.println("Please insert width and length after name of class");
        }
        board.chessBoard(length, width);
    }
}
