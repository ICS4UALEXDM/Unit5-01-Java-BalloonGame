import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        // creating the balloon objects
        Balloon balloon1 = new Balloon(80, 14, Color.GREEN, 1);
        Balloon balloon2 = new Balloon(56, 23, Color.YELLOW, 2);
        Spike spike = new Spike(30);

        // This next section we will be hardcoding input to show that all
        // the methods work
        System.out.println("Initial values for balloon1 | X: "
                + balloon1.positionX + " | Y: " + balloon1.positionY + " | id: "
                + balloon1.id + " | Popped? " + balloon1.popped
                + " | RGB Color Value: " + balloon1.color);
        System.out.println("Initial values for balloon2 | X: "
                + balloon2.positionX + " | Y: " + balloon2.positionY + " | id: "
                + balloon2.id + " | Popped? " + balloon2.popped
                + " | RGB Color Value: " + balloon2.color);
        // using the methods to manipulate the first balloon
        balloon1.changeColor(Color.BLUE);
        balloon1.moveBalloon(0, -14);
        System.out.println(output(balloon1));
    }

    public static String output(Balloon balloon) {
        return (balloon.popped) ? "Balloon" + balloon.id + " has been popped"
            : "New values for balloon" + balloon.id + " | X: "
                + balloon.positionX + " | Y: " + balloon.positionY + " | id: "
                + balloon.id + " | Popped? " + balloon.popped
                + " | RGB Color value: " + balloon.color;
    }
}
