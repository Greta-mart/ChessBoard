public class Main {
    public static void main(String[] args) {
        int length = 0;
        int width = 0;

        if (args.length == 2) {
            try {
                length = Integer.parseInt(args[0]);
                width = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + " must be an integer");
                System.exit(1);
            }
        }
        else {
            System.out.println("Please insert width and length after name of class");
            System.exit(1);
        }

        if (length > 0 && width > 0) {
            ChessBoard board = new ChessBoard(length, width);
            board.chessBoardDrawing();
        } else
            System.out.println("The width and length should be greater than 0");
    }
}
