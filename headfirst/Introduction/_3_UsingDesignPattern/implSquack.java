package _3_UsingDesignPattern;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class implSquack implements InterfaceQuackable {
    @Override
    public void quack() {
        System.out.println("고무 오리의 삑삑 소리를 냄");
    }
}
