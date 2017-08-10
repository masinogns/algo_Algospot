/**
 * Created by masinogns on 2017. 8. 10..
 *
 * 자연수 n이 주어졌을 때 1부터 n까지의 합을 반환하는 함수 sum()의 구현
 * for 문과 recursive 이용
 *
 */
public class code6_1 {

    public static void main(String[] args) {
        int until = 10, iteratorSumValue = 0, recursiveSumValue = 0;
//        iteratorSumValue = iteratorSum(until);
//        recursiveSumValue = recursiveSum(until);
//
//        System.out.println(iteratorSumValue);
//        System.out.println(recursiveSumValue);
    }

    public int recursiveSum(int until) {
        int ret = 0;

        for (int i = 1; i <= until; i++){
            ret += i;
        }
        return ret;
    }

    public int iteratorSum(int until) {
        if (until == 1) return 1;
        return until + recursiveSum(until - 1);
    }
}
