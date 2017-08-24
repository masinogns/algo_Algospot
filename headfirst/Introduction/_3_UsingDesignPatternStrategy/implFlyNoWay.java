package _3_UsingDesignPatternStrategy;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class implFlyNoWay implements InterfaceFlyable {
    @Override
    public void fly() {
        System.out.println("날 수 없음");
    }
}
