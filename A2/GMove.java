
/**
 * Represents one (potential) move in the Giraffe game
 *
 * @author YOUR NAME
 * @version 3/21/21
 */
public class GMove
{
    private int startRow;     // location/row of stack to be moved
    private int startColumn;  // location/column of stack to be moved
    private int endRow;       // target location/row of the stack
    private int endColumn;    // target location/column of the stack    
    private String player;    // player owning the stack to be moved
    private int height;       // number of checkers in the stack to be moved
    private int endHeight;    // number of checkers in target location ...
    // ... after the move is completed
    private char direction;   // direction of the move
    private char type;        // type of move: 'p', 'c', or 's'
    private GBoard board;     // board on which the move is made

    /**
     * Constructor for objects of class GMove: initializes the four given 
     * instance variables and checks the validity of the moves using the 
     * method below.  
     * Throws an exception if the move is not valid.
     * 
     * @param  board    board on which the move is made
     * @param  row      name of the row of the stack to be moved
     * @param  column   name of the column of the stack to be moved
     * @param  dir      direction of the move: 'u', 'r', 'd', or 'l'
     */
    public GMove(GBoard board, char row, char column, char dir) throws Exception
    {
        
        
        this.board = board;
        startRow = row;
        startColumn = column;
        direction = dir;
        
        //dir = GPlayer.playAMove();
        
        throw new InvalidMoveException();
        //Grabs board and stack position, with direction going to move
    }// GMove constructor

    /**
     * Performs this move (knwon to be valid) by updating 
     * the board accordingly.
     */
    public void playIt()
    {

    }// playIt method
    /**
     * Checks if this move is valid; if so, sets the values of the 
     * following instance variables:
     *    endRow, endColumn, player, height, endHeight, type 
     * Otherwise, throws an InvalidMoveException.
     */
    private void checkValidity()
    {
        

    }// checkMoveValidity method
    /***************************************************************
     *    Implement your helper methods (if any) below
     *    These helper methods MUST all be private.
     ***************************************************************/

    private char positionalMove(char direction)
    {
        
        if(direction == 'u')
        {
            endRow = startRow + 1;
            stackingMove(height, endHeight);
            return 'p';
        } else if(direction == 'r')
        {
            endColumn = startColumn + 1;
            stackingMove(height, endHeight);
            return 'p';
        } else if(direction == 'd')
        {
            endRow = startRow - 1;
            stackingMove(height, endHeight);
            return 'p';
        } else if(direction == 'l')
        {
            endColumn = startColumn - 1;
            stackingMove(height, endHeight);
            return 'p';
        } 
        
        return 'i';
        
    }

    private int stackingMove(int height, int endHeight) 
    {

        if(endHeight >= height)
        {
            if(positionalMove(direction) == 'p')
            {
                height += endHeight;
                
            }
        } else
        {
            throw new InvalidMoveException();
        }

        return height;
    }
    
    private void capturingMove()
    {
        if(height >= endHeight)
        {
            
            height += endHeight;
        }
        else
        {
            throw new InvalidMoveException();
        }
    }

}// GMove class
