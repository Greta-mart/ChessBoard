package chessBoard;

public class main {
    public static void main(String[] args) throws Exception {
        chessBoard board = new chessBoard();

      //  try{
            board.inputData();
            board.exception();
        //}
        //catch (Exception ex){
            /* System.out.println(ex.getMessage()); */
        //}
        board.chessBoard();
    }
}
