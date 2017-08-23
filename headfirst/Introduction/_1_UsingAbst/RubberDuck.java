package _1_UsingAbst;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class RubberDuck extends DuckBaseClass {
    @Override
    public void display() {
        System.out.println("고무 오리처럼 생겼고 몸체는 노란색");
    }

    @Override
    public void quack() {
//        super.quack();
        //아무 것도 하지 않도록 함
    }

    @Override
    public void fly() {
//        super.fly();
        //아무 것도 하지 않도록 함
    }
}
