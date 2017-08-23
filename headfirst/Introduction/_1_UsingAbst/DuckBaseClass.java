package _1_UsingAbst;

/**
 * Created by masinogns on 2017. 8. 23..
 *
 * 상속으로 하는 방법
 *
 * 1. void quack, swim, abstract display를 만든다
 * 2. _2_UsingInterfaces.ImplMallardDuckClass, RedheadDuck을 구현한다. 이 때까지는 아무 문제가 없다
 *
 * 2. 새로운 요구사항 Duck의 행동에 fly()를 넣어달라
 * 3. DuckBaseClass에 fly()를 추가한다
 *
 * 4. _1_UsingAbst.RubberDuck 추가(고무 오리)
 *  - 고무오리는 빽빽 소리를 낸다(quack 오버라이드 필요)
 *  - 고무오리는 날 수 없다.(fly 필요가 없다.) ---- 문제점 발생 !!
 *      - 그래서 fly override 를 한다 . 아무 내용 없이 아무것도 하지 않도록...
 *  - 고무오리는 노란색 몸체를 가지고 있다(display override)
 *
 * 5. _1_UsingAbst.DecoyDuck 추가(나무로된 가짜 오리)
 *  - 나무오리는 소리를 낼 수 없다(quack override) -- 아무 것도 하지 않도록
 *  - 나무오리는 날 수 없다(quack override) -- 아무 것도 하지 않도록
 *  - 나무오리는 갈색 몸체를 가지고 있다(display override)
 */
public abstract class DuckBaseClass {
    // void quack, swim, abstract display르
    public void quack(){
        System.out.println("오리는 꽥꽥하고 웁니다");
    }

    public void swim(){
        System.out.println("오리는 수영을 할 수 있습니다");
    }

    public abstract void display();

    // 새로운 요구사항에 따라 fly() 추가
    // 모든 DuckBaseClass를 상속하는 오리들은 fly도 할 수 있다
    public void fly(){
        System.out.println("오리가 난다 날아!!");
    }
}
