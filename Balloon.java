import java.awt.*;

/**
* This program calculates amount of mean median and mode.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public class Balloon {
    // Creating the fields
    int positionX;
    int positionY;
    Color color;
    boolean popped;
    int id;

    public Balloon(int xp, int yp, Color mainColor, int mainId) {
        // Setting the values of the fields
        positionX = xp;
        positionY = yp;
        color = mainColor;
        popped = false;
        id = mainId;
    }

    /**
    * This is the method changes a ballon's position.
    *
    * @param xChange This is the new x-position
    * @param yChange This is the new y-position
    */

    public void moveBalloon(int xChange, int yChange) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current x and y values
        this.positionX = xChange;
        this.positionY = yChange;
    }

    /**
    * This is the method changes a ballon's color.
    *
    * @param newColor This is the color to be changed to
    */

    public void changeColor(Color newColor) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current color
        this.color = newColor;
    }

}
