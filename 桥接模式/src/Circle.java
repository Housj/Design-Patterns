import abstr.Shape;
import 单纯享元.inter.DrawAPI;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class Circle extends Shape {

    private int x,y,radius;

    public  Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
