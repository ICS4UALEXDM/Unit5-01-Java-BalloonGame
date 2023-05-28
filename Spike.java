/**
* This program calculates amount of mean median and mode.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public class Spike {
    // creating the fields
    public static final int POSITION_Y = 0;
    int positionX;

    /**
    * This is the method returns a string.
    *
    * @param posX This is the x-position of the spike
    */

    public Spike(int posX) {
        positionX = posX;
    }

    /**
    * This is the method pops the balloon.
    *
    * @param balloon This is the object to manipulate
    */

    public void popBalloon(Balloon balloon) {
        if (balloon.positionX == this.positionX
                && balloon.positionY == POSITION_Y) {
            balloon.popped = true;
        }
    }

    /**
    * This is the method moves the spike.
    *
    * @param amount This is the new x-position of the spike
    */

    public void moveSpike(int amount) {
        // Changing the x value of the spike
        this.positionX = amount;
    }
}
