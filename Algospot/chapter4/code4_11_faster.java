import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.max;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * 최대 연속 부분 구간 합 fast 시간 복잡도 : O(N) ; 이것도 모르는 부분
 *
 * 선형 시간에 푸는 방법 = 동적 계획법 사용
 * A[i]를 오른쪽 끝으로 갖는 구간의 최대 합을 반환하는 함수 : maxAt(i)
 * A[i]에서 끝나는 최대 합 부분 구간은 항상 A[i] 하나만으로 구성되어 있거나
 * A[i-1]를 오른쪽 끝으로 갖는 최대합 부분 구간의 오른쪽에 A[i]를 붙인 형태로 구성되어 있다
 * 따라서 maxAt()을 다음과 같은 점화식으로 표현할 수 있다
 * maxAt(i) = max(0, maxAt(i-1))+A[i] 몰라몰라..
 *
 *
 * */
public class code4_11_faster {

    public static final int MIN = Integer.MIN_VALUE;

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(-7, 4, -3, 6, 3, -8, 3, 4)
        );

        int maxSum = fastestMaxSum(integerArrayList);
        System.out.println(maxSum);
    }

    private static int fastestMaxSum(ArrayList<Integer> integerArrayList) {
        int N = integerArrayList.size(), ret = MIN, psum = 0;

        for (int i = 0; i < N; i++){
            psum = max(psum, 0) + integerArrayList.get(i);
            ret = max(psum, ret);
        }
        return ret;
    }
}
