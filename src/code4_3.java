import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 9..
 */
public class code4_3 {
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

        for (int i = M-1; i < N; i++){          // N - M + 1 번 수행
            //inputArrayList[i]까지의 이동 평균 값
            double partitailSum = 0;

            for (int j = 0; j < M; j++){        // M 번 수행
                partitailSum += inputArrayList.get(i-j);
            }
            ref.add(partitailSum/M);
        }
        return ref;                             // 총 (N-M+1) * M = N*M - M^2 + M 번 수행
    }
}
