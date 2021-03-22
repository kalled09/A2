
/**
 * Write a description of class GGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GGame extends Game
{
    public GGame()
    {
        super(new GBoard(null,6,6));
        
    }

    /**
     * Starts a game
     */
    public static void newGame()
    {
        new GGame().play();
    }//newGame method

    @Override
    public void setUp()
    {

    }

    @Override
    public boolean gameOver()
    {
        return false;
    }

    @Override
    public void wrapUp()
    {

    }
}
