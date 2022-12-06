import java.awt.*;
import java.awt.Color;

public class House {

    public static void drawHouse(Graphics g) {
        House.drawWalls(g);
        House.drawWindows(g);
        House.drawDoor(g);
        House.drawRoof(g);
    }

    public static void drawWalls(Graphics g) {
        g.drawLine(1,1,1,1);
    }

    public static void drawWindows(Graphics g) {
        g.drawLine(1,1,1,1);
    }

    public static void drawDoor(Graphics g) {
        g.drawLine(1,1,1,1);
    }

    public static void drawRoof(Graphics g) {
        g.drawLine(1,1,1,1);
    }

}
