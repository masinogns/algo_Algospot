import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by masinogns on 2017. 8. 9..
 *
 * 다이어트 현황 파악 : 이동 평균 계산하기
 * N개의 측정치가 주어질 때 매달 M달 간의 이동 평균을 계산하는 프로그램
 * 각 위치에서 지난 M개 측정치의 합을 구하고 이를 M으로 나누기
 *
 */
public class code4_3_mine {
    ArrayList<Double> saveArrayList;
    ArrayList<Double> averageMovingOfM;

    public ArrayList<Double> getAverageMovingOfM() {
        return averageMovingOfM;
    }

    public code4_3_mine() {
        saveArrayList = new ArrayList<Double>();
        averageMovingOfM = new ArrayList<Double>();
    }

    public ArrayList<Double> getSaveArrayList() {
        return saveArrayList;
    }

    public void setSaveArrayList(ArrayList<Double> saveArrayList) {
        this.saveArrayList = saveArrayList;
    }

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        code4_3_mine application = new code4_3_mine();

        ArrayList<Double> inputArrayList = new ArrayList(Arrays.asList(9.3,8.1,7.7,4.4,1.1,6.4,4.4,7.2));
        int M = 2;

        application.setSaveArrayList(inputArrayList);
        application.calculAverageMovingForM(application.getAverageMovingOfM(), application.getSaveArrayList(), 2);
        application.resultAverageMoving(application.getAverageMovingOfM());
    }

    public void resultAverageMoving(ArrayList<Double> averageMovingOfM) {

        Iterator iterator = averageMovingOfM.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void calculAverageMovingForM(ArrayList<Double> averageMovingOfM, ArrayList<Double> saveArrayList, int M) {
        int N = saveArrayList.size();

        // 몇개를 묶을 수 있는지
        for (int i = M -1; i < N; i++){
            double average = 0;

            // M개씩 더해서 평균내는 로직
            for (int j = 0; j < M; j++){
                average += saveArrayList.get(i-j);
            }

            averageMovingOfM.add(average/M);
        }
    }
}
