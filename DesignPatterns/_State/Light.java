package _State;

/**
 * Created by masinogns on 2017. 8. 24..
 */
public class Light {

    protected  LightState lightState;

    private LightState offState = new LightState() {
        // 꺼져있는 상태에서 불을 키면 켜진 상태로 바뀐다
        @Override
        public void on() {
            System.out.println("Light ON");
            lightState = onState;
        }

        // 켜져있는 상태에서 불을 다시 끄면 아무일도 발생하지 않는다
        // 이미 불이 꺼져있기 때문에
        @Override
        public void off() {
            System.out.println("Nothing");
        }
    };

    private LightState onState = new LightState() {
        // 켜져있는 상태에서 불을 다시 키면 아무일도 발생하지 않는다
        // 이미 불이 켜져있기 때문에
        @Override
        public void on() {
            System.out.println("Notight");
        }

        // 켜져있는 상태에서 불을 끄면 꺼진 상태로 바뀐다
        @Override
        public void off() {
            System.out.println("Light OFF");
            lightState = offState;
        }
    };

    public Light() {
        // 처음 객체 생성 시의 상태 설정
        lightState = offState;
    }


    public void on(){
        lightState.on();
    }

    public void off(){
        lightState.off();
    }
}

interface LightState{
    void on();
    void off();
}

/**
 * 전략 패턴과 상태 패턴은 거의 똑솔
 * state 패턴은 스스로 변환 할 수 있는데 반해 strategy 패턴은 외부에서 데이터의 입력이 필요 하다.
 출처: http://jongyoungcha.tistory.com/entry/디자인-패턴-state-패턴과-strategy-패턴에-대해 [Do it now]

 * 전략 패턴
 * 총을 아무리 써도 검 상태로 변하지 않음 외부 밖에서 직접 바꿈
 *
 * 상태 패턴
 * 상태 패턴은 내부족으로 바뀜
 * 꺼지고 켜지는 것만 알면 되지!!
 */