import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * 최대 연속 부분 구간 합 문제 : 무식하게 풀기
 * 배열의 모든 부분 구간을 순회하면서 그 합을 계산한다
 *
 * 시간 복잡도 N^3 o(N^2)개의 후보 구간을 검사하고 o(N)번의 각 구간의 합을 구하는데 걸린다
 *
 * for // 구간 앞 i 자리를 정하기
 * for // 구간 뒷 j 자리를 정하기
 * 구간 A[i..j]의 합을 구한다
 * for // 구간 i..j 더하기
 *
 */
public class code4_9_1 {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(-7, 4, -3, 6, 3, -8, 3, 4)
        );

        int maxSum = inefficientMaxSum(integerArrayList);
        System.out.println(maxSum);
    }

    private static int inefficientMaxSum(ArrayList<Integer> integerArrayList) {
        int N = integerArrayList.size(), ret = -128;

        for (int i = 0; i < N ; i++){
            for (int j = 0; j < N; j++){
                //구간 A[i...j]의 합을 구한다
                int sum = 0;
                for (int k = i; k <= j; k++)
                    sum += integerArrayList.get(k);

                if (ret < sum) ret = sum;
            }
        }
        return ret;
    }
}
