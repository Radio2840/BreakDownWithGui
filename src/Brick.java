import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Brick {
    Random rand = new Random();

    private Color colorRGB;
    final public int sizex=80;
    final public int sizey=30;

    public Brick(Color colorRGB) {
        this.colorRGB = colorRGB;
    }

    public Color ColorRGB(){
        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        return new Color(r,g,b);
    }
}
