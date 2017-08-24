package Adapters;

/**
 * Created by masinogns on 2017. 8. 19..
 */
public class AdapterImpl implements Adapter {
    @Override
    public Float twiceOf(Float f) {
//        return (float) Math.twice(f.doubleValue()); 이전에 구현한 것
        // 요구사항을 받아들여 바꾼 return문
        return Math.doubled(f.doubleValue()).floatValue();
    }

    @Override
    public Float halfOf(Float f) {
        // 요구 사항을 받아들여 half에 로그를 찍는 함수
        System.out.println("half 함수 호출");

        return (float) Math.half(f.doubleValue());
    }
}
