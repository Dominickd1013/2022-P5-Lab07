import java.awt.*;
import java.awt.Color;

public class Mountains {

    public static void drawMountain1(Graphics g) {
        int leftpoint = 0;
        int leftpointheight = 350;
        int midpoint = 150;
        int midpointheight = 150;
        int rightpoint = 300;
        int rightpointheight = 350;

        int x[] = {leftpoint, midpoint, rightpoint};
        int y[] = {leftpointheight, midpointheight, rightpointheight};

        Color gray = new Color(75, 75, 75);
        g.setColor(gray);
        g.fillPolygon(x, y, 3);
    }

    public static void drawMountain2(Graphics g) {

        int leftpoint = -50;
        int leftpointheight = 350;
        int midpoint = 100;
        int midpointheight = 150;
        int rightpoint = 250;
        int rightpointheight = 350;

        int x[] = {leftpoint, midpoint, rightpoint};
        int y[] = {leftpointheight, midpointheight, rightpointheight};

        Color gray = new Color(75, 75, 75);
        g.setColor(gray);
        g.fillPolygon(x, y, 3);
    }

    public static void drawMountain3(Graphics g) {

        int leftpoint = -50;
        int leftpointheight = 350;
        int midpoint = 100;
        int midpointheight = 175;
        int rightpoint = 250;
        int rightpointheight = 350;

        int x[] = {leftpoint, midpoint, rightpoint};
        int y[] = {leftpointheight, midpointheight, rightpointheight};

        Color gray = new Color(175, 175, 175);
        g.setColor(gray);
        g.fillPolygon(x, y, 3);
    }
}





