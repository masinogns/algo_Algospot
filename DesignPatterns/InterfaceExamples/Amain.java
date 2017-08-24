package InterfaceExamples;

/**
 * Created by masinogns on 2017. 8. 19..
 */
public class Amain {
    public static void main(String[] args) {
        // Ainteface 선언 해주고 할당해주고
        AinterfaceImpl ainterface = new AinterfaceImpl();
        // 인터페이스의 funcA를 사용할 수 있는 통로를 제공한, 접점
        ainterface.funcA();

        // delegate
        Aobject aobject = new Aobject();
        aobject.funcAAA();
    }
}
