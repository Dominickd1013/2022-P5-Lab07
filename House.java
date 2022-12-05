import java.awt.*;
import java.applet.*;

public class House {

    public static void drawHouse(Graphics g) {
        House.drawWalls(g);
        House.drawWindows(g);
        House.drawDoor(g);
        House.drawRoof(g);
    }

    public static void drawWalls(Graphics g) {
        g.drawLine(50, 50, 50, 50);
    }

    public static void drawWindows(Graphics g) {
        g.drawLine(150, 150, 50, 50);
    }

    public static void drawDoor(Graphics g) {
        g.drawLine(250, 250, 50, 50);
    }

    public static void drawRoof(Graphics g) {
        g.drawLine(550, 550, 50, 50);
    }

}
