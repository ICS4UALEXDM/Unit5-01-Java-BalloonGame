import java.awt.Color;

/**
* This program calculates amount of mean median and mode.
*
* @author  Alex De Meo
* @version 1.0
* @since   2023/02/08
*/

public class Main {
    public static void main(String[] args) {
        // creating the balloon and spike objects
        Balloon balloon1 = new Balloon(80, 14, Color.GREEN, 1);
        Spike spike = new Spike(30);

        // This next section we will be hardcoding input to show that all
        // the methods work
        System.out.println("Initial values for balloon1 | X: "
                + balloon1.positionX + " | Y: " + balloon1.positionY + " | id: "
                + balloon1.id + " | Popped? " + balloon1.popped
                + " | RGB Color Value: " + balloon1.color);
        System.out.println("Initial position for the spike is x: "
                + spike.positionX + " | y: 0");
        // using the methods to manipulate the first balloon
        System.out.println("Changing color of balloon1 to Blue. And moving it's"
            + "position to x: 80 | y: 0");
        balloon1.changeColor(Color.BLUE);
        balloon1.moveBalloon(80, 0);
        System.out.println(outputB(balloon1));
        System.out.println("Moving spike to x: 80 | y: 0");
        spike.moveSpike(80);
        System.out.println(outputS(spike));
        spike.popBalloon(balloon1);
        System.out.println(outputB(balloon1));
    }

    /**
    * This is the method returns a string.
    *
    * @param spike This is the spike that the output is being based off
    * @return A string that will be outputted
    */

    public static String outputS(Spike spike) {
        return "The spike's new position is x: " + spike.positionX + " | y: 0";
    }

    /**
    * This is the method returns a string.
    *
    * @param balloon This is the balloon that the output is being based off
    * @return A string that will be outputted
    */
    public static String outputB(Balloon balloon) {
        return (balloon.popped) ? "Balloon" + balloon.id + " has been popped"
            : "New values for balloon" + balloon.id + " | X: "
                + balloon.positionX + " | Y: " + balloon.positionY + " | id: "
                + balloon.id + " | Popped? " + balloon.popped
                + " | RGB Color value: " + balloon.color;
    }
}
