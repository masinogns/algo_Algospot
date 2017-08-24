package _3_UsingDesignPatternStrategy;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class implMuteQuack implements InterfaceQuackable{
    @Override
    public void quack() {
        System.out.println("소리를 낼 수 없음");
    }
}
