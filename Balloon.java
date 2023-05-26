import java.awt.*;

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

    public void moveBalloon(int xChange, int yChange) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current x and y values
        this.positionX += xChange;
        this.positionY += yChange;
    }

    public void changeColor(Color newColor) {
        // "This." is a reference to the current object. In this case, it is
        // reassigning the current color
        this.color = newColor;
    }

}
