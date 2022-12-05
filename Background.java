import java.awt.*;
import java.applet.*;

public class Background {

    public static void drawBackground(Graphics g){
        Background.drawSky(g);
    }

    public static void drawSky(Graphics g) {
        g.drawLine(50, 50, 50, 50);
    }

}

