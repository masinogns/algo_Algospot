import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * 최대 연속 부분 구간 합 시간 복잡도 : O(NlogN)
 *
 * 입력받은 배열을 우선 절반으로 잘라 왼쪽 배열과 오른쪽 배열로 나눈다
 * 이 때 우리가 원하는 최대 합 부분 구간은 두 배열 중 하나에 속해 있을 수도 있고
 * 두 배열 사이에 걸쳐 있을 수도 있다
 *
 * 이 때 각 경우의 답을 "재귀 호출과 탐욕법"을 이용해 계산하면
 * 훌륭한 분할 정복 알고리즘이 된다
 *
 */
public class code4_10_fast {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>(
                Arrays.asList(-7, 4, -3, 6, 3, -8, 3, 4)
        );

        int lo = 0, hi = 7;
        int maxSum = fastMaxSum(integerArrayList,lo, hi);
        System.out.println(maxSum);
    }

    // A[lo..hi]의 연속된 부분 구간의 최대 합을 구한다 시간 복잡도 O(NlogN)
    private static int fastMaxSum(ArrayList<Integer> integerArrayList, int lo, int hi) {
        // 기저 사례 : 구간의 길이가 1인 경
        if (lo == hi) return integerArrayList.get(lo);

        // 배열을 A[lo...mid], A[mid+1..hi]
        int mid = (lo + hi) / 2;
        // 두 부분에 모두 걸쳐 있는 최대 합 구간을 찾는다 이 구간은
        // A[i..mid]와 A[mid+1..j] 형태를 갖는 구간의 합으로 이루어진다
        // A[i..mid] 형태를 갖는 최대 구간을 찾는다
        int left = -128, right = -128, sum = 0;

        for (int i = mid; i >= lo; i--){
            sum += integerArrayList.get(i);
            left = max(left, sum);
        }

        // A[i..j]형태를 갖는 최대 구간을 찾는다
        sum = 0;
        for (int j = mid+1; j <= hi; j++){
            sum += integerArrayList.get(j);
            right = max(right, sum);
        }

        // 최대 구간이 두 조각 중 하나에만 속해 있는 경우의 답을 재귀 호출로 찾는다
        int single = max(
                fastMaxSum(integerArrayList, lo, mid),
                fastMaxSum(integerArrayList, mid+1, hi)
        );

        // 두 경우 중 최대치를 반환한다
        return max(left+right, single);
    }

    public static int max(int a, int b){
        int result = 0;

        if (a < b){
            result = b;
        }else result = a;

        return result;
    }
}
