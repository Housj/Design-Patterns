package abstractFactory;

/**
 * @author sergei
 * @create 2019-09-01
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
