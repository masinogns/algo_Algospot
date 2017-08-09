import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * 최대 연속 부분 구간 합 문제 : 무식하게 풀기
 * 시간 복잡도 : O(N^2)
 *
 */
public class code4_9_2 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(-7, 4, -3, 6, 3, -8, 3, 4)
        );

        int maxSum = betterMaxSum(integerArrayList);
        System.out.println(maxSum);

    }

    private static int betterMaxSum(ArrayList<Integer> integerArrayList) {
        int N = integerArrayList.size(), ret = -128;

        for (int i = 0; i < N; i ++){
            int sum = 0;
            for (int j = i; j < N; j++){
                // 구간 A[i...j]의 합을 구한다
                sum += integerArrayList.get(j);
                if (ret < sum) ret = sum;
            }
        }
        return ret;
    }
}
