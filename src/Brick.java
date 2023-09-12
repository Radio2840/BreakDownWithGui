import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brick {
    Random rand = new Random();

    private Color colorRGB;
    final private int sizea=5;
    final private int sizeb=10;
    private int positionX;
    private int positionY;

    public Brick( int positionX, int positionY) {
        this.colorRGB = ColorRGB();
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public Color ColorRGB(){
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r,g,b);
    }
    public boolean didItHitMe(){
        return false;
    }
}
