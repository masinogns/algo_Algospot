package _3_UsingDesignPatternStrategy;

/**
 * Created by masinogns on 2017. 8. 23..
 *
 * 바뀌는 부분과 그렇지 않은 부분 분리하기 !!!!!!!
 *
 * fly와 quack 문제를 제외하면 Duck 클래스는 잘 작동하고 있다
 *
 * 변화하는 부분의 클래스(오리의 행동)
 *  - 나는 것과 관련된 집합
 *  - 꽥꽥거리는 것과 관련된 집합
 *      - 꽥꽥 구현
 *      - 삑삑 구현
 *      - 아무 소리도 내지 않는 클래스 구현
 *
 * 그대로 있는 부분의 클래스
 *
 * quackable은 인터페이스 변수는 인터페이스 형식이기 때문에
 * 다형성을 활용하여 실행 시에 동적으로 InterfaceQuackable을 구현한 다른 클래스를 할당할 수 있습니다
 *
 * Interface 변수에 대한 구현은 다른 클래스에서 하고 각 객체들을 생성할 때 new를 해준다!!
 *
 * 동적으로 행동을 지정하기 위해서 Duck class에 setter를 생성해주면 된다
 */
public abstract class DuckBaseClass {
    InterfaceFlyable flyable;
    InterfaceQuackable quackable;

    public void performQuack(){
        // quack을 실행시킬 줄만 안다
        quackable.quack();
    }

    public void performFly(){
        // fly를 실행시킬 줄만 안다
        flyable.fly();
    }

    public void swim(){
        System.out.println("수영을 할 줄 압니다");
    }

    public abstract void display();
}
