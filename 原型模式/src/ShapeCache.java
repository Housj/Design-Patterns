import prototype.Circle;
import prototype.Rectangle;
import prototype.Shape;
import prototype.Square;

import java.util.Hashtable;

/**
 * @author sergei
 * @create 2019-09-02
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable<String,Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
