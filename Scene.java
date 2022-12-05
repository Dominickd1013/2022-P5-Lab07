import java.awt.*;
import java.applet.*;

public class Scene extends Applet {

    public void paint(Graphics g){

        House.drawHouse(g);
        Background.drawBackground(g);
    }
}
