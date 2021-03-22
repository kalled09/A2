
/**
 * Write a description of class GBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GBoard extends Board
{
    public GBoard(Game game, int rows, int col)
    {
        super(null, rows, col);
        
        
        
       // Object pieceLocation = new Board.getPiece(rows, col);
    } //FIXME?

    protected void display()
    {
        for(rows = 0; rows < board.length; rows++)
        {
            for(int col = 0; col < board[0].length; col++)
            {
                System.out.print(board[rows][col]);
            }
        }
    }
    
    //Implement helper methods
    
    public void modifyPiece()
    {
        
    }
}
