import java.awt.*;
import java.applet.*;

public class Scene extends Applet {

    public void paint(Graphics g){
        Background.drawSky(g);
        Background.drawSun(g);
        Background.drawGround(g);
        Mountains.drawMountain1(g);
        Mountains.drawMountain2(g);
        Mountains.drawMountain3(g);
        Lake.drawLake(g);
        RedGyrados.drawGyrados(g);

    }
}
