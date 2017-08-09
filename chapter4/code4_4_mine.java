import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by masinogns on 2017. 8. 9..
 */
public class code4_4_mine extends code4_3_mine{
    public static void main(String[] args) {
       run();
    }

    @Override
    public void calculAverageMovingForM(ArrayList<Double> averageMovingOfM, ArrayList<Double> saveArrayList, int M) {
//        super.calculAverageMovingForM(averageMovingOfM, saveArrayList, M);
        int N = saveArrayList.size();
        double partiailSum = 0;

        // 알고리즘 수행 시간 : M-1+(N-M+1) = N
        for (int i = 0; i < M-1; i++){
            partiailSum += saveArrayList.get(i);
        }

        for (int i = M-1; i < N; i++){
            partiailSum += saveArrayList.get(i);
            averageMovingOfM.add(partiailSum/M);
            partiailSum -= saveArrayList.get(i-M+1);
        }

    }
}
