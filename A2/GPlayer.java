import java.util.Scanner;
/**
 * Write a description of class GPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GPlayer extends Player
{
    //GMove move = new GMove();
    String move;
    
    public GPlayer(String name, Game game)
    {
        super(name,game);
        
    }
    
    @Override
    public void playAMove()
    {
        try
        {
            Scanner scan = new Scanner(System.in);
            move = scan.nextLine();
        }
        catch(InvalidMoveException e)
        {
            
        }
    }
}
