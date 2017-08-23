package _2_UsingInterfaces;

/**
 * Created by masinogns on 2017. 8. 23..
 *
 * 인터페이스로 하는 방법
 *
 * 변하는 부분인 fly와 quack부분을 분리한다
 *
 * 1. ImplMallardDuckClass - display, fly, quack
 * 2. ImplRedheadDuckClass - display, fly, quack
 * 3. ImplRubberDuckClass - display, quack
 * 4. ImplDecoyDuckClass - display
 *
 * 인터페이스를 구현할 때마다 메소드를 구현해주어야 해서
 * 만약 메소드의 내용이 바뀐다면 일일이 모든 오브젝트에 대한 내용을 바꿔야한다
 * 코드 재상용을 전혀 기대할 수 없게 되어 코드 관리면에서 아작난다
 *
 */
public abstract class DuckBaseClass {
    void swim(){
        System.out.println("오리는 수영을 할 수 있습니다");
    }

    abstract void display();
}
