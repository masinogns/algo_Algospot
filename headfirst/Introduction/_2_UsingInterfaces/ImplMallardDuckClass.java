package _2_UsingInterfaces;

/**
 * Created by masinogns on 2017. 8. 23..
 */
public class ImplMallardDuckClass extends DuckBaseClass implements InterfaceQuackable, InterfaceFlyable{

    @Override
    public void fly() {
        System.out.println("날 수 있습니다");
    }

    @Override
    public void quack() {
        System.out.println("꽥꽥하고 울 수 있습니다");
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck처럼 생겼습니다");
    }
}
