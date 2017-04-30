/**
 *
 * @author Anya, Joe and Jenna
 */
public class ChessGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ChessBoard2 game = new ChessBoard2();
        System.out.println(game.printBoard());
        System.out.println("Call Made: 'E2H2'");
        game.Move("E2H2");
        System.out.println("Move starts at:\nRow 1: "+game.getRow1()+" Col 1: "+game.getCol1()+"\nMove ends at:\nRow 2: "+game.getRow2()+" Col 2: "+game.getCol2());
        
    }
    
    
    
}