import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * M-1일의 이동평균과 M일의 이동 평균에 포함되는 숫자들의 중복
 */
public class code4_4 {
    public static void main(String[] args) {
        ArrayList<Double> inputArrayList = new ArrayList<>(
                Arrays.asList(9.3,8.1,7.7,4.4,1.1,6.4,4.4,7.2)
        );

        int M = 2;

        ArrayList<Double> ret = movingAverage1(inputArrayList, M);

        Iterator iterator = ret.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private static ArrayList<Double> movingAverage1(ArrayList<Double> inputArrayList, int M) {
        ArrayList<Double> ref = new ArrayList<>();

        int N = inputArrayList.size();
        double partiailSum = 0;

        for (int i = 0; i < M-1; i++){
            partiailSum += inputArrayList.get(i);
        }

        for (int i = M-1; i < N; i++){
            partiailSum += inputArrayList.get(i);
            ref.add(partiailSum/M);
            partiailSum -= inputArrayList.get(i-M+1);
        }

        return ref;                             // 알고리즘 수행 시간 : M-1+(N-M+1) = N
    }
}
