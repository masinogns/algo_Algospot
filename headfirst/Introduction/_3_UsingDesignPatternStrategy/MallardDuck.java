package _3_UsingDesignPatternStrategy;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class MallardDuck extends DuckBaseClass {
    public MallardDuck() {
        quackable = new implQuack();
        flyable = new implFlayWithWigns();
    }

    @Override
    public void display() {
        System.out.println("저는 물 오리입니다");
    }

}
