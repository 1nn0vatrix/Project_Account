
public class ChessBoard {

	private ChessPiece[][] board = new ChessPiece[8][8];

	public ChessBoard() {
		board[0][0] = new Rook(Color.black);
		board[0][1] = new Knight(Color.black);
		board[0][2] = new Bishop(Color.black);
		board[0][3] = new Queen(Color.black);
		board[0][4] = new King(Color.black);
		board[0][5] = new Bishop(Color.black);
		board[0][6] = new Knight(Color.black);
		board[0][7] = new Rook(Color.black);
		board[1][0] = new Pawn(Color.black);
		board[1][1] = new Pawn(Color.black);
		board[1][2] = new Pawn(Color.black);
		board[1][3] = new Pawn(Color.black);
		board[1][4] = new Pawn(Color.black);
		board[1][5] = new Pawn(Color.black);
		board[1][6] = new Pawn(Color.black);
		board[1][7] = new Pawn(Color.black);
		board[2][0] = null;
		board[2][1] = null;
		board[2][2] = null;
		board[2][3] = null;
		board[2][4] = null;
		board[2][5] = null;
		board[2][6] = null;
		board[2][7] = null;
		board[3][0] = null;
		board[3][1] = null;
		board[3][2] = null;
		board[3][3] = null;
		board[3][4] = null;
		board[3][5] = null;
		board[3][6] = null;
		board[3][7] = null;
		board[4][0] = null;
		board[4][1] = null;
		board[4][2] = null;
		board[4][3] = null;
		board[4][4] = null;
		board[4][5] = null;
		board[4][6] = null;
		board[4][7] = null;
		board[5][0] = null;
		board[5][1] = null;
		board[5][2] = null;
		board[5][3] = null;
		board[5][4] = null;
		board[5][5] = null;
		board[5][6] = null;
		board[5][7] = null;
		board[6][0] = new Pawn(Color.white);
		board[6][1] = new Pawn(Color.white);
		board[6][2] = new Pawn(Color.white);
		board[6][3] = new Pawn(Color.white);
		board[6][4] = new Pawn(Color.white);
		board[6][5] = new Pawn(Color.white);
		board[6][6] = new Pawn(Color.white);
		board[6][7] = new Pawn(Color.white);
		board[7][0] = new Rook(Color.white);
		board[7][1] = new Knight(Color.white);
		board[7][2] = new Bishop(Color.white);
		board[7][3] = new Queen(Color.white);
		board[7][4] = new King(Color.white);
		board[7][5] = new Bishop(Color.white);
		board[7][6] = new Knight(Color.white);
		board[7][7] = new Rook(Color.white);

	}

	public void printBoard()
	{
		for(int i = 0; i<8; i++)
		{
			System.out.println("| ");
			for(int j = 0 ; j<8; j++)
			{
				
			}
		}
	}
}
