import java.awt.*;
import java.awt.Color;

public class Background {

    public static void drawSky(Graphics g) {
        g.setColor(Color.orange);
        g.fillRect(0, 0, 750, 250);
    }

    public static void drawSun(Graphics g) {
        Color yellow = new Color(255,225,0);
        g.setColor(yellow);
        g.fillOval(600,-100, 225, 225);
    }

    public static void drawGround(Graphics g) {
        Color green = new Color(0,145,0);
        g.setColor(green);
        g.fillRect(0, 250, 750, 250);
    }

    public static void drawClouds(Graphics g){
        Color gray = new Color(153, 153, 153);
        g.setColor(gray);
        g.fillOval(50, 50, 50, 50);
    }

}

