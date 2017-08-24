import _2_UsingInterfaces.ImplMallardDuckClass;
import _3_UsingDesignPatternStrategy.DuckBaseClass;
import _3_UsingDesignPatternStrategy.MallardDuck;
import org.junit.Test;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class MallardDuckTest {
    @Test
    public void usingDesignPattern(){
        DuckBaseClass mallardDuck = new MallardDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }

    @Test
    public void usingInterface(){
        ImplMallardDuckClass mallardDuck2 = new ImplMallardDuckClass();

        mallardDuck2.display();
        mallardDuck2.fly();
        mallardDuck2.quack();
    }

    @Test
    public void usingAbst(){
        _1_UsingAbst.DuckBaseClass mallardDuck3 = new _1_UsingAbst.MallardDuck();

        mallardDuck3.display();
        mallardDuck3.fly();
        mallardDuck3.quack();
    }
}