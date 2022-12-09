import java.awt.*;
import java.awt.Color;

public class RedGyrados {

    public static void drawGyrados(Graphics g) {
        Color red = new Color(255, 0, 0);
        g.setColor(red);
        g.fillArc(500, 350, 40, 40, 0, 110 );
        g.fillArc(538, 350, 40, 40, 15, 165);
        g.fillArc(495, 335, 40, 40, 110, 180);
        g.fillArc(520, 350, 40, 40, 180, 180 );
        g.fillOval(490,335, 40,40);
        g.setColor(Color.black);
        g.fillOval(500,345, 5,5);
        g.fillOval(515,345, 5,5);

    }
}
