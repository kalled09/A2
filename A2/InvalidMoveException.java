/**
 * Signals an attempt to play an invalid move
 *
 * @author David Furcy
 * @version 3/7/2021
 */
public class InvalidMoveException extends RuntimeException
{
    /**
     * Constructor for objects of class InvalidMoveException
     */
    public InvalidMoveException()
    {
        super("Invalid move. Please try again.");
    }// constructor

    
}// InvalidMoveException class
