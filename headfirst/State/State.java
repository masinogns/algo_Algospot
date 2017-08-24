package State;

/**
 * Created by masinogns on 2017. 8. 24..
 *
 * 모든 상태 클래스에서 사용할 인터페이스
 * 메소드는 뽑기 기계에서 일어날 수 있는 모든 행동들에 직접 대응된다
 * !!!!!!! 각 상태를 직접 클래스에 대응시킨다 !!!!!!!
 *
 * 계획 정리하기
 * 1. 뽑기 기계와 관련된모든 행동에 대한 메소드가 들어있는 State 인터페이스를 정의
 * 2. 기계의 모든 상태에 대해서 상태 클래스를 구현한다
 * (기계가 ㅇ떤 상태에 있다면 그 상태에 해당하는 상태 클래스가 모든 작업을 책임진다)
 * 3. 조건문 코드를 전부 없애고 상태 클래스에 모든 작업을 위임한다
 *
 * 모든 코드들이 서로다른 클래스에 분산된다
 */
public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
