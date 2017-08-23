package _1_UsingAbst;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class DecoyDuck extends DuckBaseClass {
    @Override
    public void display() {
        System.out.println("나무로 된 가짜 오리처럼 생겼다 !");
    }

    @Override
    public void quack() {
//        super.quack();
        // 아무 것도 하지 않도록
    }

    @Override
    public void fly() {
//        super.fly();
        // 아무 것도 하지 않도록
    }
}
