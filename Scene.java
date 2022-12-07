import java.awt.*;
import java.applet.*;
import java.awt.Color;

public class Scene extends Applet {

    public void paint(Graphics g){

        Background.drawSky(g);
        Background.drawSun(g);
        Background.drawGround(g);
        Background.drawClouds(g);
        Mountains.drawMountain1(g);
        Mountains.drawMountain2(g);

    }
}
