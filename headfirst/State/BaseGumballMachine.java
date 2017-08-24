package State;

import java.awt.print.Pageable;

/**
 * Created by masinogns on 2017. 8. 24..
 *
 * 뽑기 기계 컨트롤러용 자바 코드
 *
 * 1. 상태 몹기
 * 2. 행동 몹기
 * 3. 조건문을 통한 상태 역할 구현
 *
 * 처음 상태 : 동전 없음
 * 동전을 투입하면 상태는 "동전 있음"으로 바뀐다
 * 1. 동전을 반환하는 행동을 하면 "동전 없음"으로 바뀐다
 * 2. 기계의 손잡이를 돌리면 알맹이를 판매하는 행동을 한다
 * 알맹이를 내보냈을 때
 * 1. 알맹이가 > 0 면, "동전 없음"으로 상태가 바뀐다
 * 2. 알맹이가 = 0 면, "알맹이 매진"으로 상태가 바뀐다
 *
 * 상태
 // 알맹이 없음
 // 동전 없음
 // 동전 있음
 // 알맹이 배출
 *
 * 행동
 // 동전 투입
 // 동전 반환
 // 손잡이 돌리기
 // 알맹이 꺼내기
 */

public class BaseGumballMachine {

    // 상태 값 정의
    final static int SOLD_OUT = 0;      // 알맹이 없음
    final static int NO_QUARTER = 1;    // 동전 없음
    final static int HAS_QUARTER = 2;   // 동전 있음
    final static int SOLD = 3;          // 알맹이 배출

    // 봅기 긱를 상자에서 꺼내서 처음 설치하는 시점에서는 알맹이가 하나도 없다
    int state = SOLD_OUT;
    int count = 0;
    // 조건문을 써서 모든 가능한 상태를 확인한다


    public BaseGumballMachine(int count) {
        this.count = count;

        if (count>0){
            state = NO_QUARTER;
        }
    }

    // 동전 투입 시에 해야 할 일
    public void insertQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("동전은 한 개만 넣어주세요");
        }else if (state == SOLD_OUT){
            System.out.println("매진되었습니다.");
        }else if (state == SOLD){
            System.out.println("잠깐만 기다려주세요 알맹이가 배출되고 있습니다");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("동전이 투입되었습니다");
        }

    }

    // 현재 상태는 인스턴스 변수에 저장
    // 현재 상태를 이용해서 모든 행동 및 상태 전환을 처리


    // 동전 반환 시에 해야 할 일
    public void ejectQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("동전이 반환됩니다");
            state = NO_QUARTER;
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("동전을 넣어주세요");
        }else if (state == SOLD){
            System.out.println("이미 알맹이를 봅으셨습니다");
        }else if (state == SOLD_OUT){
            System.out.println("동전을 넣지 않으셨습니다 동전이 반환되지 않습니다");
        }
    }

    // 손잡이 돌렸을 때 해야 할 일
    public void turnCrank(){
        if (state == SOLD){
            System.out.println("손잡이는 한 번만 돌려주세요");
        }else if (state == NO_QUARTER){
            System.out.println("동전을 넣어주세요");
        }else if (state == SOLD_OUT){
            System.out.println("매진되었습니다");
        }else if (state == HAS_QUARTER){
            state = SOLD;
            dispense();
        }
    }

    // 알맹이 꺼낼 때 해야 할 일
    public void dispense(){
        if (state == SOLD){
            System.out.println("알맹이가 나가고있습니다");
            count -= 1;
            if (count == 0){
                System.out.println("더이상 알맹이가 없습니다");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        }else if (state == NO_QUARTER){
            System.out.println("동전을 꺼내주세요");
        }else if (state == SOLD_OUT){
            System.out.println("매진입니다.");
        }else if (state == HAS_QUARTER){
            System.out.println("알맹이가 나갈 수 없습니다");
        }
    }


    @Override
    public String toString() {
        return "남은 동전 갯수 :"+count;
    }
}
