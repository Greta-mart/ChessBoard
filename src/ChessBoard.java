public class ChessBoard {
    int length;
    int width;

    ChessBoard(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void chessBoardDrawing() {
        for (int i = 0; i < this.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < this.width; j++) {
                    if (j % 2 == 0) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            } else {
                System.out.println();
                for (int j = 0; j < this.width; j++) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
