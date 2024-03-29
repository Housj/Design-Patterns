import abstr.Shape;
import impl.GreenCircle;
import impl.RedCircle;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
