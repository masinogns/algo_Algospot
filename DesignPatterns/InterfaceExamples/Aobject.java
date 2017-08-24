package InterfaceExamples;

/**
 * Created by masinogns on 2017. 8. 19..
 */
public class Aobject {

    Ainterface ainterface;

    public Aobject() {
        ainterface = new AinterfaceImpl();
    }

    public void funcAAA(){
//        ~AAA 2개를 출력하 기능이 필요합니다 , 개발해주세요. -> Interface를 이용해서 개발해 주세요를 명시
        //어떤 출력 기능을 사용하기 위해서 Ainterface라는 객체의 기능을 위임하여 기능을 구현
//        System.out.println("AAA");
//        System.out.println("AAA");
        ainterface.funcA();
        ainterface.funcA();
    }
}
